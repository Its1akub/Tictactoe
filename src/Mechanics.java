import java.util.Arrays;

public class Mechanics {
    private int win;
    private char[][] board = new char[3][3];
    private Plaier p1;
    private Plaier p2;

    public Mechanics(char[][] board, Plaier p1, Plaier p2) {
        this.board = board;
        this.p1 = p1;
        this.p2 = p2;
    }

    public int playerWin(char[][] board, Plaier p1, Plaier p2) {
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
        } else if (!Arrays.asList(board).contains(' ')){
            return 0;
        }
        return Integer.parseInt(null);
    }



}
