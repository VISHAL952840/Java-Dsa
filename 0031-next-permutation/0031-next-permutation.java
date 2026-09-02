class Solution {
    public void nextPermutation(int[] A) {

        // Step 1: Find the pivot
        int pivot = -1;
        int n = A.length;

        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If no pivot, array is in descending order
        if (pivot == -1) {
            int i = 0;
            int j = n - 1;

            while (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;

                i++;
                j--;
            }

            return;
        }

        // Step 2: Find next greater element
        for (int i = n - 1; i > pivot; i--) {
            if (A[i] > A[pivot]) {

                int temp = A[i];
                A[i] = A[pivot];
                A[pivot] = temp;

                break;
            }
        }

        // Step 3: Reverse elements after pivot
        int i = pivot + 1;
        int j = n - 1;

        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            i++;
            j--;
        }
    }
}