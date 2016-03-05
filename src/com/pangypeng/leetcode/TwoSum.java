package com.pangypeng.leetcode;

import java.util.ArrayList;

/**
 * Created by pang on 2016/3/5 0005.
 *
 * Desccription:
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 *
 */
public class TwoSum {

    public static ArrayList<int[]> twoSum(int[] nums,int target){
        ArrayList<int[]> lists = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int[] result = new int[2];
            for(int j= i+1;j<nums.length;j++){
//                System.out.println("["+nums[i]+","+nums[j]+"]");
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    lists.add(result);
                }
            }
        }
        return lists;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,4,5,6,7,8};
        ArrayList<int[]> lists = twoSum(nums,10);
        if(lists.size() != 0){
            for(int[] result:lists){
                System.out.println("目标数值在数组中的下标："+"["+result[0]+","+result[1]+"]");
            }
        }else{
            System.out.println("No values matching");
        }

    }
}
