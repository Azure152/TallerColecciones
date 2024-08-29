package co.edu.uniquindio.punto13;

import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(12);
        conjunto.add(43);
        conjunto.add(80);
        conjunto.add(56);
        conjunto.add(23);

        System.out.println(
            " --------------- Usando arreglos ----------------- "
            + Funciones.hallarPares(conjunto)
        );

        System.out.println(
            " --------------- Usando arreglos ----------------- "
            + Funciones.hallarParesIterador(conjunto)
        );
    }
}