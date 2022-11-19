package com.chenjun.www.Array;

public class Demo08稀疏数组 {
    public static void main(String[] args) {
        /*
        稀疏数组
         */
        //1.创建一个二维数组  11*11   0：没有棋子  1：黑棋  2：白棋
        int[][] a=new int[11][11];
        a[1][2] = 1;
        a[2][3] = 1;
        //输出原始的数组
        System.out.println("输出原始的数组：");
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        //转换为稀疏数组保存
        //获取有效值的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(a[i][j]!=0)
                    sum++;
            }
        }
        System.out.println("有效值个数："+sum);


        //2.创建一个稀疏数组的数组
        int[][] a2 = new int[sum+1][3];

        a2[0][0] = 11;
        a2[0][1] = 11;
        a2[0][2] = sum;

        //遍历二维数组，非零值存放于稀疏数组中
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                if(a[i][i1]!=0){
                    count++;
                    a2[count][0] = i;
                    a2[count][1] = i1;
                    a2[count][2] = a[i][i1];
                }
            }
        }

        //输出稀疏数组
        System.out.println("输出稀疏数组：");
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i][0]+"\t"+a2[i][1]+"\t"+a2[i][2]+"\t");
        }

        System.out.println("还原");
        //还原，，，1.读取稀疏数组的值
        int[][] a3 = new int[a2[0][0]][a2[0][1]];

        //2.给其中的元素还原他的值
        for (int i = 1; i < a2.length; i++) {
            a3[a2[i][0]][a2[i][1]] = a2[i][2];
        }

        //3.打印
        System.out.println("输出还原的数组");

        for (int[] ints : a3) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
