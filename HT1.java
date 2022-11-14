// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.*;
import java.util.logging.Logger;



public class HT1 {
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
        reversedList(mylist);
    }

    public static void reversedList(List<Integer> l) {
        StringBuilder sb = new StringBuilder();
        Logger lg = Logger.getAnonymousLogger();
        for (int i = (l.size() - 1); i >= 0; i--) {
            sb.append(l.get(i));
            sb.append(" , ");
        }
        lg.info(sb.toString());
    }
}
