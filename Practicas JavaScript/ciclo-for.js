//Ciclo for
//for (declaracion variables (contadores); condicion a evaluar; incremento de contadores)
let repeticiones = 5;
for (let i = 0; i <= repeticiones; i++) {
    console.log(i);
}

//Ejercicio imprimir los primeros 10 numeros de 3 en 3
let max = 10;
for (let i = 1; i <= 10; i += 3) {
    console.log(i);
}

for (let i = 1; i >= -10; i -= 3) {
    console.log(i);
}

//Ejercicio propuesto suma acumulativa 1+2+3+4+5
let limiteSuma = 5;
let resultado = 0;

for (let i = 1; i <= limiteSuma; i++) {
    console.log(`${resultado} + ${i}`);
    console.log(`${resultado += i}`);
}
console.log("El resultado de la suma acumulativa es: ", resultado);