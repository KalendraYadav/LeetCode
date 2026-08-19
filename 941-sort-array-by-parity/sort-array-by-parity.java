class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]=new int[nums.length];
        int indx=0;
        int oddindx=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[indx]=nums[i];
                indx++;
            }
            else{
                ans[oddindx]=nums[i];
                oddindx--;
            }
        }
        return ans;
        
    }
}