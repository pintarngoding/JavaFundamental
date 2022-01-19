import java.util.Scanner;

public class tugas2FaktorialRekursif {
    public static int hitungFaktorial(int x) {
        if (x == 1) {
            return x;
        } else {
            return x * hitungFaktorial(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan angka yang akan difaktorialkan (x): ");
        int x = input.nextInt();

        System.out.println("Hasil faktorialnya adalah: " + hitungFaktorial(x));
    }
}