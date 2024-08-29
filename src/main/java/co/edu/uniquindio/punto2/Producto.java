package co.edu.uniquindio.punto2;

public class Producto implements Comparable<Producto>
{
    public final String nombre;
    public final String codigo;
    public final int precio;

    public Producto(String nombre, String codigo, int precio)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public Producto(String nombre, String codigo)
    {
        this(nombre, codigo, 0);
    }

    @Override
    public int compareTo(Producto o)
    {
        return codigo.compareTo(o.codigo);
    }

    @Override
    public String toString()
    {
        return this.nombre;
    }
}