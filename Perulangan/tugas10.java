import java.util.Scanner;

public class tugas10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jawabanUser = "";

        while (!jawabanUser.equalsIgnoreCase("ya")) {
            System.out.print("Apakah anda yakin ingin keluar? Jawab (ya/tidak): ");
            jawabanUser = input.nextLine();
        }

    }
}
