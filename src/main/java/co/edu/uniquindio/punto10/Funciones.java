package co.edu.uniquindio.punto10;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

import co.edu.uniquindio.punto2.Producto;

public class Funciones
{
    /**
     * obtenemos los elementos de una cola que cumplen una condicion
     * (utiliza los metodos caracteristicos de una cola pero altera la cola original)
     * 
     * @param cola cola a reccorer
     * @param condicion condicion de filtrado
     * 
     * @return cola con elementos que cumplen la condicion
     */
    public static Queue<Producto> obtenerElementosCondicion(
        Queue<Producto> cola,
        Predicate<Producto> condicion
    ) {
        return obtenerElementosCondicion(cola, new PriorityQueue<Producto>(), condicion);
    }

    // implementacion recursiva
    private static Queue<Producto> obtenerElementosCondicion(
        Queue<Producto> cola,
        Queue<Producto> resultado,
        Predicate<Producto> condicion
    ) {
        if (cola.isEmpty()) return resultado;

        Producto elemento = cola.poll();

        if (condicion.test(elemento)) resultado.offer(elemento);

        return obtenerElementosCondicion(cola, resultado, condicion);
    }
}