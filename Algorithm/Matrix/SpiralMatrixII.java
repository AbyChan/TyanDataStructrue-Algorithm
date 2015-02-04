Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,
You should return the following matrix:

[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]



public class Solution {

    public int[][] generateMatrix(int n) {

        int[][] mat = new int[n][n];

        if (n <= 0)

            return mat;

        int num = 1;

        int left = 0;

        int right = n - 1;

        int top = 0;

        int bottom = n - 1;

        while (num <= n * n) {

            int i;

            for (i = left; i <= right; i++)

                mat[top][i] = num++;

 

            for (i = top + 1; i <= bottom; i++)

                mat[i][right] = num++;

 

            if (top < bottom)

                for (i = right - 1; i >= left; i--)

                    mat[bottom][i] = num++;

 

            if (left < right)

                for (i = bottom - 1; i >= top + 1; i--)

                    mat[i][left] = num++;

            top++;

            left++;

            bottom--;

            right--;

 

        }

 

        return mat;

    }

}
