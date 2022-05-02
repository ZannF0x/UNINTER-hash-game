package main;

import main.computer.Computer;
import main.computer.ComputerA;
import main.computer.ComputerB;
import main.computer.ComputerC;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        Player player = new Player();
        Computer computer = null;
        board.initializeBoard();

        System.out.println("JOGO DA VELHA - UNINTER");
        System.out.print("\n [1 - Fácil, 2 - Médio, 3 - Difícil] \nEscolha a dificuldade do seu adversário >>> ");
        Scanner difficultScanner = new Scanner(System.in);
        int input = difficultScanner.nextInt();
        if (input == 1) {
            computer = new ComputerA();
        } else if (input == 2) {
            computer = new ComputerB();
        } else if (input == 3) {
            computer = new ComputerC();
        } else {
            System.out.println("Dado invalido, tente novamente!");
        }

        while (true) {
            board.showBoardHash();
            int userInput;
            //Loop para verificar jogadas validas do usuário
            while (true) {
                System.out.print("\nInserir 'X' na posição  (1...9) >>> ");
                Scanner playerScanner = new Scanner(System.in);
                userInput = playerScanner.nextInt();
                if (userInput <= 9 && board.getBoardHash().get(userInput - 1).equals(" ")) {
                    break;
                } else {
                    System.out.println("Jogada invalida!");
                }
            }

            // Para certificar que o usuário não vai inserir valores invalidos
            try {
                if (board.verifyNoOneWon(board.getBoardHash())) {
                    System.out.println("\nEMPATE!");
                    break;
                }
                board.addInBoard("X", userInput);
                if(player.playerIsWinner(board.getBoardHash())) {
                    System.out.println("\nJogador ganhou. PARABÉNS!");
                    break;
                }
                if (computer != null) {
                    if (board.verifyNoOneWon(board.getBoardHash())) {
                        System.out.println("\nEMPATE!");
                        break;
                    }
                    board.addInBoard("O", computer.computerPlay(board.getBoardHash()));
                    if(computer.computerIsWinner(board.getBoardHash())) {
                        System.out.println("\nComputador ganhou!");
                        break;
                    }
                }
            } catch (Exception exception) {
                System.out.println("Número invalido!");
            }
        }
        board.showBoardHash();
    }
}
