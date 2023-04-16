import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args){
        int[] nums = new int[10];
        int[] sums = new int[10];
        //Filling the array
        for(int index=0;index<10;index++){
            nums[index] = index;
        }

        //Cumulative(Running) sum of the elements in a new array
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                sums[i] = nums[i] + nums[j];
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sums));
    }
}