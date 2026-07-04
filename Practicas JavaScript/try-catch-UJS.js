"use strict";
try {
    let x = 10;
    //mifuncion();
    throw 'mi error';
} catch (error) {
    console.log(error);
}
finally {
    console.log("Termina la revision de errores");
}
console.log("continuamos");