class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int start =0;
        int end=n-1;
        while(start<end){
            int twosum[]=new int[2];
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                twosum[0]=start+1;
                twosum[1]=end+1;
                return twosum;
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
       return new int[0];
        
    }
}