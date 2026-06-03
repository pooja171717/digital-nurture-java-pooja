

function validatePhone() {
    let phone = document.getElementById("phone").value;
    let msg = document.getElementById("phoneMsg");

    let pattern = /^[0-9]{10}$/;

    if (pattern.test(phone)) {
        msg.innerHTML = "Valid Number";
        msg.style.color = "green";
    } else {
        msg.innerHTML = "Enter 10-digit number";
        msg.style.color = "red";
    }
}



function showFee() {
    let fee = document.getElementById("eventType").value;

    if (fee !== "") {
        document.getElementById("feeDisplay").innerHTML =
            "Event Fee: ₹" + fee;
    } else {
        document.getElementById("feeDisplay").innerHTML = "";
    }
}



function submitFeedback() {
    alert("Feedback Submitted Successfully!");
}



function enlargeImage() {
    let img = document.getElementById("eventImage");

    if (img.style.width === "400px") {
        img.style.width = "200px";
    } else {
        img.style.width = "400px";
    }
}



function countCharacters() {
    let text = document.getElementById("feedback").value;

    document.getElementById("charCount").innerHTML =
        text.length;
}