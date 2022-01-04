import java.util.Scanner;

public class tugas11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ganjil = "";
        String genap = "";

        System.out.print("Inputkan panjang deret: ");
        int deret = input.nextInt();

        int i = 1;
        do {
            if (i % 2 == 1) {
                ganjil = ganjil + i + " ";
            } else {
                genap = genap + i + " ";
            }
            i++;
        } while (i <= deret);

        System.out.println("Bilangan GANJIL: " + ganjil);
        System.out.println("Bilangan GENAP: " + genap);
    }
}
