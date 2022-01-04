public class tugas3 {
    public static void main(String[] args) {
        int deret = 1;
        int deretesebelumnya = 1;
        int penjumlah = 0;

        while (true) {
            System.out.print(deret + " ");
            deret = deretesebelumnya + penjumlah;
            penjumlah = deretesebelumnya;
            deretesebelumnya = deret;
            if (deret >= 200) {
                break;
            }
        }
    }
}
