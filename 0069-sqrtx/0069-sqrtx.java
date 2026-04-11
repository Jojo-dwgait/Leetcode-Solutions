class Solution {
    public int mySqrt(int x) {
        if (x == 1) {
            return x;
        }
        long low = 0;
        long high = x;
        long medium = 0;
        while(low < high - 1) {
            medium = (long) ((low + high)/2);
            long result = (medium * medium); //squaring
            if (result > x) {
                high = medium;
            }
            else if (result < x) {
                low = medium;
            }
            else {
                //System.out.println("return in while");
                return (int) medium; 
            }
            
        }
        //System.out.println("return at end");
        return (int) low;

    }
}