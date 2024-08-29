package co.edu.uniquindio.punto11;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniquindio.punto2.Producto;

public class Main
{
    public static void main(String[] args)
    {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Cuchillo", "a03", 4));
        productos.add(new Producto("Tenedor", "a02", 4));
        productos.add(new Producto("Plato", "a04", 10));
        productos.add(new Producto("Cuchara", "a01", 2));
        
        Funciones.quicksort(productos);

        System.out.println(productos);
    }
}