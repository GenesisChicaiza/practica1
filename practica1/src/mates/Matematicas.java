package mates;
import java.util.Random;

public class Matematicas{

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
