package co.edu.uniquindio.punto11;

import java.util.ArrayList;
import java.util.List;

public class Main2
{
    public static void main(String[] args)
    {
        List<Integer> lista = new ArrayList<>();
        lista.add(0);
        lista.add(-2);
        lista.add(1);
        lista.add(-4);

        // lista.add(0);
        // lista.add(-2);
        // lista.add(-4);
        // lista.add(1);

        quicksort(lista);

        System.out.println(lista);
    }

    public static void quicksort(List<Integer> lista)
    {
        quicksort(lista, 0, lista.size() - 1);
    }

    private static void quicksort(List<Integer> lista, int i, int d)
    {
        if (i >= --d) return;

        int inicio = i;
        int fin = d + 1;
        int pivotE = lista.get(fin);
        int temp;

        while (i < d) {
            int izq = lista.get(i);
            int der = lista.get(d);
            boolean condIzq = izq < pivotE;
            boolean condDer = der > pivotE;

            if (condIzq == true) i = i + 1;
            if (condDer == true) d = d - 1;

            System.out.println("Antes del cambio: " + lista);

            if (condDer == false && condIzq == false) {
                lista.set(i, der);
                lista.set(d, izq);
            }

            System.out.printf("i=%s ; d=%s ; fin=%s ---- \n", i, d, fin);

            if (i >= d && pivotE < lista.get(i)) {
                temp = lista.get(fin);
                lista.set(fin, lista.get(i));
                lista.set(i, temp);
            }

            System.out.println("Despues del cambio: " + lista);
        }

        System.out.println("sale con ------------------------");
        System.out.printf("i=%s ; d=%s ---- \n", i, d, fin);
        System.out.printf("in=%s ; fin=%s ---- \n", inicio, fin);

        quicksort(lista, inicio, i);
        quicksort(lista, i, fin);
    }
}