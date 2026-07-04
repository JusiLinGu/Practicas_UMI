//Alcance de variables en JS
let variableGlobal = 5;
//Modificar el valor
variableGlobal = 10;

//Definir funcion
function miFuncion(variableLocal) {
    console.log(variableLocal);
    //Modificamos la variable global
    variableGlobal = 20;
    //No podemos redefinir una variable global con let
}

//Llamamos a la funcion
miFuncion(variableGlobal);