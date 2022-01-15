import java.util.Scanner;

public class tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan jumlah angka: ");
        int n = input.nextInt();

        int angka[] = new int[n];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Inputkan angka ke-" + (i + 1) + " = ");
            angka[i] = input.nextInt();
        }

        // Menghitung total angka
        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total = total + angka[i]; // atau bisa ditulis menjadi total += angka[i]
        }

        System.out.println("\nMaka total angkanya adalah: " + total);
    }
}