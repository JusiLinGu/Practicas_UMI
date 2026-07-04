//Precedencia de operadores

/*
1.- Parentesis y corchetes
2.- Operadores unarios (-[Es decir, numeros negativos], ++, --, !)
3.- Aritmeticos *, /, %
4.- Aritmeticos +, -
5.- Relacionales <, >, <=, >=
6.- Igualdad ==, !=
7.- Logicos &&, ||
8.- Asignacion =, +=, -=, *=, /=, %=, etc.
*/

let resultadoEjercicio = 2 + 3 * 10 - 7 + (2 * 3 - 6 * (1 + 2)) - [2 + 2];
/*
1 paso.- 2 + 3 * 10 - 7 + (2 * 3 - 6 * 3) - [2 + 2]
2 paso.- 2 + 3 * 10 - 7 + (6 - 6 * 3) - [2 + 2]
3 paso.- 2 + 3 * 10 - 7 + (6 - 18) - [2 + 2]
4 paso.- 2 + 3 * 10 - 7 + (-12) - [2 + 2]
5 paso.- 2 + 3 * 10 - 7 - 12 - [2 + 2]
6 paso.- 2 + 3 * 10 - 7 - 12 - 4
7 paso.- 2 + 30 - 7 - 12 - 4
8 paso.- 32 - 7 - 12 - 4
9 paso.- 25 - 12 - 4
10 paso.- 13 - 4
11 paso.- 9
*/
console.log(resultadoEjercicio);