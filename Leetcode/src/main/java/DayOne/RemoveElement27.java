package DayOne;

public class RemoveElement27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = -1;

    }

    public static int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;

        while(fast < nums.length){
            if(nums[fast] == val){
                fast++;
            }else{
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
        }

        return slow;
    }
}
