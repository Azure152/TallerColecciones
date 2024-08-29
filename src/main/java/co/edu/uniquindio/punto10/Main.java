package co.edu.uniquindio.punto10;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;

import co.edu.uniquindio.punto2.Producto;

public class Main
{
    public static void main(String[] args)
    {
        Queue<Producto> elementos = new PriorityQueue<>();
        elementos.offer(new Producto("Cuchara", "a01", 2));
        elementos.offer(new Producto("Tenedor", "a02", 4));
        elementos.offer(new Producto("Cuchillo", "a03", 4));
        elementos.offer(new Producto("Plato", "a04", 10));

        Predicate<Producto> condicion = (elemento) -> {
            return elemento.precio >= 10;
        };

        System.out.println(
            Funciones.obtenerElementosCondicion(elementos, condicion)
        );

        // @NOTA: tambien es posible recorrer la cola sin alterarla
        // si en lugar de la propia cola usamos un arreglo con los elementos
        // de la cola es posible recorrerla recursivamente 
    }
}