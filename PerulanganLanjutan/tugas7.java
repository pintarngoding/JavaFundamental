import java.util.Scanner;

public class tugas7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan jumlah baris/kolom: ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            for (int j = 1; j <= jumlah; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
