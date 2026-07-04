//Sentencia switch
//switch (condicionAEvaluar) {case 1: ... break; case 2: ... break; default: ... break;}
let diaSemana = 8;

switch (diaSemana) {
    case 1:
        console.log("Lunes");
        break;
    case 2:
        console.log("Martes");
        break;
    case 3:
        console.log("Miercoles");
        break;
    case 4:
        console.log("Jueves");
        break;
    case 5:
        console.log("Viernes");
        break;
    case 6:
        console.log("Sabado");
        break;
    case 7:
        console.log("Domingo");
        break;
    default:
        console.log(`No existe un dia ${diaSemana} en la semana`);
        break;
}