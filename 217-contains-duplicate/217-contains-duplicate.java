class Solution {
    public boolean containsDuplicate(int[] arr) {
       int limit=2;
        
      HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
      for(int i=0;i<arr.length;i++)
      {
          if(result.containsKey(arr[i]))
          {
             result.put(arr[i] , result.get(arr[i]) + 1);
             
            }
            else{
                result.put(arr[i] , 1);
            }
           if(result.get(arr[i])>=limit)
              {
                  return true;
              }
      }
        return false;
      
    }
}
 