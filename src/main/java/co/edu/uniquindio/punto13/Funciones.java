package co.edu.uniquindio.punto13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Funciones
{
    public static Set<Integer> hallarPares(Set<Integer> conjunto)
    {
        return hallarPares(conjunto, new HashSet<Integer>());
    }

    public static Set<Integer> hallarParesIterador(Set<Integer> conjunto)
    {
        return hallarPares(conjunto.iterator(), new HashSet<Integer>());
    }

    // @NOTA: soy consciente que las siguientes 2 funciones se podria juntar en
    // una sola, pero no veo la necesidad de transformar el conjunto a un array
    // en cada llamada a la funcion

    // conversion a array
    private static Set<Integer> hallarPares(Set<Integer> conjunto, Set<Integer> resultado)
    {
        return hallarPares(conjunto.toArray(new Integer[0]), resultado, 0);
    }

    // conversion a array parte 2
    private static Set<Integer> hallarPares(Integer[] arreglo, Set<Integer> resultado, int index)
    {
        if (index >= arreglo.length) return resultado;

        if (arreglo[index] % 2 == 0) {
            resultado.add(arreglo[index]);
        }

        return hallarPares(arreglo, resultado, index + 1);
    }

    // usando el iterador
    private static Set<Integer> hallarPares(Iterator<Integer> iterador, Set<Integer> resultado)
    {
        if (! iterador.hasNext()) return resultado;

        Integer elemento = iterador.next();

        if (elemento % 2 == 0) {
            resultado.add(elemento);
        }

        return hallarPares(iterador, resultado);
    }
}