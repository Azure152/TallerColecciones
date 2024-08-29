package co.edu.uniquindio.punto9;

import java.util.Stack;
import java.util.function.Predicate;

public class Main
{
    public static void main(String[] args)
    {
        Stack<Object> elementos = new Stack<>();
        elementos.push(12);
        elementos.push(32);
        elementos.push(43);
        elementos.push(21);
        elementos.push(25);

        Predicate<Object> condicion = (elemento) -> {
            return ((Integer) elemento) > 25;
        };

        // como si fuera una lista
        System.out.println(
            "--------------------------------------------------------------- \n"
            + " Como si fuera una lista (Stack implementa List) \n"
            + "--------------------------------------------------------------- \n\n"
            + Funciones.obtenerElementosCondicion(elementos, condicion)
        );

        System.out.println();

        // con los metodos de una pila
        System.out.println(
            "--------------------------------------------------------------- \n"
            + " Usando los metodos propios de una pila \n"
            + "--------------------------------------------------------------- \n\n"
            + Funciones.obtenerElementosCondicion2(elementos, condicion)
        );
    }
}