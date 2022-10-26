console.log ('Я-JavaScript! ДЗ15');

//1.

let a = 35;
let b = 5;
if(a % b == 0 && b !=0){
	console.log ("Ділиться, результат ділення:" + (a/b));
} else {
	console.log ("Ділиться з залишком:" + (a%b));
}


/*let a = 37;
let b = 5;
if(a % b == 0 && b !=0){
	console.log ("Ділиться, результат ділення :" + (a/b));
} else {
	console.log ("Ділиться з залишком:" + (a%b));
}*/

//варіант 2:

/*let a = 35;
let b = 5;
let c = a%b;
if(c !=0){
	console.log("Ділиться з залишком :" + c);
} else {
	console.log("Ділиться, результат ділення :" + (a/b));
}*/



/*let a = 37;
let b = 5;
let c = a%b;
if(c !=0){
	console.log("Ділиться з залишком :" + c);
} else {
	console.log("Ділиться, результат ділення :" + (a/b));
}*/


//2.

let lines = 5;
let str = " ";
let symbol = "*";

function drawTriangle (lines,symbol) {
	for (let d = 0; d < lines; d++) {
  str += symbol;
  console.log(str);}
}

drawTriangle (5,'*');

//перевірка:
// drawTriangle (6,'$');

//3.

for (let i = 0; i <= 100; i++) {
  if (i % 2 !== 0) {
    console.log(i);
  }
}


//4.

for(n = 1000, y = 0; n >= 50; n/2, y++){
		n /= 2;
	}
	console.log(n);
	console.log(y);
	






