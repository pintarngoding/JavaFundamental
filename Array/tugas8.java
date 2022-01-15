public class tugas8 {
    public static void main(String[] args) {
        String nama[][] = {
            {"Sugito", "Prayoga"},
            {"Samirul", "Hilmi"},
            {"Leo", "Hermawan"},
            {"Triawan", "Angga"}
        };

        for (int i = 0; i < nama.length; i++) {
            System.out.print(i+1+". ");
            for (int j = 0; j < nama[i].length; j++) {
                System.out.print(nama[i][j]+" ");
            }
            System.out.println();
        }
    }
}