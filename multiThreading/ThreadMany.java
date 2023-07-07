public class ThreadMany extends Thread{
    public void run(){
        System.out.println("Thread from ThreadMany class running.");
    }

    public static void main(){
        ThreadMany tm1 = new ThreadMany();
        tm1.run();
    }
}
