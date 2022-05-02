package main;

import java.util.ArrayList;

public class Board {
    private final ArrayList<String> boardHash = new ArrayList<>();

    // Inicializa os valores do tabuleiro
    public void initializeBoard() {
        for (int index=0; index <= 9; index++) {
            boardHash.add(" ");
        }
    }

    // Retorna a lista
    public ArrayList<String> getBoardHash() {
        return boardHash;
    }

    // Exibe o tabuleiro formatado
    public void showBoardHash() {
        System.out.printf("\n [ %s ] [ %s ] [ %s ]\n [ %s ] [ %s ] [ %s ]\n [ %s ] [ %s ] [ %s ]\n",
                boardHash.get(0),
                boardHash.get(1),
                boardHash.get(2),
                boardHash.get(3),
                boardHash.get(4),
                boardHash.get(5),
                boardHash.get(6),
                boardHash.get(7),
                boardHash.get(8));
    }

    //Adiciona a jogada ao tabuleiro
    public void addInBoard(String play, int position) {
        boardHash.remove(position - 1);
        boardHash.add(position - 1, play);
    }

    // Verifica se deu empate
    public boolean verifyNoOneWon(ArrayList<String> actualBoard) {
        int count = 0;
        for (int index=0; index <= actualBoard.size() - 1; index++) {
            if (actualBoard.get(index).contains("X") || actualBoard.get(index).contains("O")) {
                count ++;
            }
        }
        return count == 9;
    }

}
