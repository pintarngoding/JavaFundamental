public class tugas10 {
    public static void main(String[] args) {
        String nama[] = { "Kenzo Ismail", "Desmon Daffa", "Kayla Isabela", "Khansa Zakira" };
        int nilai[][] = {
                { 80, 90, 62 },
                { 60, 82, 87 },
                { 89, 59, 65 },
                { 77, 75, 60 }
        };

        // Menampilkan data dalam bentuk tabel
        System.out.println("| No.\t| Nama\t\t| Nilai1| Nilai2| Nilai3|");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("| " + (i + 1) + "\t| " + nama[i] + "\t");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("| " + nilai[i][j] + "\t");
            }
            System.out.print("|");
            System.out.println();
        }

        // Menghitung rata-rata setiap siswa
        int totalNilai;
        System.out.println("\n====== Nilai rata-rata ======");
        for (int i = 0; i < nilai.length; i++) { // perulangan untuk baris
            totalNilai = 0;
            System.out.print(nama[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) { // perulangan untuk kolom
                totalNilai += nilai[i][j]; // menghitung total nilai setiap baris
            }
            System.out.println(totalNilai / 3); // menghitung rata-rata
        }
    }
}
