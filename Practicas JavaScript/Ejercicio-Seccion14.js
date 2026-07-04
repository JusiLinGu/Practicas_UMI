class Persona {
    static contadorPersonas = 0;

    constructor(nombre, apellido, edad) {
        this._idPersona = ++Persona.contadorPersonas;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    get idPersona() {
        return this._idPersona;
        //NO HABRA METODO SET
        //Debido a que el id no puede modificarse una vez creado
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get apellido() {
        return this._apellido;
    }

    set apellido(apellido) {
        this._apellido = apellido;
    }

    get edad() {
        return this._edad;
    }

    set edad(edad) {
        this._edad = edad;
    }

    datos() {
        return this._idPersona + ", " + this._nombre + " " + this._apellido
        + ", "  + this._edad;
    }

    toString() {
        return this.datos();
    }
}

class Empleado extends Persona {
    static _contadorEmpleados = 0;

    constructor(nombre, apellido, edad, sueldo) {
        super(nombre, apellido, edad)
        this._idEmpleado = ++Empleado._contadorEmpleados;
        this._sueldo = sueldo;
    }

    get idEmpleado() {
        return this._idEmpleado;
    }

    get sueldo() {
        return this._sueldo;
    }

    set sueldo(sueldo) {
        this._sueldo = sueldo;
    }

    datos() {
        return super.datos() + ", " + this._idEmpleado + ", " + this._sueldo;
    }
}

class Cliente extends Persona {
    static contadorClientes = 0;

    constructor(nombre, apellido, edad, fechaRegistro) {
        super(nombre, apellido, edad);
        this._idCliente = ++Cliente.contadorClientes;
        this._fechaRegistro = fechaRegistro;
    }

    get idCliente() {
        return this._idCliente;
    }

    get fechaRegistro() {
        return this._fechaRegistro;
    }

    set fechaRegistro(fechaRegistro) {
        this._fechaRegistro = fechaRegistro;
    }

    datos() {
        return super.datos() + ", " + this._idCliente + ", " + this._fechaRegistro;
    }
}

let persona1 = new Persona("Leonardo", "Hamato", 16);
let persona2 = new Persona("Miguel Angel", "Hamato", 14);
let persona3 = new Persona("Donatelo", "Hamato", 15);

let empleado1 = new Empleado("Rafael", "Hamato", 16, 8000);
let empleado2 = new Empleado("Yoshi", "Hamato", 45, 10000);
let empleado3 = new Empleado("Karai", "Hamato", 16, 8000);

let cliente1 = new Cliente("Abril", "O'neil", 15, "02/12/2025");
let cliente2 = new Cliente("Casey", "Jones", 15, "02/12/2025");
let cliente3 = new Cliente("Usagi", "Yojimbo", 20, "02/12/2025");

console.log(persona1.toString());
console.log(persona2.toString());
console.log(persona3.toString());

console.log(empleado1.toString());
console.log(empleado2.toString());
console.log(empleado3.toString());

console.log(cliente1.toString());
console.log(cliente2.toString());
console.log(cliente3.toString());

persona1.nombre = "Bobonardo";
console.log(persona1.nombre);
console.log(persona1.toString());

empleado3.nombre = "Miwa";
console.log(empleado3.nombre);
console.log(empleado3.toString());

cliente3.apellido = "Miyamoto";
console.log(cliente3.apellido);
console.log(cliente3.toString());