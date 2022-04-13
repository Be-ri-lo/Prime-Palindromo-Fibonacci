package heritage;

public abstract class Number {

    public abstract Boolean esPrimo(int numero);
        /*if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            //modulo debe ser 0
            if (numero % i == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true*/

    public abstract Boolean esPalindromo(int numero);
        /*if (numero / 10 >= 1) {
            int invertido = 0, resto;
            int num = numero;

            while (numero > 0) {
                resto = numero % 10;
                invertido = (invertido * 10) + resto;
                numero /= 10;
            }
            boolean palindromo = num == invertido;
            return palindromo;
        }
        return false;*/


    public abstract Boolean esFibonacci(int numero);
        /*int n1 = 0, n2 = 1, suma = 0, contador = 0;

        while ( suma <= numero){
            suma = n1 + n2;
            n1 = n2;
            n2 = suma;

            if (numero == n2) {
                contador = contador + 1;
            }
        }

        boolean fibonacci = (contador != 0);
        if (fibonacci){
            return true;
        }
        return false;*/

}
