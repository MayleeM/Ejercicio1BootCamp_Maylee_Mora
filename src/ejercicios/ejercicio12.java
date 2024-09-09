package ejercicios;

public class ejercicio12 {

    public static void main(String[] args) {
    //12. Inversión de un número
    //• Descripción: Dado el número a = 54321, invierte el orden de sus dígitos. El resultado sería 12345.
    //•	Variables: a = 54321.

        int a = 54321;
        int reves = 0;

        while (a != 0) {
            reves = reves * 10 + a % 10;
            a/= 10; //entre igual 10, así se lee
        }
        System.out.println("Número invertido: " + reves);

    }
}
