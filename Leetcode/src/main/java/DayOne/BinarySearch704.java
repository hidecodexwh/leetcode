package DayOne;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 0;

        search(nums, target);

    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid = -1;

        while(left < right){
            mid = left + ((right - left) >> 2);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return -1;
    }
}
