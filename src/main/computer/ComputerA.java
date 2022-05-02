package main.computer;

import java.util.ArrayList;
import java.util.Objects;

public class ComputerA extends Computer{

    // Coloca "O" no primeiro espaço em branco
    @Override
    public int computerPlay(ArrayList<String> board) {
        for (int index=0; index <= board.size(); index++) {
            if (!Objects.equals(board.get(index), "X") && !Objects.equals(board.get(index), "O")) {
                System.out.println("Computador jogou na posição: " +  (index + 1));
                return index + 1;
            }
        }
        return -1;
    }

    @Override
    protected int randNumber() {
        return 0;
    }

    @Override
    public boolean computerIsWinner(ArrayList<String> board) {
        return super.computerIsWinner(board);
    }
}
