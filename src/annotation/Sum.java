package annotation;

public class Sum {
    private static int arr[] = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        diguiSum(arr,7);
    }

    private static void diguiSum(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr.length; j ++) {
                int[] tmp = new int[j + 1];
                int pos = 0;
                for (int k = 0; k < arr.length; k++) {
                    if (sumMethon(arr, target, tmp, pos, k)) break;
                    if (pos < j) {
                        if (sumMethon(arr, target, tmp, pos++, k++)) break;
                    }
                }
            }


//        }

    }

    private static boolean sumMethon(int[] arr, int target, int[] tmp, int pos, int k) {
        tmp[pos] = arr[k];
        int sum = sum(tmp);
        if (sum == target) {
            print(tmp);
        }
        if (sum > target) {
            return true;
        }
        return false;
    }

    private static int sum(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    // 打印组合的可能
    public static void print(int[] cache) {
        for (int i = 0; i < cache.length; i++) {
            System.out.print(cache[i] + ",");
        }
        System.out.println();
    }
}
