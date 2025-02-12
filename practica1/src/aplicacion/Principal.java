package aplicacion;

import mates.Matematicas;
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
        System.out.println("El número PI es " +
                Matematicas.generarNumeroPiIterativo(100000000));
    }
}
