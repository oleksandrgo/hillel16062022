alert('Hellllo');


//№1
/*let a = 15;
let b = 5;
if(a % b === 0){
 console.log ("Ділиться, результат ділення:" + (a/b));
} 
else {
 console.log ("Ділиться з залишком:" + (a%b));
}
*/

/*let a = 12;
let b = 5;
if(a % b === 0){
 console.log ("Ділиться, результат ділення :" + a/b);
} 
else {
 console.log ("Ділиться з залишком:" + a%b);
}*/



//№2
let lines = 7;
let str = " ";
let symbol = "*";

function drawTriangle (lines,symbol) {
 for (let i = 0; i < lines; i++) {
  str += symbol;
  console.log(str);}
}

drawTriangle (7,'*');


//№3
/*for (let x=0; x<100; x++){
if (x%2 === 0){
continue;}
console.log (x);
}*/


//№4 
/*for(n = 1000, y = 0; n >= 50; n/2, y++){
  n /= 2;
 }
 console.log(n);
 console.log(y);*/


