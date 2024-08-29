package co.edu.uniquindio.punto7;

import java.util.ArrayList;

import co.edu.uniquindio.punto1.GeneroPersona;
import co.edu.uniquindio.punto1.Persona;

public class Main
{
    public static void main(String[] args)
    {
        var personas = new ArrayList<Persona>();
        personas.add(new Persona("Juan", 20, GeneroPersona.MASCULINO));
        personas.add(new Persona("Diego", 16, GeneroPersona.FEMENINO));
        personas.add(new Persona("Diana", 23, GeneroPersona.MASCULINO));
        personas.add(new Persona("Andrea", 18, GeneroPersona.FEMENINO));
        personas.add(new Persona("Nicolas", 17, GeneroPersona.MASCULINO));

        System.out.println(Funciones.obtenerMayoresEdad(personas));
    }
}