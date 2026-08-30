class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> inputElement=new HashMap<>();
        List<Integer> valueArray=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            inputElement.put(nums[i],inputElement.getOrDefault(nums[i],0)+1);
        }
        for(Integer key:inputElement.keySet()){
            if(inputElement.get(key)>(nums.length/3)){
                valueArray.add(key);
            }
        }
        return valueArray;
    }
}