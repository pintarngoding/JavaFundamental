import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.print("Inputkan usia: ");
        int usia = input.nextInt();

        System.out.print("Inputkan kota asal: ");
        String kotaasal = input.next();

        System.out.print("Inputkan tinggi: ");
        double tinggi = input.nextDouble();

        System.out.println("\n======= Output =======");
        System.out.println("Nama Lengkap: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Kota Asal: " + kotaasal);
        System.out.println("Tinggi Badan: " + tinggi);
    }
}
