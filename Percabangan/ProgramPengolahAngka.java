import java.util.Scanner;

public class ProgramPengolahAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1 = 0, angka2 = 0;

        System.out.println("Pilihan menu:");
        System.out.println("1. Penentuan Angka Terbesar");
        System.out.println("2. Penentuan Angka Ganjil dan Genap");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihanmenu = input.nextInt();

        switch (pilihanmenu) {
            case 1:
                System.out.print("Inputkan Angka Pertama: ");
                angka1 = input.nextInt();

                System.out.print("Inputkan Angka Kedua: ");
                angka2 = input.nextInt();

                if (angka1 > angka2) {
                    System.out.println("Angka pertama: " + angka1 + " lebih besar dari angka kedua: " + angka2);
                } else {
                    System.out.println("Angka kedua: " + angka2 + " lebih besar dari angka pertama: " + angka1);
                }
                break;
            case 2:
                System.out.print("Inputkan Angka Pertama: ");
                angka1 = input.nextInt();

                System.out.print("Inputkan Angka Kedua: ");
                angka2 = input.nextInt();

                if (angka1 % 2 == 0) {
                    System.out.println("Angka pertama: " + angka1 + " adalah BILANGAN GENAP");
                } else {
                    System.out.println("Angka pertama: " + angka1 + " adalah BILANGAN GANJIL");
                }

                if (angka2 % 2 == 0) {
                    System.out.println("Angka kedua: " + angka2 + " adalah BILANGAN GENAP");
                } else {
                    System.out.println("Angka kedua: " + angka2 + " adalah BILANGAN GANJIL");
                }
                break;
            default:
                System.out.println("Pilihan Anda tidak tersedia");
        }
    }
}
