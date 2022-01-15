public class contohArray2D {
    public static void main(String[] args) {
        String onepiece[][] = new String[3][2];

        // mendeklarasikan data pada baris index 0
        onepiece[0][0] = "Monkey D. Luffy";
        onepiece[0][1] = "Roronoa Zoro";

        // mendeklarasikan data pada baris index 1
        onepiece[1][0] = "Gol D. Roger";
        onepiece[1][1] = "Silvers Rayleigh";

        // mendeklarasikan data pada baris index 2
        onepiece[2][0] = "Akagami Shanks";
        onepiece[2][1] = "Benn Beckman";

        for (int i = 0; i < onepiece.length; i++) {
            for (int j = 0; j < onepiece[i].length; j++) {
                System.out.println(onepiece[i][j] + " ");
            }
            System.out.println("");
        }
    }
}