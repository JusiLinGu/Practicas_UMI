//Uso de prototype
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

//Asi se crea un nuevo atributo para todos los objetos de tipo persona
Persona.prototype.tel = "11223344";

//Llamamos al metodo constructor para ingresar los datos del padre
let padre = new Persona("Juan", "Perez", "jperez@mail.com", "28", "es");
padre.tel = "44332211"
console.log(padre.tel);


//Llamamos nuevamente al metodo constructor para ingresar ahora los datos de la madre
let madre = new Persona("Laura", "Quintero", "lquintero@mail.com", "30", "es");
console.log(madre.tel);