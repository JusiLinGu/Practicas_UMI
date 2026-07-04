//Funciones incorporadas
//Obtener el largo de la cadena
let cadena1 = "Hola";
console.log(cadena1.length);
console.log(cadena1.charAt(3))

//No podemos modificar una cadena pues las cadenas son inmutables
//cadena1.charAt(0) = "X";
console.log(cadena1); //Aqui por ejemplo el resultado no cambia a Xola

//Lo que sí podemos hacer es asignar una nueva cadena
cadena1 = "Adios";
console.log(cadena1);

//Recorrer cada caracter
for (i = 0; i < cadena1.length; i++) {
    console.log(cadena1[i]);
}