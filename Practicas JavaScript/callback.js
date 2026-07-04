miFuncion2();
miFuncion();

function miFuncion() {
    console.log('Funcion 1');
}

function miFuncion2() {
    console.log('Funcion 2');
}

//funcion de tipo callback
function imprimir(mensaje) {
    console.log(mensaje);
}

function sumar(op1, op2, funcionCallback) {
    let res = op1 + op2;
    funcionCallback(`Resultado: ${res}`);
}

sumar(5, 3, imprimir);

//Llamads asincronas con uso de setTimeout
function miFuncionCallback() {
    console.log('Saludo asincrono despues de 3 seg');
}

setTimeout(miFuncionCallback, 3000); //Despues de 3 seg
setTimeout(function(){console.log('Saludo asincrono 2')}, 4000)
setTimeout(() => console.log('Saludo asincrono 3'), 5000);