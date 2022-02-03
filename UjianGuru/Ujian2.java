import java.util.Scanner;

public class Ujian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jumlah Deret: ");
        int deret = input.nextInt();

        System.out.print("Habis Dibagi: ");
        int habisbagi = input.nextInt();

        int i = 1;
        int angka = 1;
        while (i <= deret) {
            if(angka % 2 == 0 && angka % habisbagi == 0) {
                System.out.print(angka + " ");
                i++;
            }
            angka++;
        }
    }
}
