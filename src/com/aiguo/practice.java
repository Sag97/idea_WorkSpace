package com.aiguo;

public class practice {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,5,6};
        int a = 7;
        twoSum(arr, a);



    }
        //暴力破解
        public static void twoSum(int[] nums, int target) {
            for(int i = 0;i < nums.length; i ++){
                for(int j = i + 1;j < nums.length-1; j ++){ 
                    if(nums[i] + nums[j] == target) {

                        System.out.println("[" + i + "," + j + "]");
                        return;

                    }
                }

            }
        }
}
