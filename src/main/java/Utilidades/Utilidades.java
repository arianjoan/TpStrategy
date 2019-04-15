package Utilidades;

import java.util.Random;

public class Utilidades {

    private static Random random = new Random();

    public static void crearRandom(){
        random.setSeed(System.currentTimeMillis());
    }

    public static Random getRandom(){
        return random;
    }

    public static int tamanio_pinta(){
        return 500;
    }
}
