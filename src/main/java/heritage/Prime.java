package heritage;

public class Prime implements Message {
   public void primo(){
       System.out.println("Probando heritage");
   }

    public  Boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            //modulo debe ser 0
            if (numero % i == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }

   /* @Override
    public Boolean esPalindromo(int numero) {
        return false;
    }

    @Override
    public Boolean esFibonacci(int numero) {
        return false;
    }*/

    @Override
    public void messageResult(int numero) {
        boolean b = esPrimo(numero);
        String message = b ? " Pertenece a un numero Primo" : " No pertenece a numero Primo";

        System.out.println("El numero " + numero + message);

    }
}
