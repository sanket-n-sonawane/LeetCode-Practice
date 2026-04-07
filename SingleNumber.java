/*Single Number (LeetCode 136)
Problem: Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Example: [4,1,2,1,2] → 4
*/
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Single number is: " + singleNumber(nums));
        sc.close();
    }

    public static int singleNumber(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return -1;
    }
}
