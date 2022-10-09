// функция чтения данных с форм
function readForm(){
name = document.querySelector("#userName").value
email = document.querySelector("#userEmail").value
phone = document.querySelector("#userPhone").value
}

// функция валидации поля Ваше имя
function validName (name) {
	checkName = /^[a-zA-Z]{2,20}$/;
if (checkName.test(name)){
	return true;
} else {
	return false;
}
};

// функция валидации поля Email
function validEmail (email){
	checkEmail = /([\w]{6,12})+@+gmail.com|ukr.net/;
	if(checkEmail.test(email)){
		return true;
	} else {
		return false;
	}
	};


// функция валидации поля Телефон
function validPhone (phone) {
	checkPhone = /^((380)+(50|63|66|67|68|91|92|93|97|96)+([0-9]){7})$/;
	if(checkPhone.test(phone)){
		return true;
	} else {
		return false;
	}
};

// функция проверяет, что вернули функции validEmail, validName, validPhone и выдает соответствующий алерт.
function validFunction() {
    if(validName(name) == true && validEmail(email) == true && validPhone(phone) == true)
  	{alert("Мы услышим вас")} else {alert("Мы вас не слышим")}
}

