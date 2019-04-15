import Utilidades.Utilidades;
import implementaciones.BeberVikingoImpl;
import implementaciones.OrinarEspartanoImpl;
import implementaciones.OrinarVikingImpl;
import models.*;

public class Main {

    public static void main(String[] args) {

        Utilidades.crearRandom();

        Torneo torneo = new Torneo(
                Raza.generarVikingos(),
                Raza.generarEspartanos(),
                new Dueño("Ivar",45,130, new OrinarEspartanoImpl(),new BeberVikingoImpl())
        );


        torneo.ordenarJugadoresPorEdad();
        torneo.presentarJugadores();

        torneo.peleaFinal(torneo.pelea());




    }



}
