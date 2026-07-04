//Metodo apply
//Call en JS
let persona1 = {
    nombre: "Juan",
    apellido: "Perez",
    nombreCompleto: function(titulo, tel) {
        return titulo + ": " + this.nombre + " " + this.apellido + ", " + tel;
    }
}

//Uso de apply para usar el metodo persona1.nombreCompleto
let persona2 = {
    nombre: "Carlos",
    apellido: "Lara",
}

console.log(persona1.nombreCompleto("Lic", "11223344"));

//Para pasar los argumentos con apply debemos hacerlo con un array
let arreglo = ['Ing', '44332211'];
console.log(persona1.nombreCompleto.apply(persona2, arreglo));