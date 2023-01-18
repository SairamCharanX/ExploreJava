import java.util.ArrayList;

public class CollectionsPractice{
    public static void main(String[] args){
        ArrayList<Integer> intList = new ArrayList<>();
        for(int x=0;x<10;x++){
            intList.add(x);
        }
        System.out.println(intList.toString());


        for (int x=10;x<=100;x++){
            intList.add(x);

        }
        ArrayList<Integer> newList = new ArrayList<>();
        newList.addAll(intList);
        System.out.println(newList);


    }
}
