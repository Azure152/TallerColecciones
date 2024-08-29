package co.edu.uniquindio.punto11;

import java.util.List;

import co.edu.uniquindio.punto2.Producto;

public class Funciones
{
    public static void quicksort(List<Producto> lista)
    {
        quicksort(lista, 0, lista.size() - 1);
    }

    // funcion recursiva
    private static void quicksort(List<Producto> lista, int i, int d)
    {
        if (i >= --d) return;

        int inicio = i;
        int fin = d + 1;
        Producto pivotE = lista.get(fin);

        while (i < d) {
            Producto izq = lista.get(i);
            Producto der = lista.get(d);
            Producto temp;
            boolean condIzq = izq.compareTo(pivotE) < 0;
            boolean condDer = der.compareTo(pivotE) > 0;

            if (condIzq == true) i = i + 1;
            if (condDer == true) d = d - 1;

            if (condDer == false && condIzq == false) {
                lista.set(i, der);
                lista.set(d, izq);
            }

            if (i >= d && pivotE.compareTo(lista.get(i)) < 0) {
                temp = lista.get(fin);
                lista.set(fin, lista.get(i));
                lista.set(i, temp);
            }
        }

        quicksort(lista, inicio, i);
        quicksort(lista, i, fin);
    }
}