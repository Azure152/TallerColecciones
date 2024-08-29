package co.edu.uniquindio.punto7;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.punto1.Persona;

public class Funciones
{
    public static List<Persona> obtenerMayoresEdad(List<Persona> lista)
    {
        return obtenerMayoresEdad(lista, new ArrayList<>(), 0);
    }

    private static List<Persona> obtenerMayoresEdad(List<Persona> lista, List<Persona> resultado, int index)
    {
        if (index >= lista.size()) {
            return resultado;
        }

        Persona persona = lista.get(index);

        if (persona.getEdad() > 17) {
            resultado.add(persona);
        }

        return obtenerMayoresEdad(lista, resultado, index + 1);
    }
}