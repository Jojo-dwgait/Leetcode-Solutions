class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        else if (n == 0) {
            return false;
        }
        else {
            double result = Math.log(n)/Math.log(2);
            int newRes = (int) result;
            if (Math.pow(2, newRes) == n) {
                return true;
            }
        }
        return false;     
    }
}