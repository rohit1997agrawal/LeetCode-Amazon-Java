class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i=0 ; i<nums.length ; i++)
        {
            int compliment = target - nums[i];
            if(hash.containsKey(compliment))
            {
                result[0]=i;
                result[1]=hash.get(compliment);
                return result;
            }
            hash.put(nums[i],i);
        }
        return null;  
    }
}
