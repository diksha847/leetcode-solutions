class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,res=0;
     for(int i=1;i<=nums.length;i++)
     {
         sum=sum+i;
     }
        for(int i=0;i<nums.length;i++)
        {
            res=res+nums[i];
        }
        return sum-res;
    }
}