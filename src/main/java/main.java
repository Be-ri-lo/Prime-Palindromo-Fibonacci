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

        prime.messageResult(numero);
        palindrome.messageResult(numero);
        fibonacci.messageResult(numero);

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