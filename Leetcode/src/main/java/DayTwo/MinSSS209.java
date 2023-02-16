package DayTwo;

public class MinSSS209 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        minSubArrayLen(target, nums);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int minSize = 100001;

        int fast = 0;
        int slow = 0;
        int sum = nums[fast];

        while(fast < nums.length){
            while(sum >= target){
                int newSize = fast - slow + 1;
                minSize = minSize > newSize ? newSize : minSize;
                sum -= nums[slow];
                slow++;
            }

            fast++;
            if(fast == nums.length){
                break;
            }
            sum += nums[fast];
        }
        return minSize == 100001 ? 0 : minSize;
    }
}
