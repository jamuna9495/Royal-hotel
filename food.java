// Click panna table booking alert vara simple code
document.querySelector('.book-btn').addEventListener('click', function() {
    alert('Thank you for choosing Grand Royal! Our executive will call you for New Year table reservation.');
});

// Scroll pannum pothu nav bar background change aga
window.addEventListener('scroll', function() {
    let nav = document.querySelector('nav');
    if (window.scrollY > 50) {
        nav.style.background = '#000';
    } else {
        nav.style.background = 'rgba(0,0,0,0.8)';
    }
});
