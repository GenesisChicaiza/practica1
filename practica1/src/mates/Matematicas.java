package mates;
import java.util.Random;
/**
 * Clase que contiene metodos matematicos para realizar calculo para aproximar el numero Pi.
 *
 * @author Genesis Chicaiza
 */
public class Matematicas{
    /**
     * Genera una aproximación del numero Pi utilizando el metodo Monte Carlo.
     *
     * @param pasos: La cantidad de pasos para el calculo.
     * @return Aproximación del numero Pi.
     */

    public static double generarNumeroPiIterativo(long pasos){
        long puntos = 0;

        for(long i = 0; i< pasos; i ++){
            double x = Math.random();
            double y = Math.random();

            if(x*x + y*y <=1){
                puntos++;
            }

        }


        return 4.0 * puntos / pasos; // Este código hay que cambiarlo.
    }
}
