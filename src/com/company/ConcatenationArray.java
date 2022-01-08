package com.company;

public class ConcatenationArray {
        public int[] getConcatenation(int[] nums) {
            int [] out = new int[2 * nums.length];
            int a = nums.length;
            for(int i = 0;i< nums.length; i++){
                out[i] = nums[i];
                out[i + a] = nums[i];
            }
            return out;
        }

}
