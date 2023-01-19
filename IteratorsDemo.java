//Partially done. Throws an exception ConcurrentModificationException.


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorsDemo {
    public static void main(String[] args) {

    int x = 0;
    List<Integer> intList = new LinkedList<Integer>();
    while(x<10){
        intList.add(x);
        x += 1;
    }

    Iterator<Integer> itr;
    itr = intList.iterator();

    while(itr.hasNext()){
        intList.add(itr.next());
    }
        System.out.println(intList.toString());
    }
}
