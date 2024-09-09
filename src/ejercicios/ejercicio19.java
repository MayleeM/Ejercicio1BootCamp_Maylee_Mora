package ejercicios;

public class ejercicio19 {
    //19. Números perfectos
    //•	Descripción: Determina si el número a = 28 es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores (excluyendo el número mismo) es igual al número.
    //•	Variables: a = 28.
    public static void main(String[] args) {

        int a = 28;
        int suma = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                suma += i; //formula para sumar los divisores
            }
        }

        if (suma == a) {
            System.out.println(a + " es un número perfecto");
        } else {
            System.out.println(a + " NO es un número perfecto");
        }
    }

}
