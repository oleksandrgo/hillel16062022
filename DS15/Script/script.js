/*let a = 5;
let b = 5;
if (a%b===0) {
	console.log("Делится " + a/b);
} else {
	console.log("Делится с остатком " + a%b);
}


function drawTriangle(c,d){
		let i = 0;
		let p = d;
		while(i<c){
		console.log(p);
		i++;
		p=p+d;
		}
	}


drawTriangle(7,"*");

for (let x = 0; x <= 100; x++){
	if (x%2===0) {
		continue;
	}
	console.log(x);
}

let n = 1000;
let k = 0;
do {
n = n/2;
k++;
}
while (n>=50);
console.log("Получится число " + n);
console.log("Количество итераций " + k);*/

let name = document.querySelector('#name');
let phone = document.querySelector('#phone');
let email = document.querySelector('#email');

let btn = document.querySelector(".btn");
btn.addEventListener('click',showAlert);

let re1 = /^[a-zA-Z]{2,20}$/;
let re3 = /^[\w]{6,12}(@gmail\.com|@ukr\.net)$/;
let re2 = /^380[50|63|66|67|68|91|92|93|97|96][0-9]{7}$/;

function showAlert(){
	if (re1.test(name.value)&&re2.test(phone.value)&&re3.test(email.value)) {
		alert("Мы услышим вас");
	}else{
		alert("Мы вас не слышим");
	}
}

