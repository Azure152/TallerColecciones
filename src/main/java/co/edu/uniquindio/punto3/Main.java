package co.edu.uniquindio.punto3;

import java.util.HashMap;

import co.edu.uniquindio.punto1.GeneroPersona;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<String, Estudiante> estudiantes = new HashMap<>();

        var e1 = new Estudiante("Juan", 20, GeneroPersona.MASCULINO, "1");
        var e2 = new Estudiante("Luis", 20, GeneroPersona.MASCULINO, "2");
        var e3 = new Estudiante("Diego", 23, GeneroPersona.MASCULINO, "3");

        estudiantes.put(e1.getMatricula(), e1);
        estudiantes.put(e2.getMatricula(), e2);
        estudiantes.put(e3.getMatricula(), e3);

        System.out.println(estudiantes.get("3").getNombre());
    }
}