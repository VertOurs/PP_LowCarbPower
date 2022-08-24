let inputEmail = document.querySelector('#email');
let errorEmail = document.querySelector('#errorEmail');

let inputKWh = document.querySelector('#kwh')
let errorKWh = document.querySelector('#errorKWh');

let formulate = document.querySelector('#formulaire');

errorEmail.style.display = "none";
errorKWh.style.display = "none";
formulate.addEventListener('submit', (e) => {getEstimation()});

async function getEstimation() {
  let url = 'http://localhost:8080/api/quotingService?nbKWh=' 
  + inputKWh 
  + '&email=' 
  + inputEmail;

const quotingRequest = await fetch(url, {method: 'GET'});

if (!quotingRequest.ok) {
  alert('sorry the service is not currently available')
} else {
  let estimation = await quotingRequest.json();
  console.log(estimation);
  document.querySelector('#estimation').textContent = estimation.price;
}
document.querySelector('#estimation').prepend(instruction);
} 

//verif du kiloWatt
inputKWh.addEventListener('keyup', () => {
  if(isNaN(inputKWh.value)) {
    errorKWh.style.display = "inline";
    inputKWh.style.borderColor = "red";
  }
  else {
    errorKWh.style.display = "none";
    inputKWh.style.borderColor = "silver";
  }
});

//verif Email
inputEmail.addEventListener('change', () => {
  validateEmail(inputEmail);
});

function validateEmail(inputText) {
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

if (!inputText.value.match(mailformat) || inputText.value == '') {
  errorEmail.style.display = "inline";
  inputEmail.style.borderColor = "red";
} else {
  errorEmail.style.display = "none";
  inputEmail.style.borderColor = "silver";
}
}