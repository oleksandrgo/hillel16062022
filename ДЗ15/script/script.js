

var a = 14;
var b = 4;
var c = a%b;
if (c===0) {
	console.log('Делится без остатка');
}else {
	console.log('Делится с остатком ' + c);
}






function drawTriangle (line, star) {
	var str = '';
	for (var i=0; i<line; i++) {
		str += star;
		console.log(str);
	}
}

drawTriangle(12,'h');






for (let i=1; i<100; i++) {
	if (i %2 ===0) {
		continue;
	}
console.log(''+ i);
}








var n=1000;
var i=0;
while (n>50) {
	n = n/2;
	i += 1;
}
console.log(n);
console.log(i);







