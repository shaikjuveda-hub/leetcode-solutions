class Solution {
    public int mySqrt(int x) {
        /*int ans=0;
        for(int i=0;i<=x;i++){
           if(i*i>=x){
            return i;
           }
           return i-1;
        }*/


        
        if(x<2){
            return x;
        }
        int low=0,high=x;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if((long)mid*mid<=x){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}