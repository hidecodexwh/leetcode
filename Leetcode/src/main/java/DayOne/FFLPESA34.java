package DayOne;

public class FFLPESA34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

    }

    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid;
        int index = -1;

        while(left < right){
            mid = left + ((right - left) >> 2);

            if(nums[mid] == target){
                index = mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }

        if(index == -1){
            return new int[]{-1, -1};
        }else{
            if(index == 0){
                if(nums[0] == nums[1]){
                    return new int[]{0, 1};
                }else{
                    return new int[]{0, -1};
                }
            }else if(index == nums.length - 1){
                if(nums[index] == nums[index - 1]){
                    return new int[]{index - 1, index};
                }else{
                    return new int[]{-1, index};
                }
            }else{
                if(nums[index] == nums[index - 1]){
                    return new int[]{index-1, index};
                }else if(nums[index] == nums[index + 1]){
                    return new int[]{index, index+1};
                }else{
                    return new int[]{index, -1};
                }


            }
        }
    }
}
