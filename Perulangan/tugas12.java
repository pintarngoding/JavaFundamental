import java.util.Scanner;

public class tugas12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("-------------------------");
            System.out.println("Menu:\n1. Penjumlahan\n2. Pengurangan\n3. Keluar");
            System.out.print("Masukkan menu pilihan Anda: ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Anda memilih menu PENJUMLAHAN");
                    break;
                case 2:
                    System.out.println("Anda memilih menu PENGURANGAN");
                    break;
                case 3:
                    System.out.println("Program berhenti!");
                    break;
            }
            System.out.println("\n");
        } while (menu != 3);
    }
}
