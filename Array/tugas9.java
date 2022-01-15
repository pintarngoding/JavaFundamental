public class tugas9 {
    public static void main(String[] args) {
        int[][] angka = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 }
        };
        int total;

        for (int i = 0; i < angka.length; i++) {
            total = 0;
            System.out.print("Total Penjumlahan: ");
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j] + " ");
                total = total + angka[i][j];
            }
            System.out.print("= " + total);
            System.out.println();
        }
    }
}