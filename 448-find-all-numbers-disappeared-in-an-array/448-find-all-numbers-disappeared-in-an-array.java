class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
      HashSet<Integer> ht1 = new HashSet<>();
        for(int i =0;i<nums.length;i++)
       {
                    ht1.add(nums[i]);
}
        for(int i=1;i<=nums.length;i++)
        {
           if(ht1.contains(i))
           {
              // ht1.remove(nums[i]);
           }
            else
                result.add(i);
        }
        return result;
    }
} 