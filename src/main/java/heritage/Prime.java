package heritage;

public class Prime extends Number {
    public static Boolean esPrimo(int numero) {
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
}
