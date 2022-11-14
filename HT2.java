// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.*;
import java.util.logging.Logger;


public class HT2 {
    public static void main(String[] args) {
        Logger lg = Logger.getAnonymousLogger();
        StringBuilder sb = new StringBuilder();
        List<Integer> mylist = new LinkedList<Integer>();

        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);

        for (int i = 0; i < mylist.size(); i++) {
            sb.append(mylist.get(i));
            sb.append(" , ");
        }

        lg.info(sb.toString());
        enqueue(mylist, 23); // помещает элемент в конец очереди
        dequeue(mylist); // возвращает первый элемент из очереди и удаляет его
        first(mylist); // возвращает первый элемент из очереди, не удаляя
        
    }

    public static void enqueue(List<Integer> l, int num) { // помещает элемент в конец очереди
        StringBuilder sb = new StringBuilder();
        Logger lg = Logger.getAnonymousLogger();
        for (int i = 0; i < l.size(); i++) {
            sb.append(l.get(i));
            sb.append(" , ");
        }
        sb.append(num);
        lg.info(sb.toString());
    }

    public static void dequeue(List<Integer> l) { // возвращает первый элемент из очереди и удаляет его
        StringBuilder sb = new StringBuilder();
        Logger lg = Logger.getAnonymousLogger();
        lg.info((l.get(0)).toString());
        for (int i = 1; i < l.size(); i++) {
            sb.append(l.get(i));
            sb.append(" , ");
        }
        lg.info(sb.toString());
    }

    
    public static void first(List<Integer> l) { // возвращает первый элемент из очереди, не удаляя.
        StringBuilder sb = new StringBuilder();
        Logger lg = Logger.getAnonymousLogger();
        lg.info((l.get(0)).toString());
    }

}
