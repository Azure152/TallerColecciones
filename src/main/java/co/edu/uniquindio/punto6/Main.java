package co.edu.uniquindio.punto6;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main
{
    public static void main(String[] args)
    {
        Queue<Tarea> cola = new PriorityQueue<>(
            Comparator.comparingInt(Tarea::getPrioridad).reversed()
        );

        Tarea t1 = new Tarea("Lavar platos", 1);
        Tarea t2 = new Tarea("Lavar ropa", 3);
        Tarea t3 = new Tarea("Jugar", 2);
        Tarea t4 = new Tarea("Comer", 5);

        cola.offer(t1);
        cola.offer(t2);
        cola.offer(t3);
        cola.offer(t4);

        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());
    }
}