package co.edu.uniquindio.punto15;

import java.util.HashMap;
import java.util.Map;

public class Funciones
{
    public static Map<String, Integer> filtrarPorClaveInicioMinuscula(
        Map<String, Integer> mapa
    ) {
        return filtrarPorClaveInicioMinuscula(
            mapa,
            new HashMap<>(),
            mapa.keySet().toArray(new String[0]),
            0
        );
    }

    // recursividad
    private static Map<String, Integer> filtrarPorClaveInicioMinuscula(
        Map<String, Integer> mapa,
        Map<String, Integer> resultado,
        String[] claves,
        int index
    ) {
        if (index >= claves.length) return resultado;

        String clave = claves[index];

        if (clave.matches("^[a-z].*")) {
            resultado.put(clave, mapa.get(clave));
        }

        return filtrarPorClaveInicioMinuscula(mapa, resultado, claves, index + 1);
    }
}
