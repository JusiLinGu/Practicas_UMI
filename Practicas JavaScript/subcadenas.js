//Subcadenas
let cadena3 = "Hola Mundo";
//substring(indice_inicion, indice_final)
//No se incluye el caracter ubicado en la posicion 4 (Que en este caso era un espacio)
let cadena1 = cadena3.substring(0, 4);
let cadena2 = cadena3.substring(5); //Del indice 5 al final de la cadena (Tambien puede ser substring(5, 10))
console.log(cadena1);
console.log(cadena2);

//Concatenacion de cadenas
cadena3 = "";
cadena3 = cadena1 + " " + cadena2;
console.log(cadena3);

//String interpolation
let cadena4 = `${cadena1} ${cadena2}`;
console.log(cadena4);