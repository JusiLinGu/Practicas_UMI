//Cadena a numero
let a = "10", b = "20";
//Si son cadenas se concatenan NO SUMAN
console.log(`${a + b}`);

//Convertir a numeros
a = parseInt(a);
b = parseInt(b);
let suma = a + b; //Si no queremos permanente los datos en int podemos usar let suma = parseInt(a) + parseInt(b);
console.log(suma);

//Numero a cadenas
a = a.toString();
b = b.toString();
let concatenar = a + b; //Si no queremos permanente los datos en String podemos usar let suma = a.toString() + b.toString();
console.log(concatenar);