package co.edu.uniquindio.punto8;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Mercurio");
        mapa.put(2, "Venus");
        mapa.put(3, "Tierra");
        mapa.put(4, "Marte");
        mapa.put(5, "Jupiter");
        mapa.put(6, "Saturno");

        System.out.println(Funciones.deClavePar(mapa));
    }
}