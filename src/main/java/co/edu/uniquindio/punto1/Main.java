package co.edu.uniquindio.punto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Main
{
    public static void main(String[] args)
    {
        var lista = new ArrayList<Persona>();
        lista.add(new Persona("Luis", 22, GeneroPersona.MASCULINO));
        lista.add(new Persona("Marcela", 21, GeneroPersona.FEMENINO));
        lista.add(new Persona("Robinson", 18, GeneroPersona.MASCULINO));
        lista.add(new Persona("Marcela", 19, GeneroPersona.FEMENINO));

        Collections.sort(lista);

        ListIterator<Persona> iterator = lista.listIterator();

        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            System.out.println(persona.getNombre()+": "+persona.getEdad());
        }
    }
}