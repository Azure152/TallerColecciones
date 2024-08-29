package co.edu.uniquindio.punto4;

import java.util.Stack;

public class MiPila extends Stack<Object>
{
    public MiPila()
    {
        super();
    }

    @Override
    public synchronized boolean add(Object e)
    {
        if (
            this.size() == 0
            || e.getClass() == this.lastElement().getClass()
        ) {
            return super.add(e);
        }

        return false;
    }
}