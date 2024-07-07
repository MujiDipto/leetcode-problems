import java.util.Arrays;

public class Solution {
    
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] indexedNums = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            indexedNums[i][0] = nums[i];
            indexedNums[i][1] = i;
        }
        
        Arrays.sort(indexedNums, (a, b) -> Integer.compare(a[0], b[0]));
        
        int a1 = 0;
        int a2 = n - 1;
        
        while (a1 < a2) {
            int sum = indexedNums[a1][0] + indexedNums[a2][0];
            if (sum == target) {
                return new int[] { indexedNums[a1][1], indexedNums[a2][1] };
            } else if (sum < target) {
                a1++;
            } else {
                a2--;
            }
        }
        
        throw new IllegalArgumentException("Rt");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
