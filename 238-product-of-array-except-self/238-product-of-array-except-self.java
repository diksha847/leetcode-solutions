class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
      int[] left=new int[n] ;
        left[0]=1;
      int[] right=new int[n] ;
        right[n-1]=1;
        int prod=1,prod1=1;
      for(int i=1;i<n;i++)
      {
       prod=prod*nums[i-1];
          left[i]=prod;
      }
        for(int i=n-2;i>=0;i--)
      {
       prod1=prod1*nums[i+1];
          right[i]=prod1;
      }
             int[] res=new int[n] ;
       for(int i=0;i<n;i++)
       {
           res[i]=left[i]*right[i];
       }
        return res;
    }
}