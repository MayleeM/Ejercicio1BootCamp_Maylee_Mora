package ejercicios;

public class ejercicio5 {

    public static void main(String[] args) {

    //5. Máximo de tres números
    //Descripción: Dados los números a = 5, b = 12 y c = 9, encuentra cuál de ellos es el mayor.
    //Variables: a = 5, b = 12, c = 9.

        int a = 5;
        int b = 12;
        int c = 9;

        int mayor;

        if (a >= b && a >= c) {
            mayor = a;
        } else if (b >= a && b >= c) {
            mayor = b;
        } else {
            mayor = c;
        }
        System.out.println("El número mayor es: " + mayor);
    }
}
