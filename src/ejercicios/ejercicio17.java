package ejercicios;

public class ejercicio17 {

    public static void main(String[] args) {
        //17. Suma de números pares en un rango
        //•	Descripción: Suma todos los números pares entre a = 1 y b = 100. Un número es par si es divisible por 2.
        //•	Variables: a = 1, b = 100.

        int a = 1;
        int b = 100;
        int suma = 0;

        while (a<=b) {
            a=a+1;
            if ((a%2)==0)
            {
                suma=suma+a;
            }
        }
        System.out.println(" la suma es: " +suma);
    }
}
