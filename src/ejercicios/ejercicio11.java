package ejercicios;

public class ejercicio11 {

    public static void main(String[] args) {

    //  11. Fibonacci
    //	Descripción: Genera los primeros N = 10 números de la secuencia de Fibonacci, donde cada número es la suma de los dos anteriores. La secuencia comienza con 0 y 1.
    //	Variables: N = 10.

        int N = 10;
        int a = 0, b = 1;
        System.out.println("Los primeros " + N + " números de la secuencia de Fibonacci:");
        System.out.print(a + " " + b);

        for (int i = 2; i < N; i++) {
            int siguiente = a + b;
            System.out.print(" " + siguiente);
            a = b;
            b = siguiente;
        }
    }
}
