import java.util.Scanner;

public class tugas6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arrAngka[] = { 5, 6, 9, 2, 8, 1, 7 };
        boolean ketemu = false;

        System.out.println("Data angka: ");
        for (int i = 0; i < arrAngka.length; i++) {
            System.out.print(arrAngka[i] + " ");
        }

        System.out.print("\n\nMasukkan key yang dicari: ");
        int key = input.nextInt();

        for (int i = 0; i < arrAngka.length; i++) {
            if (key == arrAngka[i]) {
                System.out.println("Angka " + key + " ditemukan pada data ke-" + (i + 1));
                ketemu = true;
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Angka " + key + " tidak ditemukan di dalam array");
        }
    }
}
