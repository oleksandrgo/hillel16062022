  function validate() {
            var name = document.getElementById("name");
            var phone = document.getElementById("phone");
            var email = document.getElementById("email");

            var nameReg = new RegExp("^[A-z][a-z]{1,19}$");
            var phoneReg = new RegExp("^380(50|63|66|67|68|91|92|93|97|96)[0-9]{7}$");
            var emailReg = new RegExp("^[a-z]{6,12}@(gmail.com|ukr.net)$")


            if (!name.value.match(nameReg)) {
                name.style.border = "2px solid red";
                alert('Мы не услышим вас');
                return false;
            }
            name.style.border = "0";

            if (!email.value.match(emailReg)) {
                email.style.border = "2px solid red";
                alert('Мы не услышим вас');
                return false;
            }
            email.style.border = "0";
            
            if (!phone.value.match(phoneReg)) {
                phone.style.border = "2px solid red";
                alert('Мы не услышим вас');
                return false;
            }
            phone.style.border = "0";

            alert('Мы услышим вас');
        }