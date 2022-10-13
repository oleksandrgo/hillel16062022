//console.log ('Я-JavaScript! ДЗ16');

function value() {
            let name = document.getElementById("name");
            let phonenumber = document.getElementById("phonenumber");
            let userEmail = document.getElementById("userEmail");

            let nameReg = new RegExp("^[A-z][a-z]{2,20}$");
            let phonenumberReg = new RegExp("^380(50|63|66|67|68|91|92|93|97|96)[0-9]{7}$");
            let userEmailReg = new RegExp("^[A-z][a-z]{6,12}@(gmail.com|ukr.net)$");

            if (!name.value.match(nameReg)) {
                name.style.border = "2px solid red"
                alert('Мы не услышим вас');
                return false;
            }
            name.style.border = "0";

            if (!userEmail.value.match(userEmailReg)) {
                userEmail.style.border = "2px solid red";
                alert('Мы не услышим вас');
                return false;
            }
            userEmail.style.border = "0";
            
            if (!phonenumber.value.match(phonenumberReg)) {
                phonenumber.style.border = "2px solid red";
                alert('Мы не услышим вас');
                return false;
            }
            phonenumber.style.border = "0";

            alert('Мы услышим вас');
       }