const surveyForm = document.getElementById("surveyForm");
const popup = document.getElementById("popup");

surveyForm.addEventListener("submit", function (event) {
    event.preventDefault();
    popup.style.display = "block";
    surveyForm.reset();
});

function closePopup() {
    popup.style.display = "none";
}

document.getElementById("resetButton").addEventListener("click", function () {
    surveyForm.reset();
});
