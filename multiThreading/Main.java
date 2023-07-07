package multiThreading;


public class Main extends Thread{

    public void run(){
        System.out.println("Thread from Main Class running.");
    }
    public static void main(String[] args){
        Main m1 = new Main();
        m1.start();

        Main m2 = new Main();
        m2.start();

    }
}