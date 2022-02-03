import java.util.Scanner;

public class tugas11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama[] = { "Misbahul", "Andre", "Ivan", "Andika", "Riyan", "Afrizal" };

        boolean ketemu = false;

        System.out.println("Data nama siswa: ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i]);
        }

        System.out.print("\nMasukkan key yang dicari: ");
        String key = input.nextLine();

        for (int i = 0; i < nama.length; i++) {
            if (key.equalsIgnoreCase(nama[i])) {
                System.out.println("Nama " + key + " ditemukan pada data ke-" + (i + 1));
                ketemu = true;
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Nama " + key + " tidak ditemukan di dalam array");
        }
    }
}
