
public class search{
        static int searchInsert(int[] nums, int target) {
        int i = 0;
        while(i < nums.length-1){
            if(target == nums[i]){
                return i;
            }else if(target > nums[i] && target < nums[i+1]){
                return i+1;
            }
        }
        return nums.length;
    }
    public static void main(String [] args){
        int [] nums = {3,4,5,7,9,10};
        System.out.println(searchInsert(nums,4));
        System.out.println(searchInsert(nums,8));
        // searchInsert(nums,8);
    }
}