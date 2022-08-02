class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     Arrays.sort(nums);
        ArrayList<Integer> arrli=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                arrli.add(nums[i]);
            }
        }
        return arrli;
    }
}