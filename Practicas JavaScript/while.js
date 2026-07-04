//Ciclo while
//Imprimir valores del 0 al 5
let contador = 0, repeticiones = 5;

while (contador <= repeticiones) {
    console.log(contador++);
    //contador++;
}

//Ciclo do-while
//Imprimir los valores del 0 a 5
contador = 0;
do {
    console.log(contador++);
} while (contador <= repeticiones);