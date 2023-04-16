import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int x = 0; x < 10; x++) {
        list.add(x);
        }

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();

        List<String> sl = new ArrayList<String>();
        sl.add("First");
        sl.add("Second");
        sl.add("Third");
        sl.add("Fourth");
        sl.add("Fifth");


        Iterator its = sl.iterator();

        while(its.hasNext()){
            System.out.print(its.next() + " ");
        }

    }
}