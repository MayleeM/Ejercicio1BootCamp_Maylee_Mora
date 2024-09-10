package ejercicios;

public class ejercicio22 {
    //22. Conteo de dígitos de un número
    //•	Descripción: Cuenta cuántos dígitos tiene el número a = 987654. El resultado sería 6 dígitos.
    //•	Variables: a = 987654.

    public static void main(String[] args) {


        int a = 987654;

        if(a == 0) a++;
        System.out.println("el número: "+ a + " tiene "+ Math.floor(Math.log10(Math.abs(a)) + 1) + " digitos");

    }
}
