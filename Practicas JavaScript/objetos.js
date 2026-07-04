//Objetos en JS
let persona = {
    nombre: 'Juan',
    apellido: 'Perez',
    email: 'jperez@mail.com',
    edad: 28,
    //Metodos en objetos
    nombreCompleto: function() {
        return this.nombre + " " + this.apellido;
    }
}

console.log(persona.nombre);
console.log(persona.edad);
console.log(persona.apellido);

console.log(persona);

//Se utilizan parentesis al final de nombreCompleto porque se esta llamando a una funcion
console.log(persona.nombreCompleto());

//Crear un nuevo objeto usando New
let persona2 = new Object();
persona2.nombre = "Carlos";
persona2.direccion = "Saturno 15";
persona2.telefono = "7772958073";


//Ejemplos de acceder a las propiedades de los objetos
console.log(persona.nombre);
console.log(persona["nombre"]);

//for in
for (nombreAtributos in persona) {
    console.log(nombreAtributos);
    console.log(persona[nombreAtributos]);
}