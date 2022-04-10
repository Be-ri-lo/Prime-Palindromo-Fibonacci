package heritage;

public class Palindrome extends Number {
// si el numero es palindrome, se dice que leido de izq a der o der a izq es igual, por ejemplo 121
    // qué debería evaluar.
    //  tener dos variables, uno que sea variable numero, la que recibe el numero que se ingresa,
    // y otra variable inversa y estás variables compararlas.
    // entonces la variable inversa tengo que invertirla porque recogerá el numero que se ingresa.
    // Para compararlas debo recorrerlas y luego comparar ambas variables. Variable resto se agrega segun explicacion
    // de ejemplo.

    public static Boolean  esPalindromo(int numero){
        int resto, invertido = 0;
        int num = numero;

        while(numero > 0) {
            resto = numero % 10;
            invertido = (invertido * 10) + resto;
            numero /= 10;
        }
        boolean palindromo = num == invertido;
        return palindromo;
    }
}
