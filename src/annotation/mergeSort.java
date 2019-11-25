package annotation;

public class mergeSort {
    public static void main(String[] args) {
        int[] arrays = {9, 2, 5, 1, 3, 2, 9, 5, 2, 1, 8};
//        mergeSort(arrays, 0, arrays.length - 1);

        arrays = mergeSort2(arrays, 0, arrays.length - 1);
        for (int i :
                arrays) {

            System.out.println(i + "");
        }
    }

    public static int[] mergeSort2(int nums[],int l,int r) {
        if (l == r) {
            return new int[]{nums[l]};
        }
        int mid = l + (r - l)/ 2;
        int[] leftArr = mergeSort2(nums,l,mid);
        int[] rightArr = mergeSort2(nums,mid + 1,r);
        int[] newArr = new int[leftArr.length + rightArr.length];

        int i = 0,j = 0,m = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newArr[m++] = leftArr[i] < rightArr[j] ? leftArr[i++]:rightArr[j++];
        }

        while (i < leftArr.length) {
            newArr[m++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            newArr[m++] = rightArr[j++];
        }

        return newArr;
    }


    public static int[] mergeSort1(int[] nums, int l, int r) {
        if (l == r)
            return new int[] { nums[l] };

        int mid = l + (r - l) / 2;
        int[] leftArr = mergeSort1(nums, l, mid); //左有序数组
        int[] rightArr = mergeSort1(nums, mid + 1, r); //右有序数组
        int[] newNum = new int[leftArr.length + rightArr.length]; //新有序数组

        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length)
            newNum[m++] = leftArr[i++];
        while (j < rightArr.length)
            newNum[m++] = rightArr[j++];
        return newNum;
    }

    /**
     * 归并排序
     *
     * @param arrays
     * @param L      指向数组第一个元素
     * @param R      指向数组最后一个元素
     */
    public static void mergeSort(int[] arrays, int L, int R) {

        //如果只有一个元素，那就不用排序了
        if (L == R) {
            return;
        } else {

            //取中间的数，进行拆分
            int M = (L + R) / 2;

            //左边的数不断进行拆分
            mergeSort(arrays, L, M);

            //右边的数不断进行拆分
            mergeSort(arrays, M + 1, R);

            //合并
            merge(arrays, L, M + 1, R);

        }
    }

    /**
     * 合并数组
     *
     * @param arrays
     * @param L      指向数组第一个元素
     * @param M      指向数组分隔的元素
     * @param R      指向数组最后的元素
     */
    public static void merge(int[] arrays, int L, int M, int R) {

        //左边的数组的大小
        int[] leftArray = new int[M - L];

        //右边的数组大小
        int[] rightArray = new int[R - M + 1];

        //往这两个数组填充数据
        for (int i = L; i < M; i++) {
            leftArray[i - L] = arrays[i];
        }
        for (int i = M; i <= R; i++) {
            rightArray[i - M] = arrays[i];
        }


        int i = 0, j = 0;
        // arrays数组的第一个元素
        int  k = L;


        //比较这两个数组的值，哪个小，就往数组上放
        while (i < leftArray.length && j < rightArray.length) {

            //谁比较小，谁将元素放入大数组中,移动指针，继续比较下一个
            if (leftArray[i] < rightArray[j]) {
                arrays[k] = leftArray[i];

                i++;
                k++;
            } else {
                arrays[k] = rightArray[j];
                j++;
                k++;
            }
        }

        //如果左边的数组还没比较完，右边的数都已经完了，那么将左边的数抄到大数组中(剩下的都是大数字)
        while (i < leftArray.length) {
            arrays[k] = leftArray[i];

            i++;
            k++;
        }
        //如果右边的数组还没比较完，左边的数都已经完了，那么将右边的数抄到大数组中(剩下的都是大数字)
        while (j < rightArray.length) {
            arrays[k] = rightArray[j];

            k++;
            j++;
        }
    }
}
