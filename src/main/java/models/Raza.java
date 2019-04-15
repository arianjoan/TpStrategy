package models;

import implementaciones.BeberEspartanoImpl;
import implementaciones.BeberVikingoImpl;
import implementaciones.OrinarEspartanoImpl;
import implementaciones.OrinarVikingImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Raza {

    public static List<Espartano> generarEspartanos(){

        List<Espartano> espartanos = new ArrayList<Espartano>();

        espartanos = Arrays.asList(
                new Espartano("Menelao",32,86,new OrinarEspartanoImpl(),new BeberEspartanoImpl()),
                new Espartano("Leonidas",26,102,new OrinarEspartanoImpl(),new BeberEspartanoImpl()),
                new Espartano("Nabis",35,85,new OrinarEspartanoImpl(),new BeberEspartanoImpl()),
                new Espartano("Plistarco",29,80,new OrinarEspartanoImpl(),new BeberEspartanoImpl()),
                new Espartano("Gorgo",28,94,new OrinarEspartanoImpl(),new BeberEspartanoImpl())
                );

        return espartanos;


    }

    public static List<Vikingo> generarVikingos(){

        List<Vikingo> vikingos = new ArrayList<Vikingo>();

        vikingos = Arrays.asList(
                new Vikingo("Olaf",32,86,new OrinarVikingImpl(),new BeberVikingoImpl()),
                new Vikingo("Holger",26,102,new OrinarVikingImpl(),new BeberVikingoImpl()),
                new Vikingo("Ragnar",35,85,new OrinarVikingImpl(),new BeberVikingoImpl()),
                new Vikingo("Lagertha",29,80,new OrinarVikingImpl(),new BeberVikingoImpl()),
                new Vikingo("Balder",28,94,new OrinarVikingImpl(),new BeberVikingoImpl())
                );

        return vikingos;


    }





}
