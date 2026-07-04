//Arreglos
let numerosArreglo = [];

//Modificar los valores
numerosArreglo[0] = 13;
numerosArreglo[1] = 21;
numerosArreglo[4] = "hola";

//Leer valores
console.log(`Elemento 1 - [0]: ${numerosArreglo[0]}`);
console.log(`Elemento 3 - [2]: ${numerosArreglo[2]}`);
console.log(`Elemento 5 - [4]: ${numerosArreglo[4]}`);

//Ejemplo sintaxis simplificada de arreglos
let numerosArreglo2 = [100, 200, 300, 400, 500];

console.log(`Elemento 1 - [0]: ${numerosArreglo2[0]}`);
console.log(`Elemento 3 - [2]: ${numerosArreglo2[2]}`);
console.log(`Elemento 5 - [4]: ${numerosArreglo2[4]}`);

//Iterar arreglos en javascript
let numerosArreglo3 = [13, 21, 0, 0, 62];
for (let i = 0; i < numerosArreglo3.length; i++) {
    console.log(`numerosArreglo[${i}] = ${numerosArreglo3[i]}`);
}