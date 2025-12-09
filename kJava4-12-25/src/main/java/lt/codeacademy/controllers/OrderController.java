package lt.codeacademy.controllers;

import lt.codeacademy.dto.OrderDTO;
import lt.codeacademy.entities.*;
import lt.codeacademy.services.*;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/orders")
public class OrderController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @Autowired
    OrderService orderService;

    @Autowired
    BasketService basketService;

    @Autowired
    UserService userService;

    // -------------------------------
    // SHOW ORDERS (ORIGINAL + STATUS)
    // -------------------------------
    @GetMapping("/index")
    public String showOrders(Model model) {
        List<Order> ordersList = orderService.getAll();
        List<OrderDTO> ordersDTOList = new ArrayList<OrderDTO>();

        String authority = SecurityContextHolder.getContext().getAuthentication().getAuthorities().toString();
        long userId = userService.findIdByUserName(SecurityContextHolder.getContext().getAuthentication().getName());

        // ADMIN sees all orders
        if (authority.equals("[ADMIN]")) {
            for (Order ord : ordersList) {
                ordersDTOList.add(
                        new OrderDTO(
                                ord,
                                userService.findById(ord.getCustomerID()).getUsername(),
                                ord.getStatus() != null ? ord.getStatus() : "PENDING"
                        )
                );
            }
        }
        // USER sees only his orders
        else {
            for (Order ord : ordersList) {
                if (ord.getCustomerID() == userId) {
                    ordersDTOList.add(
                            new OrderDTO(
                                    ord,
                                    userService.findById(ord.getCustomerID()).getUsername(),
                                    ord.getStatus() != null ? ord.getStatus() : "PENDING"
                            )
                    );
                }
            }
        }

        model.addAttribute("ordersDTO", ordersDTOList);
        return "/orders/index";
    }

    // -------------------------------
    // DELETE ORDER (NO CHANGE)
    // -------------------------------
    @GetMapping("/delete/{id}")
    public String deleteOrder(@PathVariable("id") int orderID, Model model) {
        List<Basket> basketList = basketService.getAll();

        for (Basket bsk : basketList)
            if (bsk.getOrder_id() == orderID) {
                basketService.delete(bsk);
                logger.warn("Basket with Order ID: " + orderID + " is DELETED!");
            }

        orderService.deleteById(orderID);
        logger.warn("Order with Order ID: " + orderID + " is DELETED!");

        return "redirect:/orders/index";
    }

    // -------------------------------
    // ⭐ ADMIN: ACCEPT ORDER (NEW)
    // -------------------------------
    @PostMapping("/accept/{id}")
    public String acceptOrder(@PathVariable int id) {
        orderService.updateStatus(id, "ACCEPTED");
        return "redirect:/orders/index";
    }

    // -------------------------------
    // ⭐ ADMIN: REJECT ORDER (NEW)
    // -------------------------------
    @PostMapping("/reject/{id}")
    public String rejectOrder(@PathVariable int id) {
        orderService.updateStatus(id, "REJECTED");
        return "redirect:/orders/index";
    }
}
