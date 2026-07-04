//Funciones recursivas
//Imprimir 3, 2, 1
function funcionRecursiva(numero) {
    //Caso base
    if (numero == 1) {
        console.log(numero);
    } else {
        console.log(numero);
        funcionRecursiva(numero - 1);
    }
}

//LLamamos a la funcion recursiva
funcionRecursiva(3);