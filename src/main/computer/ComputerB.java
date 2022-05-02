package main.computer;

import java.util.ArrayList;
import java.util.Random;

public class ComputerB extends Computer{
    Random randInt = new Random();

    // Retem um index sorteado e adiciona no tabuleiro caso a posição sorteada não esteja ocupada
    @Override
    public int computerPlay(ArrayList<String> board) {
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

    // Sorteia um index de 0 até 8
    @Override
    protected int randNumber() {
        return randInt.nextInt(8) + 1;
    }

    @Override
    public boolean computerIsWinner(ArrayList<String> board) {
        return super.computerIsWinner(board);
    }
}
