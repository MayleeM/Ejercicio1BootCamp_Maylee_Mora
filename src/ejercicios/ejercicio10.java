package ejercicios;

public class ejercicio10 {

    public static void main(String[] args) {

    // 10. Factorial de un número
    //	Descripción: Dado el número a = 6, calcula su factorial. El factorial de un número se obtiene multiplicando todos los números desde 1 hasta el número dado.
    //	Variables: a = 6.

        int a = 6;
        long factorial = 1;

        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + a + " es: " + factorial);
    }

}
