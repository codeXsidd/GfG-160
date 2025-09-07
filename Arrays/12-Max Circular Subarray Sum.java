class Solution {
    public int maxCircularSum(int arr[]) {
        int tsum=0;
        int cMaxs=0,cMins=0;
        int mins=arr[0],maxs=arr[0];
        
        for(int i=0;i<arr.length;i++){
            cMaxs=Math.max(cMaxs+arr[i],arr[i]);
            maxs=Math.max(maxs,cMaxs);
            cMins=Math.min(cMins+arr[i],arr[i]);
            mins=Math.min(mins,cMins);
            
            tsum+=arr[i];
        }
        int nsum=maxs;
        int cirSum=tsum-mins;
        
        if(mins==tsum)
           return nsum;
           
        return Math.max(nsum,cirSum);
    }
}