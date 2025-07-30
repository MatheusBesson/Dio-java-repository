import Exceptions.ImmutableException;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ImmutableException {
        boolean menu = true;
        Sudoku sudoku = new Sudoku(1);
        while (menu) {
            System.out.println("===== Select between the options: =====");
            System.out.println("1 - Start a new game");
            System.out.println("2 - Make a move");
            System.out.println("3 - Check game");
            System.out.println("4 - Show board");
            System.out.println("5 - Show time limit.");
            System.out.println("6 - Finish the game");
            System.out.println("7 - Exit the game");

            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Type the sudoku game number (1 for now)");
                    int gameChoice = scanner2.nextInt();

                    sudoku.startNewGame(gameChoice);
                }
                case 2 -> {
                    Scanner scanner4 = new Scanner(System.in);

                    System.out.println("Select a number: ");
                    int number = scanner4.nextInt();

                    System.out.println("Choose the line number: ");
                    int line = scanner4.nextInt();

                    System.out.println("Choose the colum number: ");
                    int col = scanner4.nextInt();

                    sudoku.move(number, line, col);
                }
                case 3 -> {
                    sudoku.ruler();
                }
                case 4 -> {
                    sudoku.showBoard();
                }
                case 5 -> {
                    sudoku.getTimer();
                }
                case 6 -> {
                    sudoku.finishSudoku();
                }
                case 7 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("[ERROR] Invalid value!");
                }
            }
        }
        // in construction ================================!!!!!!!=========================
        while (!menu) {
            System.out.println("\n[P to Menu]\n");
            Scanner scanner3 = new Scanner(System.in);
            String awnser = scanner3.nextLine();
            if (awnser.equalsIgnoreCase("p")) {
                menu = true;
            }
            break;
        }
    }
}
