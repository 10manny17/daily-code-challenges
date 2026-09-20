class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0)
            {
                return false;
            }
        HashMap<Integer, Integer> checkNums = new HashMap<>();
        checkNums.put(0, nums[0]);
        for(int i = 1; i < nums.length; i++)
            {
               if(checkNums.containsValue(nums[i]))
               {
                return true;
               }
               checkNums.put(i, nums[i]);
            }

        return false;
    }
}