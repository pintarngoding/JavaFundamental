import java.util.Scanner;

public class inputScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // menerima inputan
        System.out.print("Inputkan angka: ");
        int angka = input.nextInt();

        input.nextLine(); // trik untuk antisipasi nextLine setelah next tipe lain

        System.out.print("Inputkan nama: ");
        String nama = input.nextLine();

        System.out.print("Inputkan angka desimal: ");
        double desimal = input.nextDouble();

        // menampilkan output
        System.out.println("\n======= Output =======");
        System.out.println("Nama: " + nama);
        System.out.println("Angka: " + angka);
        System.out.println("Desimal: " + desimal);
    }
}
