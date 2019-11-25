package annotation;

public class Test {
    static int arr[][] = {
            {1,   4,  7, 11, 15},
            {2,   5,  8, 12, 19},
            {3,   6,  9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
    };

    public static void main(String[] args) {
//        boolean find = findNum(arr,arr[0].length-1,9,0);
//        System.out.println("args = [" + find + "]");
        boolean isFind = find(1,arr);
        System.out.println("args = [" + isFind + "]");
    }

    private static String replace(String str) {
        for (int i = 0; i < str.length(); i++) {
           char c1 = str.charAt(i);
           if (c1 == ' ') {

           }
        }
        return "";
    }

    private static boolean find(int target,int arr[][]) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return false;
        }
        int r = 0;
        int c = arr[0].length - 1;

        while (r <= arr.length - 1 && c >= 0) {
            if (target == arr[r][c]) {
                return true;
            } else if (target > arr[r][c]) {
                r ++;
            } else {
                c --;
            }
        }
        return false;
    }

    private static boolean findNum(int arr[][],int length, int target,int start) {
        for (int i = start; start < length; start++) {
            if (arr[i][length] > target) {
                if (find(arr[i],target) != 0) {
                    return true;
                }
                findNum(arr,length,target,i + 1);
            } else if (arr[i][length] < target) {
                continue;
            } else {
                return arr[i][length] == target;
            }
        }


        return false;
    }

    private static int find(int arr[],int target) {
        while (arr.length > 0) {
            if (arr[arr.length/2] == target) {
                return target;
            }
        }
        if (arr[0] == target) {
            return target;
        }
        return 0;
    }
}
