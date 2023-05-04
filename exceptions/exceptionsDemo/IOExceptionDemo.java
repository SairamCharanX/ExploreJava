package exceptions.exceptionsDemo;

public class IOExceptionDemo {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            int[] integerArray = new int[10];
            integerArray[11] = 1;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayOutOfBoundsException");
        }
        finally {
            System.out.println("Make sure the indices of the array are checked");
        }
    }
}
