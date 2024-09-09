package ejercicios;

public class ejercicio20 {
    //20. Número Armstrong
    //•	Descripción: Determina si el número a = 153 es un número Armstrong. Un número Armstrong es igual a la suma de sus dígitos elevados a la potencia del número de dígitos. Para 153, sería
    //•	Variables: a = 153.
        public static void main(String[] args) {

            int a = 153;
            int numero = a;
            int numDigito = String.valueOf(a).length();
            int suma = 0;
            while (a > 0) {
                int digito = a % 10;
                suma += Math.pow(digito, numDigito);
                a /= 10;
            }

            if (suma == numero) {
                System.out.println(numero + " es un número Armstrong.");
            } else {
                System.out.println(numero + " NO es un número Armstrong.");
            }
        }
}

