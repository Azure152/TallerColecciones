package co.edu.uniquindio.punto2;

import java.util.Iterator;
import java.util.TreeSet;

public class Empresa
{
    private TreeSet<Producto> productos;

    public Empresa()
    {
        this.productos = new TreeSet<>();
    }

    public void agregarProducto(Producto producto)
    {
        this.productos.add(producto);
    }

    /**
     * busca un producto usando iteradores
     * 
     * @param codigo codigo del producto
     * 
     * @return el producto o null en caso de no encontrarlo
     */
    public Producto buscarProducto(String codigo)
    {
        Iterator<Producto> it = this.productos.iterator();

        while (it.hasNext()) {
            Producto e = it.next();

            if (e.codigo.equals(codigo)) return e;
        }

        return null;
    }
}