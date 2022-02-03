public class tugas6SelectionSortAscendingKanan {
    public static void main(String[] args) {
        int[] A = { 27, 80, 8, 46, 16, 12, 50 };
        int max, temp;
        for (int i = (A.length-1); i > 0; i--) {
            max = i;
            for (int j = (i - 1); j >= 0; j--) {
                if (A[j] > A[max]) {
                    max = j;
                }
            }
            temp = A[i];
            A[i] = A[max];
            A[max] = temp;
        }

        System.out.println("Pengurutan Data: ");
        for (int n = 0; n < A.length; n++) {
            System.out.print(A[n] + "\t");
        }
        System.out.println("");
    }
}
