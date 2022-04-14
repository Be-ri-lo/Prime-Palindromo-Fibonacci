package heritage;
//El numero ingresado pertenece al codigo fibonacci, recursividad: una funcion puede llamarse a si misma.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55….
 public class Fibonacci extends Number {
    @Override
    public Boolean esPrimo(int numero) {
        return false;
    }

    @Override
    public Boolean esPalindromo(int numero) {
        return false;
    }

    // almacenar valores en un arreglo, para poder comparar la serie con el numero que se ingresa por consola
    @Override
    public Boolean esFibonacci(int numero) {
        int num1, num2, temp, contador = 0;
        num1 = 0;
        num2 = 1;

        // la posicion aumenta en 1 pero el valor aumenta n1 + n2.
        while (num2 + num1 <= 10000) {
            temp =  num1;
            num1 =  num2;
            num2 =  temp + num1;

            if (numero == num2) {
                return true;
            }

        }
        return false;
    }

    @Override
    public void messageResult(int numero) {
        boolean b = esFibonacci(numero);
        String message = b ? " Pertenece a serie Fibonacci" : " No pertenece a serie Fibonacci";

        System.out.println("El numero " + numero + message);
    }

}




