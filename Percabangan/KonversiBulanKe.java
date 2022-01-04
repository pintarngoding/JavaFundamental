import java.util.Scanner;

public class KonversiBulanKe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan angka hari: ");
        int angkahari = input.nextInt();

        switch (angkahari) {
            case 1:
                System.out.println("Hari Minggu");
                break;
            case 2:
                System.out.println("Hari Senin");
                break;
            case 3:
                System.out.println("Hari Selasa");
                break;
            case 4:
                System.out.println("Hari Rabu");
                break;
            case 5:
                System.out.println("Hari Kamis");
                break;
            case 6:
                System.out.println("Hari Jum\'at");
                break;
            case 7:
                System.out.println("Hari Sabtu");
                break;
            default:
                System.out.println("Angka yang anda inputkan tidak tersedia");
        }
    }
}
