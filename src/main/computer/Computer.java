package main.computer;


import java.util.ArrayList;

public abstract class Computer {

    // Faz as jogadas do computador
    public abstract int computerPlay(ArrayList<String> board);

    // Criada para sortear números
    protected abstract int randNumber();

    // Verfica se o Computador ganhou observando as posições da jogada "0"
    public boolean computerIsWinner(ArrayList<String> board) {
        // Verifica se o computador ganhou nas linhas
        if (board.get(0).equals("O") && board.get(1).equals("O") && board.get(2).equals("O")) {
            return true;
        }
        if (board.get(3).equals("O") && board.get(4).equals("O") && board.get(5).equals("O")) {
            return true;
        }
        if (board.get(6).equals("O") && board.get(7).equals("O") && board.get(8).equals("O")) {
            return true;
        }
        // Verifica se o computador ganhou nas colunas
        if (board.get(0).equals("O") && board.get(3).equals("O") && board.get(6).equals("O")) {
            return true;
        }
        if (board.get(1).equals("O") && board.get(4).equals("O") && board.get(7).equals("O")) {
            return true;
        }
        if (board.get(2).equals("O") && board.get(5).equals("O") && board.get(8).equals("O")) {
            return true;
        }
        // Verifica se o computador ganhou nas diagonais
        if (board.get(0).equals("O") && board.get(4).equals("O") && board.get(8).equals("O")) {
            return true;
        }
        return board.get(2).equals("O") && board.get(4).equals("O") && board.get(6).equals("O");
    }
}
