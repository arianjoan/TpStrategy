package implementaciones;

import Utilidades.Utilidades;
import interfaces.Beber;

import java.util.Random;

public class BeberVikingoImpl implements Beber {

    private Double bebido;
    private Double bonusBeber;

    public Double Beber(Integer bonusBebedor){

        bonusBeber = 1 + ((double)bonusBebedor / 100) * Utilidades.getRandom().nextDouble();;
        bebido = Utilidades.tamanio_pinta() * bonusBeber;

        return bebido;
    }
}
