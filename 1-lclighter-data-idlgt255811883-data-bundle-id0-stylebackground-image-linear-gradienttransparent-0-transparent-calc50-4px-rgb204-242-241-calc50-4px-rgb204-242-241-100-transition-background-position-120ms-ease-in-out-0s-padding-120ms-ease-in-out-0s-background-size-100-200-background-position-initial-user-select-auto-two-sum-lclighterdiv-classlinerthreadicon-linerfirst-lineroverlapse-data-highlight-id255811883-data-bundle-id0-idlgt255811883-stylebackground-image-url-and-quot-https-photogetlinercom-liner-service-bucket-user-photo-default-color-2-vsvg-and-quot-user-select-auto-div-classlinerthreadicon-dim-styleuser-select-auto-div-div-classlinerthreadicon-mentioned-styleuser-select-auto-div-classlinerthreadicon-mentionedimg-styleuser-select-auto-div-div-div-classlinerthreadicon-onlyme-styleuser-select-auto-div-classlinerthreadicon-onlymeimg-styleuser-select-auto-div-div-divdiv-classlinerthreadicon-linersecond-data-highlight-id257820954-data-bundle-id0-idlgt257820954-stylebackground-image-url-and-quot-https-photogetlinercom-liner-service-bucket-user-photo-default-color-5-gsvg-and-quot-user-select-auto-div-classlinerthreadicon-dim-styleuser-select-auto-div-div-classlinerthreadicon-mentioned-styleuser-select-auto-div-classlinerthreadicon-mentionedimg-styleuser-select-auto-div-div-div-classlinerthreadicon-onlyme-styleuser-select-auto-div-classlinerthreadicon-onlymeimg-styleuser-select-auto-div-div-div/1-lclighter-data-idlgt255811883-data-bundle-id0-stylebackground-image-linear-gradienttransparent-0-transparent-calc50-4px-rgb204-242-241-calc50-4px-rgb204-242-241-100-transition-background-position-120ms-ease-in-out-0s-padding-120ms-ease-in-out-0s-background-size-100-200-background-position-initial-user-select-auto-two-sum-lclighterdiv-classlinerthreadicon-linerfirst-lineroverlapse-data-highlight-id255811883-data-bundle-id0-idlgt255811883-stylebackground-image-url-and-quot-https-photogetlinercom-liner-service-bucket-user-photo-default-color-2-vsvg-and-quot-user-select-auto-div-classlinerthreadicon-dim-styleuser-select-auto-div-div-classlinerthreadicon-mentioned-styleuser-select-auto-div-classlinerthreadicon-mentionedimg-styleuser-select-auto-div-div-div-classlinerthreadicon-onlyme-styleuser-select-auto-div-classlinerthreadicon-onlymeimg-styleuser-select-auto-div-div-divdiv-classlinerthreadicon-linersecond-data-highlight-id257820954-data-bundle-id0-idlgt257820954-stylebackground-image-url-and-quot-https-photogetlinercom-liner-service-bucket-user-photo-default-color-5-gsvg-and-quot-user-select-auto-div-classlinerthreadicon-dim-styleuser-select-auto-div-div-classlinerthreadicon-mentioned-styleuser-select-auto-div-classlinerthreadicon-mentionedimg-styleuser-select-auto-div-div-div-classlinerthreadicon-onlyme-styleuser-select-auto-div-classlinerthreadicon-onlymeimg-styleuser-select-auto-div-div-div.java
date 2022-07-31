class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> l = new HashMap<>();
        int a[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(l.containsKey(target-nums[i]))
            {
                a[0] = l.get(target-nums[i]);
                a[1]=i;
                return a;
            }
            l.put(nums[i],i);
        }
        return a;
    }
}