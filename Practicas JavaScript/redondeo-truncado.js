//Redondeo y truncado JS
let numero = 8.5, redondeo, truncado;

//Redondeo
//Math.round() redondea al valor entero mas cercano
//.5 o superior redondea al valor mayor mas cercano
redondeo = Math.round(numero);
console.log(redondeo);

//Truncado
//Math.trunc() elimina la parte flotante
truncado = Math.trunc(numero);
console.log(truncado);