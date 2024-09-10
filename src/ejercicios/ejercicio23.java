package ejercicios;

public class ejercicio23 {
    //23. Divisibilidad
    //•	Descripción: Dado el número a = 45, determina si es divisible por 2, 3 o 5. Un número es divisible por otro si al dividir el resultado es un número entero sin resto.
    //•	Variables: a = 45.
    public static void main(String[] args) {
        int a = 30;
        if (a % 2 ==0) {
            System.out.println(a + " es divisible entre 2");
        }
        if (a % 3 ==0){
            System.out.println(a + " es divisible entre 3");
        }
        if (a % 5 ==0) {
            System.out.println(a + " es divisible entre 5");
        }
        if (a % 2 ==0 && a % 3 ==0 && a % 5 ==0){
            System.out.println(a + " es divisible entre 2, 3 y 5");
        }
    }
}
