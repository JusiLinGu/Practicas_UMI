//Funciones en JS
let a = 10, b = 5;
imprimir(a);
console.log(`Resultado: ${sumar(a, b)}`);

let c = sumar(a, b);
console.log(c);

//Este es un procedimiento pues no regresa ningun valor (return) (funcion que no regresa un valor)
function imprimir(numero) {
    console.log(numero);
}

//Esta funcion si regresa un valor
function sumar(numero1, numero2) {
    let resultadoSuma = numero1 + numero2;
    return resultadoSuma;
}

function cambiarValor(parametro) {
    parametro/*[0]*/ = 50;
    return parametro;
}

let x = 100;
x = cambiarValor(x);
console.log(x);

let y = [200];
cambiarValor(y);
console.log(y);