package co.edu.uniquindio.punto14;

import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> lista = new LinkedList<>();
        lista.add("Lorem Ipsum");
        lista.add("I got your flowers");
        lista.add("state of mind");
        lista.add("blkbird");
        lista.add("Far from home");

        System.out.println(Funciones.conInicioEnMayuscula(lista));
    }
}