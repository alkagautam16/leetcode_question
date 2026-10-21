class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int nums = n;
            int product = 1;
        
       while(nums>0){
        int digits = nums% 10;
        product = product* digits;
        nums = nums/10;
    
      
        } if(product%t==0){
          return n ;
        }
        n++;
    }
}
}