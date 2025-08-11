public class SearchTwoDMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }

    static boolean searchMatrix(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;//why we took this,to be cautious of case of if first row empty.

        //Binary Search to find the mid corrected row
        int top = 0;
        int bottom = rows - 1;

        while(top <= bottom){
            int mid = top + (bottom - top)/2;

            if(target < matrix[mid][0]){
                bottom = mid - 1; //move above
            }else if(target > matrix[mid][cols - 1]){
                top = mid + 1; //move below
            }else{
                return binarySearchOnMid(matrix[mid],target);
            }
        }
        return false;
    }

    static boolean binarySearchOnMid(int[] midrow, int target){
        int left = 0, right = midrow.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if (midrow[mid] == target) return true;
            if (midrow[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
