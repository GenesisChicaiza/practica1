package aplicacion;

import mates.Matematicas;

import java.util.Scanner;

/**
 * @author Genesis Chicaiza
 * Clase que contiene el metodo principal para calcular una aproximacion de Pi
 *
 */
public class Principal{
    /**
     * ejecuta la clase Matematicas
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de dardos: ");
        int dardos = sc.nextInt();
        double pi = Matematicas.generarNumeroPiIterativo(dardos);
        System.out.println("El número PI es aproximadamente: " + pi);
        sc.close();


    }
}
