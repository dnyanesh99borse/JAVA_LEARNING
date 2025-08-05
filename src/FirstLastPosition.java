import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args){
        int[] nums = {5,7,7,7,7,78,10};
        int target = 7;
        int[] ans = findFirstLastPosition(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findFirstLastPosition(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        int[] ans = new int[]{-1, -1};  // initialize result

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                int left = mid;
                int right = mid;

                while(left > 0 && nums[left-1] == target){
                    left--;
                }

                while(right < nums.length - 1 && nums[right+1] == target){
                    right++;
                }

                ans[0] = left;
                ans[1] = right;
                return ans;
            }
        }
        return ans;
    }
}
