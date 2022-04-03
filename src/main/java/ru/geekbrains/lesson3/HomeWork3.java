package ru.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println(Arrays.toString(createArray(5,6)));
    }

    public static void invertArray() {
        int arr[] = {1, 0, 1, 1, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.print(arr[i] * 0 + " ");
            } else {
                System.out.print(arr[i] +1 + " ");
            }
        }System.out.println();
    }
    public static void fillArray(){
        int arr1[] = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=i;
            System.out.print(arr1[i]+1 + " ");
        }
        System.out.println();
    }
    public static void changeArray(){
        int arr2[]= {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr2.length ; i++) {
            if (arr2[i] < 6){
                System.out.print(arr2[i] *2 +" ");
            }else {
                System.out.print(arr2[i] +" ");
            }
        }
        System.out.println();
    }
    public static void fillDiagonal(){
        int arr3[][] = new int[4][4];
        int counter=1;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
               // arr3[i][j]=counter;
                if ( j==i  ) {
                    System.out.print(arr3[i][j] + 1 + "  ");
                   // counter++
                }else {
                    System.out.print(arr3[i][j]  + "  ");
                }
            }System.out.println();
        }

    }
    public static int[] createArray(int len, int initialValue){
        int arr4[] = new int [len];
        for (int i = 0; i < len; i++) {
            arr4[i]= initialValue;
        } return arr4;
    }
}