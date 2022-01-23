import java.util.ArrayList;
import java.util.Scanner;

public class tugas18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> angka = new ArrayList<>();

        System.out.print("Inputkan jumlah angka yang ingin diinputkan: ");
        int jumlahAngka = input.nextInt();
        System.out.println();

        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Inputkan angka ke-" + (i + 1) + ": ");
            angka.add(input.nextInt());
        }

        int total = 0;
        for (int i = 0; i < angka.size(); i++) {
            total += angka.get(i);
        }

        System.out.println("\nTotal angka yang diinputkan: " + total);
        double ratarata = (double) total / (double) angka.size();
        System.out.println("Rata-rata angka yang diinputkan: " + ratarata);
    }
}
