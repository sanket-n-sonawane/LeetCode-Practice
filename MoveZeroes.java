/*
        Move Zeroes (LeetCode 283)

  Given an integer array nums, move all 0's to the end of it 
  while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
*/

import java.util.Scanner;
import java.util.Arrays;

public class MoveZeroes{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Enter the size of array: ");
    int n = sc.nextInt();
    int[] nums = new int[n];

    System.out.println("Enter " + n + " elements": ");
      for(int i=0;i<n;i++)
      {
          nums[i]=sc.nextInt();
      }

    moveZeroes(nums);
    System.out.println("Array after moving the zeroes: " + Arrays.toString(nums));
    sc.close();
  }

  public static void moveZeroes(int[] nums){
      int i=0;
      for(int j=0;j<nums.length;j++){
        if(nums[j]!=0){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
          i++;
        }
      }
  }
}
