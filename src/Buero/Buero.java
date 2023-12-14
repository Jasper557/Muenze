package Buero;

import linear.Queue;

public class Buero {

    private Queue<Person> warteschlange = new Queue<Person>();

    public Buero() {
        //System.out.println("Buero created");
    }

    public void hintenAnstellen(Person p) {
        warteschlange.enqueue(p);
    }

    public void einlassen() {
        warteschlange.dequeue();
    }

    public void sprechstundeBeenden() {
        while (!warteschlange.isEmpty()) {
            warteschlange.dequeue();
        }
    }

    public void ausgabe() {
        Queue<Person> temp = new Queue<Person>();
        while (!warteschlange.isEmpty()) {
            Person p = warteschlange.front();
            System.out.println(p.getName());
            temp.enqueue(p);
            warteschlange.dequeue();
        }
        warteschlange = temp;
    }


}
