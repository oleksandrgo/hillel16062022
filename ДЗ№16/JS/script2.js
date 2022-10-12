function feedBack(){
name = document.querySelector("#nameUser").value
email = document.querySelector("#emailUser").value
phone = document.querySelector("#phoneUser").value
};

function userName (name) {
	checkName = /^[a-zA-Z]{2,20}$/;
if (checkName.test(name)){
	return true;
}	else {
	return false;
}
};


function userEmail (email){
	checkEmail = /([\w]{6,12})+@+gmail.com|ukr.net/;
	if(checkEmail.test(email)){
		return true;
	}	else {
		return false;
	}
	};


function userPhone (phone) {
	checkPhone = /^((380)+(50|63|66|67|68|91|92|93|97|96)+([0-9]){7})$/;
	if(checkPhone.test(phone)){
		return true;
	}	else {
		return false;
	}
};


function checkAll() {
	if(userName(name) && userEmail(email) && userPhone(phone))
	{alert("Мы услышали вас")} else {alert("Мы вас не слышим")}
};







 













