// Start

alert('LetsStart');
console.log('LetsStart');



// Task 2

let size = prompt('Task 1:', ['Enter size of triange']);
let symbol = prompt('Task 1, part 2:', ['Enter any symbol: @, $, etc']); 
var space = " "
function makeLine(size, symbol) {
  var line = "";
  for (var j = 1; j <= size; j++) {
    for (var i = 0; i < j; i++) { 
      line += symbol ; 
    }
    line += '\n'; 
  }
  return line;
}
console.log(makeLine(size, symbol));



// Task 2

let first = prompt('Task 2:', ['Enter first number']);
let second = prompt('Task 2:', ['Enter second number']); 
let rest = first % second;

if (rest === 0) {
	console.log('делится нацело');
} else {
	console.log('делится с остатком ' + rest);
}



// Task 3

alert('Task 3');
console.log('Task 3');
for (var i = 0; i <= 100; i++) {
  if(i % 2 == 1) {
	console.log(i + ' ');
  }
}



// Task 4

for (let n = 1000, num = 0; n > 50; num++) {

n /= 2;
    alert( n );
	console.log(n + ' ');

}



// Task 4 part 2

function foo(a){
  let n = 0;
  if(a < 50 || a > 1000 || a % 2 !== 0){
    alert("Число должно быть четным и от 50 до 1000");
    return false;
  }
  while(a >= 50){
    a = a/2;
    n++;
  }
  return [a, n];
}
 
let a = prompt("Введите любое четное число (от 50 до 1000)");
let result = foo(a);
if(result !== false);
console.log('Количество итераций: ' + i, ', получилось число: ' + result[0]);
