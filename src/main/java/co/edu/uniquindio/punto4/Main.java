package co.edu.uniquindio.punto4;

public class Main
{
    public static void main(String[] args)
    {
        MiPila pila = new MiPila();

        pila.add(12);
        pila.add("cadena");
        pila.add("alskdj");
        pila.add(32);
        pila.add(false);

        System.out.println(pila);
    }
}