class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int maxProd=Integer.MIN_VALUE;
        
        int leftTOright=1;
        int rightTOleft=1;
        
        for(int i=0;i<n;i++){
            if(leftTOright==0)
               leftTOright=1;
            if(rightTOleft==0)
               rightTOleft=1;
               
            leftTOright *=arr[i];
            int j=n-i-1;
            rightTOleft *=arr[j];
            maxProd=Math.max(leftTOright,Math.max(rightTOleft,maxProd));
        }
        return maxProd;
    }
}