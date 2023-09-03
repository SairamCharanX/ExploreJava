package collections;

import java.util.*;
import java.util.Scanner;

public class Runner{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();

        //Insert numbers into the list
        for(int index=0;index<10;index++){
            int temp = scanner.nextInt();
            numbers.add(temp);
        }

        System.out.println("Regular Loop:");
        for(int number : numbers){
            System.out.println(number);
        }

        //Using forEach
        System.out.println("Using forEach:");
        numbers.forEach(number -> {
            System.out.println(number);
        });
    }
}