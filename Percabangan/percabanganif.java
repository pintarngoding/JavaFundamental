import java.util.Scanner;

public class percabanganif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.print("Inputkan total belanja Anda: ");
        belanja = input.nextInt();

        if (belanja >= 500000) {
            System.out.println("Selamat! Anda mendapatkan hadiah gantungan kunci");
        } else {
            int selisihbelanja = 500000 - belanja;
            System.out.println("Belanja anda kurang dari Rp. 500.000");
            System.out.println("Silahkan tambah lagi belanjanya senilai Rp. " + selisihbelanja);
            System.out.println("Agar bisa mendapatkan bonus gantungan kunci");
        }
    }
}
