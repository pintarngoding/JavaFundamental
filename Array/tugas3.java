import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] laptop = new String[3];
        String[] handphone = new String[3];

        for (int i = 0; i < laptop.length; i++) {
            System.out.print("Masukkan nama merk laptop: ");
            laptop[i] = br.readLine();
        }

        for (int i = 0; i < handphone.length; i++) {
            System.out.print("Masukkan nama merk handphone: ");
            handphone[i] = br.readLine();
        }

        // menampilkan isi data array
        System.out.println("\n--------- Data Laptop -----------");
        for (int i = 0; i < laptop.length; i++) {
            System.out.println((i + 1) + ". " + laptop[i]);
        }

        System.out.println("\n--------- Data Handphone -----------");
        for (int i = 0; i < handphone.length; i++) {
            System.out.println((i + 1) + ". " + handphone[i]);
        }
    }
}