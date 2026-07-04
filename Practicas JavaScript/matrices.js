//Matrices
//Declaracion de una matriz
let matriz = [[], []];

//Modificar los valores de la matriz
//El primer [] es el numero del renglon y el [] es el numero de columna
//Renglon 0
matriz[0][0] = 100;
matriz[0][1] = 200;
matriz[0][2] = 300;

//Renglon 1
matriz[1][0] = 400;
matriz[1][1] = 500;
matriz[1][2] = 600;

//Sintaxis simplificada de una matriz
let matriz2 = [[100, 200, 300], [400, 500, 600, 700, 800]];
//Leer valores
console.log(`Elemento[0][1] = ${matriz2[0][1]}`);
console.log(`Elemento[0][1] = ${matriz2[1][2]}`);

//Iterar una matriz

//No. renglones
console.log(matriz.length);
//No. columnas (deoende del renglon seleccionado)
console.log(matriz2[0].length);
console.log(matriz2[1].length);


//Recorrer renglones
for (let renglon = 0; renglon < matriz2.length; renglon++) {
    //Recorrer columnas
    for (let columna = 0; columna < matriz2[renglon].length; columna++) {
        console.log(matriz2[renglon][columna]);
    }
}