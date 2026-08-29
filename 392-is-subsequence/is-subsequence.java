class Solution {
    public boolean isSubsequence(String s, String t) {
         
        char[] arr1=s.toCharArray();
        char [] arr2=t.toCharArray();

        int n=arr1.length;
        int m=arr2.length;
        // int small=Math.min(n,m);

        int p1=0;
        int p2=0;
        int count=0;
        while(p1<n&&p2<m){
            if(arr1[p1]==arr2[p2]){
                count++;
                p1++;
                p2++;
            }
            else 
                p2++;
        }

       return p1 == n;
    }
        
    }
