class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        //change of base formula
        double result = Math.log(n)/Math.log(3) + 0.5;
        //System.out.println(result)
        //prevents rounding error
        int newRes = (int) result;
        if (Math.pow(3, newRes) == n) {
                return true;
        }
    return false;
    }
}