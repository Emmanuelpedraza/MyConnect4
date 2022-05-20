import java.util.Scanner;

public class ConnectFour {
    public static String[][] createBoard() {
        String[][] X = new String[7][17];

        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (j % 2 == 0) X[i][j] = "|";
                else X[i][j] = "";

                if (i == 6) X[i][j] = "-";

            }
        }
        return X;
    }

    public static void createBoard(String[][] X) {
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                System.out.print(X[i][j]);
            }
            System.out.println();
        }
    }

    public static void dropRedPiece(String[][] X) {
        System.out.println("Drop your piece (0-6)");
        Scanner scan = new Scanner(System.in);

        int c = 2 * scan.nextInt() + 1;

        for (int i = 5; i >= 0; i--) {
            if (X[i][c] == " ") {
                X[i][c] = "R";
                break;
            }
        }
    }

    public static void dropYellowPiece(String[][] X) {
        System.out.println("Drop your piece (0-6)");
        Scanner scan = new Scanner(System.in);

        int c = 2 * scan.nextInt() + 1;

        for (int i = 5; i >= 0; i--) {
            if (X[i][c] == " ") {
                X[i][c] = "Y";
                break;
            }
        }
    }

    public static String checkForWin(String[][] X) {

        for (int i = 0; i < 6; i++) {
        }
        for (int j = 0; j < 7; j += 2) {


            if ((X[i][j + 1] != " ")
                    && (X[i][j + 3] != " ")
                    && (X[i][j + 5] != " ")
                    && (X[i][j + 7] != " ")
                    && ((X[i][j + 1] == X[i][j + 3])
                    && (X[i][j + 3] == X[i][j + 5])
                    && (X[i][j + 5] == X[i][j + 7])))
                return X[i][j + 1];

        }
    }

