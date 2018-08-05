const HOMEPAGE = "http://localhost:8080/pokemonz";
const form = document.getElementById("edit-pokemon");
const deleteButton = document.getElementById("delete-pokemon");

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
    const name = inputs[0].value;
    const type = inputs[1].value;
    const number = inputs[2].value;
    const pokemon = {name, type, number};
    const body = JSON.stringify(pokemon);

    fetch(ev.target.action, {
        method: ev.target.getAttribute("method"),
        body: body
    }).then(() => {
        window.location = HOMEPAGE;
    });
})