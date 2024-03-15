import java.util.Arrays;

public class Mechanics {
    private char[][] board = new char[3][3];

    public boolean playerWin(char[][] board, Player player) {
        if(board[0][0] == player.getSymbol()&&board[1][1] ==player.getSymbol()&&board[2][2] ==player.getSymbol()){
            return true;
        } else if (board[0][0] == player.getSymbol()&&board[0][1] ==player.getSymbol()&&board[0][2] ==player.getSymbol()){
            return true;
        } else if (board[1][0] == player.getSymbol()&&board[1][1] == player.getSymbol()&&board[1][2] ==player.getSymbol()){
            return true;
        } else if (board[2][0] == player.getSymbol()&&board[2][1] ==player.getSymbol()&&board[2][2] ==player.getSymbol()){
            return true;
        } else if (board[0][0] == player.getSymbol()&&board[1][0] ==player.getSymbol()&&board[2][0] ==player.getSymbol()){
            return true;
        } else if (board[0][1] == player.getSymbol()&&board[1][1] ==player.getSymbol()&&board[2][1] ==player.getSymbol()){
            return true;
        } else if (board[0][2] == player.getSymbol()&&board[1][2] == player.getSymbol()&&board[2][2] ==player.getSymbol()){
            return true;
        } else if (board[2][0] == player.getSymbol()&&board[1][1] ==player.getSymbol()&&board[0][2] ==player.getSymbol()){
            return true;
        }else {
            return false;
        }

    }



}
