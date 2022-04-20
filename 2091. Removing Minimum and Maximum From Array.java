------------> search min and max value in array with their index.

---------> check if both min and max at same index ----------------> return mincount of index from left or right ;

-------->if min value index is at left and max value is at right----------------> return min count of( min count of ((right to min index),(left to max index)) , both from opposite side )

-------->if max value index is at left and min value is at right----------------> return min count of( min count of ((right to max index),( left to min index)) , both from opposite side )

class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE ,mini=0;
        int max = Integer.MIN_VALUE ,maxi=0;
        int n= nums.length;
        
        for(int i=0;i<nums.length;i++ ){
            if(min>nums[i]){
                min=nums[i];
                mini=i;
            }
            if(max<nums[i]){
                max=nums[i];
                maxi=i;
            }
            
        }
        
        if(mini==maxi) return (Math.min(mini+1,n-mini));
        else if(mini>maxi)
            return( Math.min( Math.min( n-maxi,mini+1 ), maxi+1+(n-mini) ) );
        else  
            return( Math.min( Math.min( n-mini,maxi+1 ), mini+1+(n-maxi) ) );
        
        
        
        
    }
}
