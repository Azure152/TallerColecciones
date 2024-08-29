package co.edu.uniquindio.punto6;

public class Tarea
{
    public final String titulo;
    public final int prioridad;

    public Tarea(String titulo, int prioridad)
    {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public int getPrioridad()
    {
        return this.prioridad;
    }

    @Override
    public String toString()
    {
        return this.titulo;
    }
}