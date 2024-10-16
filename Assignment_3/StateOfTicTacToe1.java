import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StateOfTicTacToe1 {
    public static void main(String[] args) {
        char[][] board = {{'X', 'X', 'X'}, {'O', 'O', 'O'}, {' ', ' ', ' '}};

        int countX = 0;
        int countO = 0;
        List<String> boardFilled = new ArrayList<>();

        String diagonalFromFirst = "", diagonalFromLast = "", colunmWise = "";
        for (int i = 0; i < 3; i++) {
            diagonalFromFirst += board[i][i];
            diagonalFromLast += board[i][2 - i];
            colunmWise = "";
            for (int j = 0; j < 3; j++) {
                colunmWise += board[i][j];
                if (board[i][j] == 'X') {
                    countX++;
                }

                if (board[i][j] == 'O') {
                    countO++;
                }
            }
            boardFilled.add(colunmWise);
        }
        boardFilled.add(diagonalFromFirst);
        boardFilled.add(diagonalFromLast);

        if (countX < countO || countX == 0 && countO == 1) {
            System.out.println("Invalid, wrong turn order");
        } else if (boardFilled.contains("XXX") && boardFilled.contains("OOO")) {
            System.out.println("Continued playing after win");
        } else if (boardFilled.contains("XXX") || boardFilled.contains("OOO")) {
            System.out.println("Game Win");
        } else if (countX + countO == 9) {
            System.out.println("Game Draw");
        } else {
            System.out.println("Game Ongoing");
        }

    }
}
/* Testcases :
char[][] board = {{'X', ' ', ' '}, {' ', 'X', 'O'}, {'O', 'X', ' '}};
char[][] board = {{'X', 'O', 'X'}, {'X', 'X', 'O'}, {'O', 'X', 'O'}};
char[][] board = {{'X', 'X', 'X'}, {'O', 'O', ' '}, {' ', ' ', ' '}};
char[][] board = {{'O', 'O', 'X'}, {' ', ' ', ' '}, {' ', ' ', ' '}};
char[][] board = {{'O', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
char[][] board = {{'X', 'X', 'X'}, {'O', 'O', 'O'}, {' ', ' ', ' '}};
 */