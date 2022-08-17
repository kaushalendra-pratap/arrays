package com.sunglowsys;

public class LeanerSearch {
    public static int leanerSearch(int number[],int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16};
       // String manu[] = {"dosa","somosa","chole","fruti"};
        int key = 20;

        int index = leanerSearch(number,key);
        if (index == -1){
            System.out.println("not found");
        }else {
            System.out.println("key is an index : " +index);
        }
        System.out.println("key is at index ");

    }
}
