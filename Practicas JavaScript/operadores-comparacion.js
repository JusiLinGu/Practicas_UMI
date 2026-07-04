//Operadores relacionales o de comparacion
let a = 5;
let b = '5';
console.log(a);
console.log(b);

//Operador igualdad ==
//Solo compara valores y hace una conversion de ser necesario
console.log("a == b ->", a == b);

//Operador igualdad estricto o exacto
//Se compara el valor y el tipo de dato
// 5 == 5 -> TRUE, number == string -> FALSE
//Se deben cumplir ambas condiciones para devolver un true
console.log("a === b ->", a === b);

//String interpolation
//Convertimos el valor de una variable a texto y se concatena a nuestra cadena
console.log(`${a} == ${b} -> ${a == b}`);
console.log(`${a} == ${b}? ${a == b} && ${typeof a} == ${typeof b}? ${typeof a == typeof b}
    -> a === b? ${a === b}`);

//Operador distintos
//Compara valor y convierte el tipo de dato si es necesario
console.log(`${a} != ${b}? ${a != b}`);

//Operador distinto exacto
//Compara valor y tipo de dato
console.log(`${a} !== ${b}? ${a !== b}`);

//Operador menor que
console.log(`${a} < ${b}? ${a < b}`);

//Operador menor o igual que
console.log(`${a} <= ${b}? ${a <= b}`);

//Operador mayor que
console.log(`${a} > ${b}? ${a > b}`);

//Operador mayor o igual que
console.log(`${a} >= ${b}? ${a >= b}`);