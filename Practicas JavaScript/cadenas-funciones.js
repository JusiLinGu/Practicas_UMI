//Cadenas y funciones en JS
function cambiarValor (parametro) {
    parametro = "Adios";
    return parametro;
}

//Llamamos a la funcion
let argumento = "Hola";
console.log(`Antes de la funcion: ${argumento}`);
cambiarValor(argumento);
console.log(`Despues de la funcion: ${argumento}`);