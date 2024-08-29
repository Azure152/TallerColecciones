package co.edu.uniquindio.punto15;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 32);
        edades.put("diego", 27);
        edades.put("Maria", 24);
        edades.put("fernando", 51);
        edades.put("Miguel", 18);

        System.out.println(
            Funciones.filtrarPorClaveInicioMinuscula(edades)
        );
    }
}