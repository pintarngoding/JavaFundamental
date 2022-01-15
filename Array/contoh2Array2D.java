public class contoh2Array2D {
    public static void main(String[] args) {
        String siswa[][] = {
                { "Anisa Istiqomah", "1002", "anisa@gmail.com" },
                { "Afrizal Himawan", "1003", "afrizal@gmail.com" },
                { "Riyan Pratama", "1004", "riyan@gmail.com" },
                { "Andika Wahyu", "1005", "andika@gmail.com" }
        };

        for (int i = 0; i < siswa.length; i++) {
            for (int j = 0; j < siswa[i].length; j++) {
                System.out.print(siswa[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}