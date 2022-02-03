public class tugas5SelectionSortAscendingKiri {
    public static void main(String[] args) {
        int[] A = { 27, 80, 8, 46, 16, 12, 50 };
        int min, temp;
        for (int i = 0; i < (A.length - 1); i++) {
            min = i;
            for (int j = (i + 1); j < A.length; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
            temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }

        System.out.println("Pengurutan Data: ");
        for (int n = 0; n < A.length; n++) {
            System.out.print(A[n] + "\t");
        }
        System.out.println("");
    }
}
