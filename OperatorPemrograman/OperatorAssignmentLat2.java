import javax.swing.JOptionPane;

public class OperatorAssignmentLat2 {
    public static void main(String[] args) {
        int sirup = 5;
        int deterjen = 6;
        int mie = 10;

        sirup += Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah sirup yang datang?"));
        deterjen += Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah deterjen yang datang?"));
        mie += Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah mie instan yang datang?"));

        System.out.println("Berikut ini daftar stok barang yang ada di toko");
        System.out.println("Sirup: " + sirup + " botol");
        System.out.println("Deterjen: " + deterjen + " bungkus");
        System.out.println("Mie Instan: " + mie + " bungkus");
    }
}
