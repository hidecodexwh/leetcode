package DayTwo;

public class SOSA977 {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};

        int[] ints = sortedSquares(nums);

        for(int t : ints){
            System.out.println(t);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int low = 0;
        int high = nums.length - 1;
        int pointer = high;

        while(pointer >= 0){
            int powLow = pow(nums[low]);
            int powHigh = pow(nums[high]);
            if(powLow > powHigh){
                ans[pointer] = powLow;
                low++;
            }else{
                ans[pointer] = powHigh;
                high--;
            }
            pointer--;
        }

        return ans;
    }

    public static int pow(int base){
        return base * base;
    }
}
