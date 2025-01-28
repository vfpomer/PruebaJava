/*
 Suma de dígitos
Encuentra la suma de los dígitos de todos los números de 1 a N (Ambos
incluidos)
Ejemplos:
# N = 4 
1 + 2 + 3 + 4 = 10
# N = 10
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + (1 + 0) = 46
# N = 12
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + (1 + 0) + (1 + 1) + (1 + 2) = 51
 */

package suma_digitos;

public class Main {
    public static void main(String[] args) {
        int N = 12;  // Asignamos el valor de N directamente a 12

        int sumaTotal = 0; // La suma total de numeros es 0, por ahora.

        // Recorremos todos los números desde 1 hasta N
        for (int i = 1; i <= N; i++) {
            int numero = i;

            // Sumar los dígitos del número actual
            while (numero > 0) {
                sumaTotal += numero % 10;  // Obtiene el último dígito
                numero /= 10;  // Elimina el último dígito
            }
        }

        // Mostramos la suma total de los dígitos
        System.out.println("La suma de los dígitos de 1 a " + N + " es: " + sumaTotal);
    }
}