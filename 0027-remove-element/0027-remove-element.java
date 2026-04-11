class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int placeholder = 100; //nums[i] is in between 0 and 50
        int temp;
        int stop = nums.length - 1;
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
            if (nums[i] == placeholder) { //final return
                return i;
            }
            if (nums[i] == val) {                
                    /*
                    for (int j = i; j < nums.length-1; j++) {
                        nums[j] = nums[j+1];
                        nums[nums.length-1] = temp;
                } 
                */
                    //for (int j = i; j <= stop; j++) {
                        int j = i;
                        while (j+1 <= nums.length-1) {
                            nums[j] = nums[j+1];
                            j++;
                            System.out.println(Arrays.toString(nums)); //printing will just print the reference object
                        }
                        nums[stop] = placeholder;
                //} 
                stop--;
            }
            if (nums[i] == val || nums[i] == placeholder) {
                i--;
            }

        }
        for (int z = 0; z < nums.length; z++){
            if (nums[z] == placeholder) {
                break;
            }
            count++;
            
        }
        System.out.println("finished for loop");
        return count; //reaches end of for loop, no value in list
    }
}