//Herencia en JS
class Persona {
    static contadorPersonas = 0; //Atributo de nuestra clase

    static get MAX_OBJ() { //CONSTANTE STATIC
        return 5;
    }

    email = "mail@mail.com"; //Atributo de nuestros objetos

    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;

        if (Persona.contadorPersonas < Persona.MAX_OBJ) {
            this._idPersona = ++Persona.contadorPersonas;
        } else {
            console.log("Se han superado el maximo de objetos permitidos");
        }
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
        return this._nombre;
    }

    get apellido() {
        return this._apellido;
    }

    set apellido(apellido) {
        this._apellido = apellido;
        return this._apellido;
    }

    nombreCompleto() {
        return this._idPersona + " " + this._nombre + " " + this._apellido;
    }


    //Sobreescribiendo el metodo de la clase padre
    toString() {
        //Se aplica polimorfismo (Multiples formas en tiempo de ejecucion)
        //El metodo que se ejecuta depende si es una referencia de tipo padre o de tipo hijo
        return this.nombreCompleto();
    }
    static saludar() {
        console.log("Saludos desde metodo static");
    }

    static saludar2(persona) {
        console.log("Saludos" + " " + persona.nombre + " " + persona.apellido);
    }
}

class Empleado extends Persona {
    //Para los constructores de la clase hija debemos recibir los parametros que pide la clase padre junto a los que pide la clase hija constructor(nombre, apellido, departamento) {
    //Posteriormente con super(nombre, apellido) mandamos dichos parametros al constructor padre
    //Y continuamos normal con los parametros exclusivos de la clase hija
    constructor(nombre, apellido, departamento) {
        super(nombre, apellido); //Llamar al constructor de la clase padre
        this._departamento = departamento;
    }

    get departamento() {
        return this._departamento;
    }

    set departamento (departamento) {
        this._departamento = departamento;
        return this._departamento;
    }
    //Sobreescritura en JS
    //Tomamos valores de la clase padre y le agregamos informacion de la clase hija
    
    /*nombreCompleto() {
        return this._nombre + " " + this._apellido + ", " + this._departamento;
    }*/

        //Lo mismo de arriba pero haciendo uso de super para llamar al metodo nombreCompleto y añadir informacion
   nombreCompleto() {
    return super.nombreCompleto() + ", " + this._departamento;
   }
}

let persona1 = new Persona("Juan", "Perez");
console.log(persona1);
console.log(persona1.nombre);
console.log(persona1.nombreCompleto());
console.log(persona1.toString());

let empleado1 = new Empleado("Maria", "Jimenez", "Sistemas");
console.log(empleado1);
console.log(empleado1.nombre); //Podemos hacer uso de los get y set de la clase padre
console.log(empleado1.nombreCompleto());
console.log(empleado1.toString());

//empleado1.saludar(); - No es posible llamar un metodo static desde un objeto
//Pero si desde una clase
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

console.log(Persona.contadorPersonas);
console.log(Empleado.contadorPersonas);

console.log(persona1.email);
console.log(empleado1.email);

console.log(Persona.MAX_OBJ);