import java.util.Scanner;

public class tugas13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matriksA[][] = new int[3][2];
        int matriksB[][] = new int[3][2];

        // untuk menyimpan hasil penjumlahan, dibuatlah variabel array baru
        int penjumlahanMatriks[][] = new int[3][2];

        // menginputkan nilai Matriks A
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                System.out.print("Inputkan nilai Matriks A baris " + i + " kolom " + j + ": ");
                matriksA[i][j] = input.nextInt();
            }
        }

        // menginputkan nilai Matriks B
        System.out.println();
        for (int i = 0; i < matriksB.length; i++) {
            for (int j = 0; j < matriksB[i].length; j++) {
                System.out.print("Inputkan nilai Matriks B baris " + i + " kolom " + j + ": ");
                matriksB[i][j] = input.nextInt();
            }
        }

        // menampilkan data matriks A
        System.out.println("Matriks A");
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                System.out.print(matriksA[i][j] + "\t");
            }
            System.out.println("");
        }

        // menampilkan data matriks B
        System.out.println("\nMatriks B");
        for (int i = 0; i < matriksB.length; i++) {
            for (int j = 0; j < matriksB[i].length; j++) {
                System.out.print(matriksB[i][j] + "\t");
            }
            System.out.println("");
        }

        // menjumlahkan matriks A dan Matriks B
        System.out.println("\nHasil penjumlahan Matriks A + Matriks B");
        for (int i = 0; i < matriksB.length; i++) {
            for (int j = 0; j < matriksB[i].length; j++) {
                penjumlahanMatriks[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.print(penjumlahanMatriks[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}