document.addEventListener('DOMContentLoaded', () => {
    const elementosCarousel = document.querySelectorAll('.carousel');
    M.Carousel.init(elementosCarousel , {
        duration: 150,
        dist: -90,
        shift: 5,
        padding: 1,
        numVisible: 3,
        indicators: true,
        noWrap: false,
    });
});