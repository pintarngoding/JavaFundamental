import javax.swing.JOptionPane;

public class KonversiPlatKendaraan {
    public static void main(String[] args) {
        String platnomor = JOptionPane.showInputDialog("Inputkan kode plat nomor kendaraan");

        switch (platnomor) {
        case "P":
            System.out.println("Jember, Banyuwangi, Bondowoso, Situbondo");
            break;
        case "N":
            System.out.println("Lumajang, Probolinggo, Pasuruan, Malang");
            break;
        case "L":
            System.out.println("Surabaya");
            break;
        default:
            System.out.println("Yang Anda inputkan tidak tersedia dalam data kami");
        }
    }
}
