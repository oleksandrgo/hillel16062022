let form = document.querySelector(".seven"),
formInputs = document.querySelectorAll(".a"),
inputEmail = document.querySelector(".a email"),
inputTel = document.querySelector(".a tel");

function validateEmail(email) {
   let re = /"^[A-z][a-z]{2,20}$"/
   return re.test(String(email).tolowerCase());
}

form.onsubmit = function () {
   let emailVal = inputEmail.value,
   telVal = inputTel.value;
   emptyInputs = Array.form(formInputs).filter(input => input.value === '');
   
   formInputs.forEach(function (input) {
if (input.value === '') {
   input.classList.add("error");
   console.log("input not filled");
} else {
   input.classList.remove("error");
}
});

if(emptyInputs.lenght !==0) {
   console.log('inputs not filled');
   return false;
}

if (!validateEmail(emailVal)) {
   console.log('email not valid');
   inputEmail.classList.add('error');
   return false;
} else {
   inputEmail.classList.remove('error');
}
}
