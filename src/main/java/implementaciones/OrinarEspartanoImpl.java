package implementaciones;

import Utilidades.Utilidades;
import interfaces.Orinar;

import java.util.Random;

public class OrinarEspartanoImpl implements Orinar {

    private boolean orinar;

    public boolean Orinar(Integer tolerancia){


        int porcentaje = Utilidades.getRandom().nextInt(10);

        if (porcentaje < (100 - tolerancia) / 10){
            orinar = true;
        }else{
            orinar = false;
        }

        return orinar;

    }

}
