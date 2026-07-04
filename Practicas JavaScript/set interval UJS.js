//Setinterval
let reloj = () => {
    let fecha = new Date();
    console.log(`Hora: ${fecha.getHours()}:${fecha.getMinutes()}:${fecha.getSeconds()}`);
}

setInterval(reloj, 1000); //1 Segundo