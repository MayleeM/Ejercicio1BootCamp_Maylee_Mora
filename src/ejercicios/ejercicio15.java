package ejercicios;

import java.text.DecimalFormat;

public class ejercicio15 {

    public static void main(String[] args) {

        //  15. Calcular el área de un círculo
        //	Descripción: Dado el radio r = 7 de un círculo, calcula su área usando la fórmula:
        //  Variables: r = 7.


        double radio = 7;

        double area = Math.PI * radio * radio;
        DecimalFormat formato = new DecimalFormat("#.00");

        System.out.println("El resultado calculado es: "+ formato.format(area));
    }
}

