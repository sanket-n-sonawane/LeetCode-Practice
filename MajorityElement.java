/*
    Majority Element (LeetCode 169)

    Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.

 Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
The input is generated such that a majority element will exist in the array.
*/

import java.util.*;

public class MajorityElement{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    int nums[] = new int[n];

    System.out.println("Enter " + n + " numbers":");
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
    }

    System.out.println("MAjority element is: " + majorityElement(nums));
    sc.close();
  }

  public static int majorityElement(int[] nums)
  {
      for(int i=0;i < nums.length;i++)
      {
        int count=0;
          for(int j=0;j<nums.length;j++)
          {
            if(nums[i]==nums[j]){
              count++;
            }
          }

          if(count>nums.length/2){
            return nums[i]
          }
       }
      return -1;
   }
}
