package org.example.e141;

public class E141AccessModifiers {
    public int maxValue(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        E141AccessModifiers processor = new E141AccessModifiers();
        int[] numbers = {1,5,22,3,7};
        System.out.println(processor.maxValue(numbers));
    }
}
