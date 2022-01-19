import java.util.Scanner;

public class tugas11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan jumlah data: ");
        int n = input.nextInt();

        String nama[] = new String[n];
        int nilai[][] = new int[n][3];

        // inputan nama
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Inputkan nama ke-" + (i + 1) + ": ");
            nama[i] = input.next();
        }

        // inputan nilai
        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Inputkan Nilai" + (j + 1) + " " + nama[i] + ": ");
                nilai[i][j] = input.nextInt();
            }
        }

        // menghitung nilai setiap siswa
        System.out.println("\n======= Nilai Rata-Rata Siswa =======");
        int totalNilai, ratarataNilai;
        for (int i = 0; i < nilai.length; i++) {
            totalNilai = 0;
            System.out.print(nama[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                totalNilai += nilai[i][j];
            }
            ratarataNilai = totalNilai / nilai[i].length;
            if (ratarataNilai >= 81 && ratarataNilai <= 100) {
                System.out.println(ratarataNilai + " --> Nilai A");
            } else if (ratarataNilai >= 71 && ratarataNilai <= 80) {
                System.out.println(ratarataNilai + " --> Nilai B");
            } else if (ratarataNilai >= 51 && ratarataNilai <= 70) {
                System.out.println(ratarataNilai + " --> Nilai C");
            } else if (ratarataNilai >= 31 && ratarataNilai <= 50) {
                System.out.println(ratarataNilai + " --> Nilai D");
            } else if (ratarataNilai >= 0 && ratarataNilai <= 30) {
                System.out.println(ratarataNilai + " --> Nilai E");
            }
        }
    }
}
