package multiThreading;

public class Main extends Thread{

    public void run(){
        System.out.println("Thread from Main Class running.");
    }
    public static void main(String[] args){
        Main m = new Main();
        m.start();
    }
}