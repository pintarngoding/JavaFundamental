public class tugas8 {
    public static void main(String[] args) {
        // loop baris 1-5
        for (int i = 1; i <= 5; i++) {
            // loop kolom 1-5
            for (int j = 1; j <= 5; j++) {
                // menampilkan tabel perkalian
                System.out.print(i * j + "\t");
            }
            // menambahkan baris baru
            System.out.println();
        }
    }
}
