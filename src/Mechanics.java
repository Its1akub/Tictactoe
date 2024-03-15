import java.util.Arrays;

public class Mechanics {
    private int win;
    private char[][] board = new char[3][3];

    public int playerWin(char[][] board, Player p1, Player p2) {
        if(board[0][0] == p1.getSymbol()&&board[1][1] ==p1.getSymbol()&&board[2][2] ==p1.getSymbol()){
            return 1;
        } else if (board[0][0] == p1.getSymbol()&&board[0][1] ==p1.getSymbol()&&board[0][2] ==p1.getSymbol()){
            return 1;
        } else if (board[1][0] == p1.getSymbol()&&board[1][1] == p1.getSymbol()&&board[1][2] ==p1.getSymbol()){
            return 1;
        } else if (board[2][0] == p1.getSymbol()&&board[2][1] ==p1.getSymbol()&&board[2][2] ==p1.getSymbol()){
            return 1;
        } else if (board[0][0] == p1.getSymbol()&&board[1][0] ==p1.getSymbol()&&board[2][0] ==p1.getSymbol()){
            return 1;
        } else if (board[0][1] == p1.getSymbol()&&board[1][1] ==p1.getSymbol()&&board[2][1] ==p1.getSymbol()){
            return 1;
        } else if (board[0][2] == p1.getSymbol()&&board[1][2] == p1.getSymbol()&&board[2][2] ==p1.getSymbol()){
            return 1;
        } else if (board[2][0] == p1.getSymbol()&&board[1][1] ==p1.getSymbol()&&board[0][2] ==p1.getSymbol()){
            return 1;
        } else if(board[0][0] == p2.getSymbol()&&board[1][1] ==p2.getSymbol()&&board[2][2] ==p2.getSymbol()){
            return 2;
        } else if (board[0][0] == p2.getSymbol()&&board[0][1] ==p2.getSymbol()&&board[0][2] ==p2.getSymbol()){
            return 2;
        } else if (board[1][0] == p2.getSymbol()&&board[1][1] == p2.getSymbol()&&board[1][2] ==p2.getSymbol()){
            return 2;
        } else if (board[2][0] == p2.getSymbol()&&board[2][1] ==p2.getSymbol()&&board[2][2] ==p2.getSymbol()){
            return 2;
        } else if (board[0][0] == p2.getSymbol()&&board[1][0] ==p2.getSymbol()&&board[2][0] ==p2.getSymbol()){
            return 2;
        } else if (board[0][1] == p2.getSymbol()&&board[1][1] ==p2.getSymbol()&&board[2][1] ==p2.getSymbol()){
            return 2;
        } else if (board[0][2] == p2.getSymbol()&&board[1][2] == p2.getSymbol()&&board[2][2] ==p2.getSymbol()){
            return 2;
        } else if (board[2][0] == p2.getSymbol()&&board[1][1] ==p2.getSymbol()&&board[0][2] ==p2.getSymbol()){
            return 2;
        } else {
            return 0;
        }
    }



}
