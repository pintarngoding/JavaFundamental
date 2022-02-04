import java.util.Scanner;

public class Ujian1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total Belanja: ");
        int totalbelanja = input.nextInt();

        if (totalbelanja >= 500000 && totalbelanja <= 1000000) {
            System.out.println("Anda mendapat diskon 10%. Sehingga total yang harus dibayarkan: Rp. "
                    + (totalbelanja - (totalbelanja * 0.1)));
        } else if (totalbelanja > 1000000) {
            System.out.println("Anda mendapat diskon 20%. Sehingga total yang harus dibayarkan: Rp. "
                    + (totalbelanja - (totalbelanja * 0.2)));
        } else {
            System.out.println("Anda tidak mendapat diskon. Silahkan tambah belanja anda sebesar Rp. "
                    + (500000 - totalbelanja) + " untuk mendapat diskon 10%");
        }
    }
}
