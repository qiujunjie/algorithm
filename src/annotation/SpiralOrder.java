package annotation;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> integers = spiralOrder(arr);
        for (Integer itg :
                integers) {
            System.out.printf(itg+"");
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int r = 0;
        int b = 0;
        int l = matrix[0].length;
        int t = matrix.length;
        List<Integer> list = new ArrayList<>(l*t);
        int half = Math.min(l,t) + 1 / 2;
        int pos = 0;
        while (pos <= half) {
            for (;r < l;r++) {
                list.add(matrix[b][r]);
            }
            b ++;
            for (; b < t;b++) {
                list.add(matrix[b][r]);
            }
            r --;
            for (; r > pos;r--) {
                list.add(matrix[b][r]);
            }
            b --;
            for (; b > pos;r--) {
                list.add(matrix[b][r]);
            }
            l --;
            t --;
            r++;
            pos ++;
        }
        return list;
    }
}
