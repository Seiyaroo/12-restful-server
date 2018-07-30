const HOMEPAGE = "http://localhost:8080/pokemon";
const form = document.getElementById("edit-pokemon");

deleteButton.addEventListener("click", (ev) => {
        fetch(form.action, {
        method: "DELETE"
    }).then(() => {
        window.location = HOMEPAGE;
    });
});

form.addEventListener("submit", (ev) => {
    ev.preventDefault();
    console.log(ev.target.method, ev.target.action);

    const inputs = ev.target.getElementsByTagName("input");
    const title = inputs[0].value;
    const genre = inputs[1].value;
    const releaseDate = inputs[2].value;
    const game = {title, genre, releaseDate};
    const body = JSON.stringify(game);

    fetch(ev.target.action, {
        method: ev.target.getAttribute("method"),
        body: body
    }).then(() => {
        window.location = HOMEPAGE;
    });
})