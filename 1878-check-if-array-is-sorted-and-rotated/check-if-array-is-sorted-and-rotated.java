class Solution {
    public boolean check(int[] nums) {
        int breakpoint=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                breakpoint++;
            }
            
        } 
        if(breakpoint==0||(breakpoint ==1&&nums[n-1]<=nums[0]))
        return true;
        else
        return false;
        
    }
}