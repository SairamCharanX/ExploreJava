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
            System.out.println(it.next());
        }

    }
}