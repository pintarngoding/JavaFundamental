import java.util.Scanner;

public class tugas9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil = 1;

        System.out.print("Nilai: ");
        int nilai = input.nextInt();

        while (nilai >= 1) {
            hasil *= nilai;
            nilai--;
        }

        System.out.println("Faktorialnya = " + hasil);
    }
}
