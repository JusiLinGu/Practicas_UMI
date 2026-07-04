//Call en JS
let persona1 = {
    nombre: "Juan",
    apellido: "Perez",
    nombreCompleto: function(titulo, tel) {
        return titulo + ": " + this.nombre + " " + this.apellido + ", " + tel;
    }
}

//Uso de call para usar el metodo persona1.nombreCompleto
let persona2 = {
    nombre: "Carlos",
    apellido: "Lara",
}

console.log(persona1.nombreCompleto("Lic", "99887766"));

console.log(persona1.nombreCompleto.call(persona2, "Ing", "444333222"));