class Solution {
    public int removeElement(int[] nums, int val) {
        // int[] expectedNums=new int[nums.length];
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                // expectedNums[left]=nums[i];
                nums[left++]=nums[i];
            }
        }
        return left;
    }
}