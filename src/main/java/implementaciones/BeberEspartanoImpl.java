package implementaciones;

import Utilidades.Utilidades;
import interfaces.Beber;

import java.util.Random;

public class BeberEspartanoImpl implements Beber {

    private Double bonusBeber;
    private Double bebido;

   public Double Beber(Integer bonusBebedor){


        bonusBeber = 1 + ((double)bonusBebedor / 100) * Utilidades.getRandom().nextDouble(); // Random entre 1 y 1.2
        bebido = Utilidades.tamanio_pinta() * bonusBeber;

        return bebido;
    }

}
