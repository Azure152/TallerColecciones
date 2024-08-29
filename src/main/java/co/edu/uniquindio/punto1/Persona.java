package co.edu.uniquindio.punto1;

public class Persona implements Comparable<Persona>
{
    private String nombre;
    private int edad;
    private GeneroPersona genero;

    public Persona(String nombre, int edad, GeneroPersona genero)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    @Override
    public int compareTo(Persona o)
    {
        int comparacion = nombre.compareTo(o.getNombre());
        if (comparacion != 0) return comparacion;

        return Integer.compare(edad, o.edad);
    }

    @Override
    public String toString()
    {
        return this.nombre;
    }

    // AUTO-GENERATED

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public GeneroPersona getGenero() {
        return genero;
    }

    public void setGenero(GeneroPersona genero) {
        this.genero = genero;
    }

}