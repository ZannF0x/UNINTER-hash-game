package main.computer;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class ComputerC extends Computer {
    Random randInt = new Random();

    // Combina a dificuldade A com a B
    @Override
    public int computerPlay(ArrayList<String> board) {
        if (typePlay() < 5) {
            for (int index=0; index <= board.size(); index++) {
                if (!Objects.equals(board.get(index), "X") && !Objects.equals(board.get(index), "O")) {
                    System.out.println("Computador jogou na posição: " +  (index + 1));
                    return index + 1;
                }
            }
        } else {
            int num;
            while (true) {
                int random = randNumber();
                if (!board.get(random - 1).equals("X") && !board.get(random - 1).equals("O") || board.get(random - 1).equals(" ")) {
                    num = random;
                    System.out.println("Computador jogou na posição: " +  (random));
                    return num;
                }
            }
        }
        return 0;
    }

    // Sorteia um index de 0 até 8
    @Override
    protected int randNumber() {
        return randInt.nextInt(8) + 1;
    }

    // Tipo de jogada
    private int typePlay() {
        return randInt.nextInt(10) + 1;
    }
}
