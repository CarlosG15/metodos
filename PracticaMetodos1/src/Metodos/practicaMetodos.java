package Metodos;
import java.util.Scanner;

public class practicaMetodos {
    public  static int d;
    private static int d1;
    private static int d2;

    public static void main(String args[]) {

        int suma, resta, multiplicacion, division;

        d1 = obtenDato();
        d2 = obtenDato();

        suma = d1 + d2;
        System.out.println("Resultado de suma: " + suma);

        resta = d1 - d2;
        System.out.println("Resultado de resta: " + resta);

        multiplicacion = d1 * d2;
        System.out.println("Resultado de multiplicacion: " + multiplicacion);

        division = d1 / d2;
        System.out.println("Resultado de division: " + division);


    }

    public static int obtenDato(){
        System.out.println("Ingresa el dato");
        Scanner scn  = new Scanner(System.in);
        d = scn.nextInt();

        return d;
    }
}
