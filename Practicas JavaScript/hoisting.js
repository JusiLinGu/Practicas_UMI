//Hoisting (podemos usar una variable y despues declararla)
//'use estrict' modo estricto desactiva el uso de Hoisting
//var x; // 1.- Declarar la variable
x = 10; // 2.- Inicializamos la variable
console.log(x);
var x;
//La variable puede utilizarse antes de ser declarada

//Lo anterior (hoisting) no aplica con let pues no se puede usar antes de ser declarada la variable
y =10;
console.log(y);
let y;