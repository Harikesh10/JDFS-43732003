// Smooth scroll
document.querySelectorAll('.nav-links a').forEach(link => {
  link.addEventListener('click', e => {
    e.preventDefault();
    const targetId = link.getAttribute('href').substring(1);
    const targetElement = document.getElementById(targetId);
    targetElement.scrollIntoView({ behavior: 'smooth' });

    // Close mobile menu after click
    document.getElementById('nav-links').classList.remove('active');
  });
});

// Toggle navbar menu (hamburger)
const menuToggle = document.getElementById('menu-toggle');
const navLinks = document.getElementById('nav-links');

menuToggle.addEventListener('click', () => {
  navLinks.classList.toggle('active');
});

// Contact form demo
document.querySelector('.contact-form').addEventListener('submit', e => {
  e.preventDefault();
  alert('Thanks for your message! I’ll get back to you soon.');
  e.target.reset();
});
