class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int eindx=0;
        int oindx=1;
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[eindx]=nums[i];
                eindx+=2;
            }
            else{
                ans[oindx]=nums[i];
                oindx+=2;
            }
        }
        return ans;
        
    }
}