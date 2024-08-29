package co.edu.uniquindio.punto8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Funciones
{
    public static Map<Integer, String> deClavePar(Map<Integer, String> mapa)
    {
        // con iteradores
        // return deClavePar(mapa, new HashMap<>(), mapa.keySet().iterator());

        // sin iteradores
        return deClavePar(new HashMap<>(mapa), new HashMap<>(), 0);
    }

    /**
     * obtener mapa con entradas de clave par
     * (utilizamos arrays tras camaras para poder recorrerlos)
     * 
     * @param mapa mapa de entrada
     * @param resultado resultados acumulados
     * @param index indice actual
     * 
     * @return mapa con las entradas de llave par
     */
    private static Map<Integer, String> deClavePar(
        Map<Integer, String> mapa,
        Map<Integer, String> resultado,
        int index
    ) {
        return deClavePar(mapa, resultado, mapa.keySet().toArray(new Integer[0]), index);
    }

    /**
     * metodo suplementario
     * (para no pedir un nuevo array en cada llamada)
     * 
     * @param mapa mapa de entrada
     * @param resultado resultados acumulados
     * @param llaves arreglo de las llaves del mapa
     * @param index indice actual
     * 
     * @return mapa con las entradas de llave par
     */
    private static Map<Integer, String> deClavePar(
        Map<Integer, String> mapa,
        Map<Integer, String> resultado,
        Integer[] llaves,
        int index
    ) {
        if (index >= llaves.length) {
            return resultado;
        }

        Integer llaveActual = llaves[index];

        if (llaveActual % 2 == 0) {
            resultado.put(llaveActual, mapa.get(llaveActual));
        }

        return deClavePar(mapa, resultado, index + 1);
    }

    /**
     * "recorrer" un mapa recursivamente (en verdad se usan iteradores)
     * 
     * @param mapa mapa de entrada
     * @param resultado resultados acumulados
     * @param iterator iterator del mapa de entrada
     * 
     * @return mapa con las entradas de llave par
     */
    private static Map<Integer, String> deClavePar(
        Map<Integer, String> mapa,
        Map<Integer, String> resultado,
        Iterator<Integer> iterator
    ) {
        if (iterator.hasNext()) {
            Integer llave = iterator.next();

            if (llave % 2 == 0) {
                resultado.put(llave, mapa.get(llave));
            }

            return deClavePar(mapa, resultado, iterator);
        }

        return resultado;
    }
}