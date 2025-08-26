package CYCLICSORT;

import java.util.*;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int start, int k){
        int temp = arr[start];
        arr[start] = arr[k];
        arr[k] = temp;
    }

    // 🔹 Add this to make file runnable
    public static void main(String[] args) {
        FindDuplicates fd = new FindDuplicates();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(fd.findDuplicates(nums));
    }
}
