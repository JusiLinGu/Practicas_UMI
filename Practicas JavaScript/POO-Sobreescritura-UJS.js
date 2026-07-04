class Empleado {
    constructor(nombre, sueldo) {
        this._nombre = nombre;
        this._sueldo = sueldo;
    }

    obtenerDetalles() {
        return `Empleado: nombre: ${this._nombre}, sueldo: ${this._sueldo}`;
    }
}

class Gerente extends Empleado {
    constructor(nombre, sueldo, departamento) {
        super(nombre, sueldo);
        this._departamento = departamento;
    }

    //Sobreescritura
    obtenerDetalles() {
        return `Gerente: ${super.obtenerDetalles()}, departamento: ${this._departamento}`;
    }
}

//Polimorfismo
function imprimirYDeterminar(tipo) {
    console.log(tipo.obtenerDetalles());

    //Uso del instanceof para distinguir de que tipo es un objeto
    if(tipo instanceof Gerente) {
        console.log("Es un objeto de tipo gerente")
    }
    else if(tipo instanceof Empleado) {
        console.log("Es un objeto de tipo empleado")
    }
    else if(tipo instanceof Object) {
        console.log("Es un tipo object");
    }
}

let empleado1 = new Empleado("Juan", 6000);
console.log(empleado1.obtenerDetalles());

let gerente1 = new Gerente("Juan", 8000, "Sistemas");
console.log(gerente1.obtenerDetalles());

imprimirYDeterminar(empleado1);
imprimirYDeterminar(gerente1);