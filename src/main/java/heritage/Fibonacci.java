package heritage;
//El numero ingresado pertenece al codigo fibonacci, recursividad: una funcion puede llamarse a si misma.
public class Fibonacci extends Number {
    public static Boolean esFibonacci(int numero){
        int num1, num2, temp, contador = 0;
        int limite = numero;
        num1 = 0;
        num2 = 1;

        while (num2 + num1 <= 10000) {
            temp = num1;
            num1 = num2;
            num2 = temp + num1;
            if (limite == num2) {
                contador = contador + 1;
            }
            boolean fibonacci = numero == contador;
            return fibonacci;
        }

        //System.out.println("Los números que coincidieron con la secuencia fibonacci fueron: " + contador);
        return null;
    }
}
