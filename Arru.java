public class Arru{

    public int CountHillValley(int[] nums){
        int hill = 0;
        int valley = 0;
        int ans = 0;
         for(int i=1; i<nums.length-1; i++){
            if(nums[i-1] == nums[i]){
                nums[i-1] = nums[i-1]++;
            }else if(nums[i+1] == nums[i]){
                nums[i+1] = nums[i+1]++;
            }else if(nums[i] > nums[i+1] && nums[i] > nums[i-1]){
                hill++;
            }else if(nums[i] < nums[i+1] && nums[i] < nums[i-1]){
                valley++;
            }else{
                return ans;
            }
        }
        ans = hill + valley;
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {2,4,1,1,6,5};
        Arru a = new Arru();
        a.CountHillValley(nums);
    }
}