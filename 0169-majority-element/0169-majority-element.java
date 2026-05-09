class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int majCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > majCount) {
                majCount = count;
                maj = nums[i];
            }
        }
        return maj;
    }
}