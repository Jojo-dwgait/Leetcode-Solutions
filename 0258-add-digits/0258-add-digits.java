import java.util.*;

class Solution {
    public int addDigits(int num) {
        String len = String.valueOf(num);
        ArrayList<String> newNums = new ArrayList<String>();
        for (int i = 0; i < len.length(); i++) {
            newNums.add(len.substring(i, i+1));
        }
        int newNum = 0;
        for (int j = 0; j < newNums.size(); j++) {
            int backTo = Integer.parseInt(newNums.get(j));
            newNum += backTo;
        }
        if (newNum > 9) {
            return addDigits(newNum);
        }
        else {
            return newNum;
        }
    }
}
