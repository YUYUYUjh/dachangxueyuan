package com.yy.algorithm.arrays;

/**
 * @author Yu
 * @create 2022-02-10 11:36
 * @Description
 */
public class Rotate {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // 不区分子矩阵，直接遍历每一个元素
        for( int i = 0; i < (n + 1)/2; i++ ){
            for( int j = 0; j < n/2; j++ ){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Rotate rotate = new Rotate();

        int[][] image1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate.rotate(image1);

        for (int[] ints : image1) {
            for (int point : ints) {
                System.out.print(point + "\t");
            }
            System.out.println();
        }
    }
}
