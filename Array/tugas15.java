import java.util.ArrayList;
import java.util.Arrays;

public class tugas15 {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("Daftar Angka: ");
        for (int i = 0; i < angka.size(); i++) {
            System.out.print(angka.get(i) + " ");
        }

        System.out.println("\n\nMenambahkan angka 60 s/d 80");
        angka.add(60);
        angka.add(70);
        angka.add(80);

        System.out.println("\nDaftar Angka Setelah Ditambahkan: ");
        for (int i = 0; i < angka.size(); i++) {
            System.out.print(angka.get(i) + " ");
        }
    }
}
