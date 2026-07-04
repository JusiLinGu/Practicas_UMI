//Sentencia if
let miNumero = '10';

//Revisar si es positivo
if (miNumero > 0) {
    console.log("El numero es positivo");
} else if (miNumero < 0) {
    console.log("El numero es negativo");
} else if (miNumero == 0) {
    console.log("El numero es cero");
} else {
    console.log("La variable no es un número");
}

//Operador ternario (condicion) ? true : false
(miNumero > 0) ? console.log("El numero es positivo") : console.log("El numero es negativo");

//Ejercicio mayoria de edad
const MAYORIA_EDAD = 18;
let edadPersona = 30;

//Revisar que la persona sea mayor de edad
(edadPersona >= MAYORIA_EDAD) ? console.log(`La persona con ${edadPersona} años es mayor de edad`)
: console.log(`La persona con ${edadPersona} años es menor de edad`);