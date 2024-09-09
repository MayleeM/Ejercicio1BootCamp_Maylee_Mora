package ejercicios;

public class ejercicio16 {

    public static void main(String[] args) {
    //  16. Sumar dígitos de un número
    //	Descripción: Dado el número a = 5678, suma todos sus dígitos. El resultado sería 5 + 6 + 7 + 8 = 26.
    //	Variables: a = 5678.

        int numero = 5678;
        int suma =0;

        while (numero !=0){
            suma += numero % 10;
            numero /=10;

            System.out.println("La suma de los digitos es: " +suma);
        }

    }
}
