let a = 5;
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
console.log("Количество итераций " + k);