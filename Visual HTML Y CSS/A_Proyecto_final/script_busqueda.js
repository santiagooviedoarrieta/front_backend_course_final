function search() {
    const search_text = document.querySelector(".searchInput").value.toLowerCase();
    const cards = document.querySelectorAll(".card");
    cards.forEach(card => {
        const cardTitle = card.querySelector("h3").textContent.toLowerCase();
        if (cardTitle.includes(search_text)) {
            card.style.display = "block";

        } else {
            card.style.display = "none";
        }
    });
}