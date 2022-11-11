package laboratorioexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Excepciones {

    /*
//Excepción sin tratar 
    public void formatoNumero() {

        int numero;
        String cadena = "  1";
        numero = Integer.parseInt(cadena);
    }*/
    //excepción tratada
    public void formatoNumero() {

        int numero;
        String cadena = "  1";
        try {
            numero = Integer.parseInt(cadena);
        } catch (NumberFormatException ex) {
            System.out.println("No es un número, es una cadena de texto." + ex.getMessage());

        }
    }

    public void desborde() {

        int v[] = new int[3];
        try {
            for (int i = 0; i < 5; i++) {
                v[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("El vector va hasta: " + ex.getMessage());
        }
    }

    public void aritmetico() {

        int numero = 5, resultado;
        try {
            resultado = numero / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Es un error arimetico, no se puede dividir un entero entre 0 " + ex.getMessage());
        }
    }

    public void division() {
        int num, resultado = 0;
        int divisor;

        try {
            Scanner Input = new Scanner(System.in);
            System.out.println("Digite el numero entero:");
            num = Input.nextInt();
            System.out.println("Digite el divisor:");
            divisor = Input.nextInt();
            try {
                resultado = num / divisor;
            } catch (ArithmeticException ex) {
                System.out.println("Es un error arimetico, no se puede dividir un entero entre 0 " + ex.getMessage());
            }
            if (resultado < 10) {
                throw new Exception(" El resultado es menor a 10");
            }
        } catch (InputMismatchException em) {
            System.out.println("No es el tipo de dato esperado " + em.getMessage());
        } catch (Exception ep) {
            System.out.println(resultado + "<10" + ep.getMessage());

        }

    }

}
