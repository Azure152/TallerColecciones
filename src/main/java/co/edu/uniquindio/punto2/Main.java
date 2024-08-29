package co.edu.uniquindio.punto2;

public class Main
{
    public static void main(String[] args)
    {
        Empresa emp = new Empresa();

        Producto p1 = new Producto("Shampoo", "BC12");
        Producto p2 = new Producto("Talco", "CC101");
        Producto p3 = new Producto("Jabon", "BA01");

        emp.agregarProducto(p1);
        emp.agregarProducto(p2);
        emp.agregarProducto(p3);

        Producto elemento = emp.buscarProducto("CC1010");

        if (elemento != null) {
            System.out.println("El producto es: " + elemento.nombre);
        } else {
            System.out.println("No se ha encontrado el producto");
        }
    }
}