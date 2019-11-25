package annotation;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,3,0,0,0,0,0};
        int[] a2 = new int[]{2,5,6,7,9};
        merge1(a1,3,a2,5);
        for (int i = 0;i<a1.length;i++) {
            System.out.println("" + a1[i]);
        }
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] copy = new int[m];
        System.arraycopy(nums1,0,copy,0,m);
        int x = 0;
        int y = 0;
        int z = 0;
        while(x < copy.length && y < nums2.length) {
            if (copy[x] <= nums2[y]) {
                nums1[z] = copy[x];
                x ++;
            } else {
                nums1[z] = nums2[y];
                y ++;
            }
            z ++ ;
        }
        if (x < copy.length) {
            System.arraycopy(copy,x,nums1,x+y,m+n-x+y);
        }
        if (y < copy.length) {
            System.arraycopy(copy,y,nums1,x+y,m+n-x+y);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Make a copy of nums1.
        int [] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);

        // Two get pointers for nums1_copy and nums2.
        int p1 = 0;
        int p2 = 0;

        // Set pointer for nums1
        int p = 0;

        // Compare elements from nums1_copy and nums2
        // and add the smallest one into nums1.
        while ((p1 < m) && (p2 < n))
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];

        // if there are still elements to add
        if (p1 < m)
            System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        if (p2 < n)
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        // two get pointers for nums1 and nums2
        int p1 = m - 1;
        int p2 = n - 1;
        // set pointer for nums1
        int p = m + n - 1;

        // while there are still elements to compare
        while ((p1 >= 0) && (p2 >= 0)) {
            // compare two elements from nums1 and nums2
            // and add the largest one in nums1
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
        }
        // add missing elements from nums2
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
