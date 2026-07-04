//Operadores logicos
let a = true;
let b = false;
console.log(a);
console.log(b);

//Operador logico && (AND)
//Regresa true solo si se cumplen ambas condiciones
console.log(`${a} && ${b} -> ${a && b}`);
console.log(`${a} && ${a} -> ${a && a}`);

//Operador logico || (OR)
//Regresa true mientras que una de las condiciones se cumpla
console.log(`${a} || ${b} -> ${a || b}`);
console.log(`${b} || ${b} -> ${b || b}`);

//Operador ! (NOT)
//Solo invierte el valor original
console.log(`!${a} -> ${!a}`)
console.log(`!${b} -> ${!b}`)

//Ejercicio valor dentro del rango
let min = 0, max = 5;
let dato = 3;

let dentroRango = dato >= min && dato <= max;
console.log(`${dato} >= ${min} && ${dato} <= ${max}? -> ${dentroRango}`);
console.log("El valor ", dato, " esta dentro del rango");