import java.util.Scanner;
import heritage.*;

public class main {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        Prime prime = new Prime();
        Palindrome palindrome = new Palindrome();
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Escribe un numero");
        //System.out.println("Ingresa un numero para calcular");
        int numero = escaner.nextInt();

//debo agregar 4 supuesto, es primo y poli, es primo no poli, no es primo y poli, no es primo y no es poli.
        if (prime.esPrimo(numero) && palindrome.esPalindromo(numero) && fibonacci.esFibonacci(numero)) {
            System.out.println(numero + " Es primo, palindromo y fibonacci");
        } else if (prime.esPrimo(numero) && fibonacci.esFibonacci(numero)) {
            System.out.println(numero + " Es primo");
        } else if (palindrome.esPalindromo(numero) && fibonacci.esFibonacci(numero)) {
            System.out.println(numero + " Es palindromo");
        } else if (fibonacci.esFibonacci(numero)){
            System.out.println(numero + " El numero es fibonacci");
        } else {
            System.out.println(numero + " No es ninguna de las anteriores");
        }
        escaner.close();
    }

}