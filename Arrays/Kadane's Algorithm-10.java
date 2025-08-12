class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        
    int res=arr[0];
    int maxE=arr[0];
    
    for(int i=1;i<arr.length;i++){
        maxE=Math.max(maxE+arr[i],arr[i]);
        res=Math.max(res,maxE);
     }
     return res;
    }
}