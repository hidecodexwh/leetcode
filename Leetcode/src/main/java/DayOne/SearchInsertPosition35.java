package DayOne;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        searchInsert(nums, target);

    }

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length;
        int mid = 0;

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

        if(left == nums.length || nums[left] > target){
            return left;
        }else{
            return left + 1;
        }
    }
}
