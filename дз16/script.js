/*
 380 + 50|63|66|67|68|91|92|93|97| 96 + 7 digits
 
 6 -12 символов(англиские) до @ и потом почта gmail.com или ukr.net 
 
 В итоге мы должны получить alert c сообщением "Мы услышим вас" или "Мы вас не слышим"
 
/^\+?3?8?(0(50|63|66|67|68|91|92|93|97|96)\d{7})$/
*/

function validateInput(input_id, output_id, pattern_text, valid_message, invalid_message) {
  var form = document.getElementById("form");
  var data = document.getElementById(input_id).value;
  var result = document.getElementById(output_id);
  if (data.match(pattern_text)) {
    form.classList.add("valid");
    form.classList.remove("invalid");
    result.innerHTML = valid_message;
    result.style.color = "#00ff00";
  } else {
    form.classList.remove("valid");
    form.classList.add("invalid");
    result.innerHTML = invalid_message;
    result.style.color = "#ff0000";
  }
  if (data == "") {
    form.classList.remove("valid");
    form.classList.remove("invalid");
    result.innerHTML = "";
    result.style.color = "#00ff00";
  }
}

function validationEmail() {
  var pattern = /^[\w.\-]{6,12}@(gmail\.com|ukr\.net)$/;
  validateInput("email", "text", pattern, "Ваша почта подходит.", "Мы Вас не слышим - Пожалуйста введите правильную почту");
}

function validationTel() {
  var pattern = /^((38)(0(50|63|66|67|68|91|92|93|97|96)\d{3})\d{3})$/; // "+?3?8?(0(50|63|66|67|68|91|92|93|97|96)\d{7})";
  validateInput("tel", "text1", pattern, "Телефон подходит.", "Мы Вас не слышим - Пожалуйста введите правильный телефон.");
}

function validationName() {
  var pattern = "[a-zA-Z]*";
  validateInput("name", "text2", pattern, "Имя подходит.", "Мы Вас не слышим - Пожалуйста введите правильное имя");
}


function validateForm(form) {

    var tel = form.tel;
    var email = form.email;

    if (isNotEmpty(tel)) {
	    if(isNotEmpty(email)) {
            return true;
            }
	            }
    return false;
    }


function isNotEmpty(field) {

    var fieldData = field.value;

    if (validationTel() || validationEmail()) {
	alert(('Мы не услышим вас...'));
    console.log('Мы не услышим вас...');
        return false;
    } else {
	        alert(('Мы услышим вас...'));
			console.log('Мы услышим вас...'); 
        return true; //Submits form
    }
}




function valid(){
	
    if ((validationEmail()) && (validationTel())){   
      alert(('Мы услышим вас'));
      console.log('Мы услышим вас'); 
    } else {
      alert(('Мы не услышим вас'));
      console.log('Мы не услышим вас');
    }
}	

