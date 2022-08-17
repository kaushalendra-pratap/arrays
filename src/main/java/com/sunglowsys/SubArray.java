package com.sunglowsys;

public class SubArray {
    public static void subPrinte(int number[]){
        int ts = 0;
        for (int i = 0;i< number.length;i++){
            int start = i;
            for (int j = i+1;j< number.length;i++){
                int end = j;
                for (int k = start;k<=end;k++){
                    System.out.println(number[k]+ " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arrays = " +ts);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        subPrinte(number);
    }
}
