import java.util.*;
public class LambdaTest{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Bob", "Charan");
        names.forEach(System.out::println);
    }
}