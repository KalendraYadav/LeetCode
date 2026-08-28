class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int ans[]=new int [n];
        int left=0;
        int right=n-1;
        for(int i=0;i<nums.length;i++){
          if(Math.abs(nums[left])>=(nums[right])){
            ans[n-1-i]=nums[left];
            left++;
          }
          else{
            ans[n-1-i]=nums[right];
            right--;
          }

        }
        for(int i=0;i<n;i++){
            ans[i]=ans[i]*ans[i];
        }
        return ans;
        
    }
}