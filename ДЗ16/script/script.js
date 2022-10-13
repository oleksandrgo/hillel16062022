console.log('Добро пожаловать');

function formValidation() 
{
name = document.querySelector("#userName").value;
email = document.querySelector("#userEmail").value;
phone = document.querySelector("#userPhone").value;
}

function validateName(name) 
{
username = /^[a-zA-Z]{2,20}$/;
if(username.test(name))
{
return true;
}
else
{
return false;
}};

//console.log(validateName(name));

function validateEmail(email)
{
myMail = /([\w]{6,12})+(@gmail.com|@ukr.net)/;
if(myMail.test(email))
{
return true;
}
else
{
return false;
}};


function validatePhone(phone)
{
myPhone = /^((380)+(50|63|66|67|68|91|92|93|97|96)+([0-9]){7})$/;

if(myPhone.test(phone))
{
return true;
}
else
{
return false;
}};

function mainValidation()
{
if (validateName(name) && validateEmail(email) && validatePhone(phone)) {
		alert("Мы услышим вас")
	} else {
alert( "Мы вас не слышим" )
}};