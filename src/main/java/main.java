import heritage.Fibonacci;
import heritage.Number;
import heritage.Palindrome;
import heritage.Prime;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        Number prime = new Prime();
        Number palindrome = new Palindrome();
        Number fibonacci = new Fibonacci();
        System.out.println("Escribe un numero");
        int numero = escaner.nextInt();

        //debo agregar 4 supuesto, es primo y poli, es primo no poli, no es primo y poli, no es primo y no es poli.
        //debo agregar con fibonacci
        if (fibonacci.esFibonacci(numero) && prime.esPrimo(numero) && palindrome.esPalindromo(numero)) {
            System.out.println(numero + " Es Fibonacci, Primo y Palindrome");
        } else if (prime.esPrimo(numero) && fibonacci.esFibonacci(numero) ) {
            System.out.println(numero + " Es Primo y Fibonacci");
        } else if (prime.esPrimo(numero) && palindrome.esPalindromo(numero) ) {
            System.out.println(numero + " Es Primo y Palindrome");
        } else if (palindrome.esPalindromo(numero) && fibonacci.esFibonacci(numero)) {
            System.out.println(numero + " Es Palindromo y Fibonacci");
        } else if (prime.esPrimo(numero)){
            System.out.println(numero + " Es Primo");
        } else if (fibonacci.esFibonacci(numero)){
            System.out.println(numero + " Es Fibonacci");
        } else if (palindrome.esPalindromo(numero)){
            System.out.println(numero + " Es Palindromo");
        } else {
            System.out.println(numero + " No es ninguna de las anteriores");
        }

        Number n = new Prime();
        test(n, numero);
        n = new Palindrome();
        test(n, numero);
        n = new Fibonacci();
        test(n, numero);
        escaner.close();
    }

    private static void test(Number number, int num){
        number.esPrimo(num);
        number.esPalindromo(num);
        number.esFibonacci(num);
    }
}