package co.edu.uniquindio.punto5;

import java.util.ArrayList;

public class MiLista<E> extends ArrayList<E>
{
    public MiLista()
    {
        super();
    }

    @Override
    public boolean add(E e)
    {
        if (this.contains(e)) {
            return false;
        }

        return super.add(e);
    }
}