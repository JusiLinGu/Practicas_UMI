//Getters y setters
let persona = {
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
}

console.log(persona.nombreCompleto);
console.log(persona.lang);

//Asignamos un nuevo idioma
persona.lang = 'en';
console.log(persona.lang);
console.log(persona.idioma);