package co.edu.uniquindio.punto14;

import java.util.LinkedList;
import java.util.List;

public class Funciones
{
    /**
     * filtra las cadenas y devuelve las que inician con
     * una letra mayuscula
     */
    public static List<String> conInicioEnMayuscula(List<String> lista)
    {
        return conInicioEnMayuscula(lista, new LinkedList<String>(), 0);
    }

    // recursividad
    private static List<String> conInicioEnMayuscula(List<String> lista, List<String> resultado, int index)
    {
        if (index >= lista.size()) return resultado;

        if (lista.get(index).matches("^[A-Z].*")) {
            resultado.add(lista.get(index));
        }

        return conInicioEnMayuscula(lista, resultado, index + 1);
    }
}