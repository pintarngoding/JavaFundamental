import java.util.Scanner;

public class Ujian4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String katalog[][] = { { "Sabun", "5000" }, { "Kecap", "3000" }, { "Garam", "2000" }, { "Tepung", "3000" },
                { "Bumbu", "500" }, { "Telur", "10000" }, { "Cokelat", "7000" } };

        System.out.println("Nama Produk\tHarga");
        System.out.println("----------------------------");
        for (int i = 0; i < katalog.length; i++) {
            System.out.print((i + 1) + ". ");
            for (int j = 0; j < katalog[i].length; j++) {
                System.out.print(katalog[i][j] + "\t");
            }
            System.out.println();
        }

        String ulang = "y";
        int hitung = 0;

        do {
            System.out.print("Pilih Produk (1-7): ");
            int pilih = input.nextInt();
            
            System.out.print("Jumlah Beli: ");
            int jumlah = input.nextInt();

            hitung += Integer.parseInt(katalog[pilih - 1][1]) * jumlah;

            System.out.print("Masih ingin beli? (y/n): ");
            ulang = input.next();
        } while (ulang.equals("y") );

        System.out.println("Total Harga: " + hitung);
    }
}
