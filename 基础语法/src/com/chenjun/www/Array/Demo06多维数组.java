package com.chenjun.www.Array;

public class Demo06多维数组 {
    public static void main(String[] args) {
        //[4][2]
        /*
        1,2  array[0]
        2,3  array[1]
        3,4  array[2]
        4,5  array[3]
         */
        int[][] array = {{1,2},{2,3},{3,4},{4,5}};

        System.out.println(array[2][0]);
        System.out.println(array[2][1]);

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.println(array[i][i1]);
            }
        }

    }
}
