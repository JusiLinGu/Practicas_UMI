let miPromesa = new Promise((resolved, rejected) => {
    let expresion = true;
    if(expresion) {
        resolved('Resolvió Correcto');
    } else {
        rejected('Se produjo un error');
    }
});

/*miPromesa.then(
    valor => console.log('valor'),
    error => console.log(error)
);*/

/*miPromesa
    .then(valor => console.log(valor)
    ).catch(error => console.log(error)
);*/

let promesa = new Promise((resolved) => {
    console.log('inicio promesa');
    setTimeout( () => resolved('Saludos con promesa y timeout'), 3000);
    console.log('fin promesa');
});

//promesa.then(valor => console.log(valor));

//Async indica que una funcion regresara una promesa
async function miFuncionConPromesa() {
    return 'saludos con promesa y async';
}

//miFuncionConPromesa().then(valor => console.log(valor));

//Async con await
async function funcionConPromesaYAwait() {
    let miPromesa = new Promise(resolved => {
        resolved('Promesa con await');
    });

    //Await solo se puede usar dentro de una funcion declarada con async
    console.log(await miPromesa);
}

//funcionConPromesaYAwait();

//Promesas, await, async, setTimeout
async function funcionConPromesaAwaitYTimeout() {
    console.log('Inicio funcion');
    let miPromesa = new Promise(resolved => {
        setTimeout(() => resolved('promesa con await y timeout'), 3000);
    });

    console.log(await miPromesa);
    //Espera a que await obtenga una respuesta de la promesa para ejecutarse
    console.log('Fin funcion');
}

funcionConPromesaAwaitYTimeout();