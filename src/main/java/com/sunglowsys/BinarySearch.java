package com.sunglowsys;

public class BinarySearch {
    public static int binarySearch(int number[],int key){
        int Start = 0,end = number.length-1;
        while (Start <= end){
            int mid = (Start + end)/2;
//            comparison
            if (number[mid] == key){
                return  mid;
            }
            if (number[mid] < key){
                Start = mid+1;

            }else {
                end = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        int key = 25 ;
        System.out.println("index for key is : " + binarySearch(number,key));
    }
}
