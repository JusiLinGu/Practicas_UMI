let a, b, c;
a = 0;

//Pre incremento
++a;
console.log(a);

//Post incremento
a++;
console.log(a);

//Pre decremento
--a;
console.log(a);

//Post decremento
a--;
console.log(a);

//Ejemplo
a = 5;
b = 2;
c = ++a * b--;  //6 * 2 = 12 (Primero se aumenta 1 a la variable a. Primero se utiliza el 2 de b y posteriormente se le resta 1)
console.log(c);

console.log(a);
console.log(b);