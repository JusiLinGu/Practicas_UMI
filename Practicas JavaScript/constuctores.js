//Constructores
function Persona(nombre, apellido, email, edad, idioma) {
    //this.nombreDelAtributoDelObjeto = nombreDelParametroQuePideLaFuncion
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.edad = edad;
    this.idioma = idioma;
    this.nombreCompleto = function() {
        return this.nombre + " " + this.apellido;
    }
}

//Llamamos al metodo constructor para ingresar los datos del padre
let padre = new Persona("Juan", "Perez", "jperez@mail.com", "28", "es");
console.log(padre);
console.log(padre.nombreCompleto());

//Llamamos nuevamente al metodo constructor para ingresar ahora los datos de la madre
let madre = new Persona("Laura", "Quintero", "lquintero@mail.com", "30", "es");
console.log(madre);
console.log(madre.nombreCompleto());

//Maneras de crear un objeto
var miObjeto = new Object();
let miObjeto2 = {};

let miCadena1 = new String("Hola");
let miCadena2 = "Hola";

let miNumero = new Number(1);
let miNumero2 = 2;

let miBoolean = new Boolean(true);
let miBoolean2 = true;

let miArray = new Array();
let miArray2 = [];

let miFuncion = new Function();
let miFuncion2 = function() {};

/*let persona = {
    nombre: 'Juan',
    apellido: 'Perez',
    email: 'jperez@mail.com',
    edad: 28,
    idioma: 'es',
    get lang() {
        return this.idioma.toUpperCase();
    },
    set lang(lang) {
        this.idioma = lang.toUpperCase();
    },
    //Metodos en objetos
    get nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
}*/