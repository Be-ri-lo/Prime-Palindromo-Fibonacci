package heritage;

public class Palindrome extends Number {

    @Override
    public Boolean esPrimo(int numero) {
        return false;
    }

    @Override
    public Boolean esPalindromo(int numero){
       /* int resto, invertido = 0;
        int num = numero;*/

        if (numero / 10 >= 1) {
            int invertido = 0, resto;
            int num = numero;

            while (numero != 0) {
                resto = numero % 10;
                invertido = (invertido * 10) + resto;
                numero /= 10;
            }
            boolean palindromo = num == invertido;
            return palindromo;
        }
        return false;
    }

    @Override
    public Boolean esFibonacci(int numero) {
        return false;
    }

    @Override
    public void messageResult(int numero) {
        boolean b = esPalindromo(numero);
        String message = b ? " Es un numero Palindromo" : " No es un numero Palindromo";

        System.out.println("El numero " + numero + message);
    }
}
