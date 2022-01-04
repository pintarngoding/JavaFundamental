import java.util.Scanner;

public class tugas13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deret = 1;
        int deretsebelumnya = 1;
        int penjumlah = 0;
        System.out.print("Jumlah deret: ");
        int jumlahderet = input.nextInt();

        int i = 1;
        do {
            System.out.print(deret + " ");
            deret = deretsebelumnya + penjumlah;
            penjumlah = deretsebelumnya;
            deretsebelumnya = deret;
            i++;
        } while (i <= jumlahderet);
    }
}
