//Clases en JS
//No se pueden crear objetos antes de crear su clase
//Al trabajar con clases no se aplica el concepto de hoisting que significa primero llamar y luego definir como con las funciones

class Persona {
    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
        return this._nombre;
    }
}

//Todo ste codigo de abajo no puede ir antes de declarar la clase persona
//Con las funciones si se puede primero llamarla y lineas mas abajo declararla e inicializarla

//Creamos el objeto persona1
let persona1 = new Persona("Juan", "Perez");
//Llamamos al get para obtener el valor de nombre en persona1
console.log(persona1.nombre); //get nombre

//Llamamos al set para cambiar el valor de nombre en personaq
persona1.nombre = "Ismael"; //set nombre("Ismael")
console.log(persona1.nombre);