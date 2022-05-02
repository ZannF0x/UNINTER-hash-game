package main;

import java.util.ArrayList;

public class Player {

    // Verfica se o player ganhou observando as posições da jogada "X"
    public boolean playerIsWinner(ArrayList<String> board) {
        // Verifica se o player ganhou nas linhas
        if (board.get(0).equals("X") && board.get(1).equals("X") && board.get(2).equals("X")) {
            return true;
        }
        if (board.get(3).equals("X") && board.get(4).equals("X") && board.get(5).equals("X")) {
            return true;
        }
        if (board.get(6).equals("X") && board.get(7).equals("X") && board.get(8).equals("X")) {
            return true;
        }
        // Verifica se o player ganhou nas colunas
        if (board.get(0).equals("X") && board.get(3).equals("X") && board.get(6).equals("X")) {
            return true;
        }
        if (board.get(1).equals("X") && board.get(4).equals("X") && board.get(7).equals("X")) {
            return true;
        }
        if (board.get(2).equals("X") && board.get(5).equals("X") && board.get(8).equals("X")) {
            return true;
        }
        // Verifica se o player ganhou nas diagonais
        if (board.get(0).equals("X") && board.get(4).equals("X") && board.get(8).equals("X")) {
            return true;
        }
        return board.get(2).equals("X") && board.get(4).equals("X") && board.get(6).equals("X");
    }
}
