package co.edu.uniquindio.punto5;

public class Main
{
    public static void main(String[] args)
    {
        MiLista<Integer> lista = new MiLista<>();
        lista.add(12);
        lista.add(12);
        lista.add(12);
        lista.add(32);

        var it = lista.listIterator();

        while (it.hasNext()) {
            int e = it.next();
            System.out.println(e);
        }
    }
}