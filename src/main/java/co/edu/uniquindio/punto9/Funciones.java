package co.edu.uniquindio.punto9;

import java.util.Stack;
import java.util.function.Predicate;

public class Funciones
{
    /**
     * obtenemos los elementos de una pila que cumplen una condicion
     * (nos aprovechamos del hecho de que la pila es una lista)
     * 
     * @param pila pila a reccorer
     * @param condicion condicion de filtrado
     * 
     * @return pila con elementos que cumplen la condicion
     */
    public static Stack<Object> obtenerElementosCondicion(
        Stack<Object> pila,
        Predicate<Object> condicion
    ) {
        return obtenerElementosCondicion(pila, new Stack<Object>(), condicion, 0);
    }

    // implementacion recursiva
    private static Stack<Object> obtenerElementosCondicion(
        Stack<Object> pila,
        Stack<Object> resultado,
        Predicate<Object> condicion,
        int index 
    ) {
        if (index >= pila.size()) {
            return resultado;
        }

        Object elemento = pila.get(index);

        if (condicion.test(elemento)) resultado.push(elemento);

        return obtenerElementosCondicion(pila, resultado, condicion, index + 1);
    }

    /**
     * obtenemos los elementos de una pila que cumplen una condicion
     * (utiliza los metodos caracteristicos de una pila pero altera la pila original)
     * 
     * @param pila pila a reccorer
     * @param condicion condicion de filtrado
     * 
     * @return pila con elementos que cumplen la condicion
     */
    public static Stack<Object> obtenerElementosCondicion2(
        Stack<Object> pila,
        Predicate<Object> condicion
    ) {
        return obtenerElementosCondicion2(pila, new Stack<Object>(), condicion);
    }

    // implementacion recursiva
    private static Stack<Object> obtenerElementosCondicion2(
        Stack<Object> pila,
        Stack<Object> resultado,
        Predicate<Object> condicion
    ) {
        if (pila.isEmpty()) return resultado;

        Object elemento = pila.pop();

        if (condicion.test(elemento)) resultado.push(elemento);

        return obtenerElementosCondicion2(pila, resultado, condicion);
    }
}
