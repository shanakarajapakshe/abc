const form = document.getElementById("bookingForm");

form.addEventListener("submit", async (e) => {
  e.preventDefault();

  const name = document.getElementById("name").value;
  const pickup = document.getElementById("pickup").value;
  const destination = document.getElementById("destination").value;

  const response = await fetch("http://localhost:8080/bookings", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ name, pickup, destination }),
  });

  if (response.ok) {
    alert("Booking successful!");
  } else {
    alert("Error booking the cab.");
  }
});
