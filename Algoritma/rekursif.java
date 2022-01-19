public class rekursif {
    public static void cetak() {
        System.out.println("Ini proses rekursif");
        cetak();
    }

    public static void main(String[] args) {
        cetak();
    }
}