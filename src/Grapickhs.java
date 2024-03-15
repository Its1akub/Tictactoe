public class Grapickhs {

    public String write(char[][] board){
        StringBuilder b = new StringBuilder();

        for (int i = 0; i<board.length; i++){
            for (int o = 0; o<board[i].length;o++){
                if (o == 2){
                    switch (board[i][o]){
                        case 'x': b.append("x");
                        case 'o': b.append("o");
                        case ' ': b.append(" ");
                        default: b.append("error");
                    }
                    b.append('\n');
                }else {
                    switch (board[i][o]){
                        case 'x': b.append("x"+" "+"I"+" ");
                        case 'o': b.append("o"+" "+"I"+" ");
                        case ' ': b.append(" "+" "+"I"+" ");
                        default: b.append("error");
                    }
                }

            }
        }
        return b.toString();
    }
}
