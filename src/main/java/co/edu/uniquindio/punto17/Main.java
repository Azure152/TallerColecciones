package co.edu.uniquindio.punto17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import co.edu.uniquindio.punto2.Producto;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<String, Producto> mapa = new HashMap<>();
        LinkedHashMap<String, Producto> linked = new LinkedHashMap<>();
        TreeMap<String, Producto> arbol = new TreeMap<>();

        var p1 = new Producto("Cuchara", "a01", 2);
        var p2 = new Producto("Tenedor", "a02", 4);
        var p3 = new Producto("Cuchillo", "a03", 4);
        var p4 = new Producto("Plato", "a04", 10);

        // no garantiza el orden de insercion
        mapa.put(p1.codigo, p1);
        mapa.put(p3.codigo, p3);
        mapa.put(p4.codigo, p4);
        mapa.put(p2.codigo, p2);

        // los elementos se guardar en el orden en el que se han insertado
        linked.put(p1.codigo, p1);
        linked.put(p3.codigo, p3);
        linked.put(p4.codigo, p4);
        linked.put(p2.codigo, p2);

        // nos brinda mas opcion para la busqueda
        // permite de ordenar los elementos en la estrucura (implentar Comprable o
        // usar Comparator )
        arbol.put(p1.codigo, p1);
        arbol.put(p3.codigo, p3);
        arbol.put(p4.codigo, p4);
        arbol.put(p2.codigo, p2);

        System.out.println(" ----------------------- HashMap -----------------------");
        System.out.println(mapa);
        System.out.println(" -------------------- LinkedHashMap --------------------");
        System.out.println(linked);
        System.out.println(" ----------------------- TreeMap -----------------------");
        System.out.println(arbol);
        System.out.println(" ------------------------------------------------------");
    }
}