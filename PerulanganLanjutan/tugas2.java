import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Ketikkan angka berapapun (kecuali 0): ");
            int angka = input.nextInt();

            if (angka == 0) {
                break;
            }
        }
    }
}
