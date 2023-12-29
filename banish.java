/*
 * https://www.codestepbystep.com/problem/view/java/arrays/banish
 * 12.28.23
 * 
 */


public static void banish(int[] a1, int[] a2) {
    int count = 0;

    for (int i = 0; i < a1.length; i++) {

        if (a1[i] == 0) {
            a1[i] = Integer.MAX_VALUE;

        }
    }

    for (int num: a2) {
        for (int i = 0; i < a1.length; i++)

            if (a1[i] == num) {
                a1[i] = 0;
                count++;
            }
    }

    shiftZeroes(a1);

    for (int j = a1.length - 1; j >= 0 && count > 0; j--) {
        a1[j] = 0;
        count--;
    }

    for (int i = 0; i < a1.length; i++) {
        if (a1[i] == Integer.MAX_VALUE) {
            a1[i] = 0;
        }
    }
}

private static void shiftZeroes(int[] arr) {
    int slow = 0;
    int fast = 0;

    for (; fast < arr.length; fast++) {
        if (arr[fast] != 0) {
            arr[slow] = arr[fast];
            slow++;
        }
    }
}