import Exceptions.ImmutableException;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

class Sudoku {
    private int board[][] = new int[9][9];
    private int game;
    private boolean isFinalizable = false;
    ScheduledExecutorService gameTimer;
    TableBoard tableBoard = new TableBoard();

    public Sudoku(int game) {
        gameTimer = Executors.newScheduledThreadPool(1);
        System.out.println("======== You have 30 minutes to finish the Sudoku Game ========");
        gameTimer.scheduleAtFixedRate(() -> System.out.println("Good Luck!\n"), 0, 1800, TimeUnit.SECONDS);

        if (game == 1) {
            this.game = game;
            board[2][1] = 9;
            board[2][2] = 8;
            board[0][0] = 5;
            board[1][0] = 6;
            board[0][1] = 3;
            board[3][0] = 8;
            board[4][0] = 4;
            board[5][0] = 7;
            board[6][1] = 6;
            board[0][4] = 7;
            board[1][3] = 1;
            board[1][4] = 9;
            board[1][5] = 5;
            board[3][4] = 6;
            board[4][3] = 8;
            board[4][5] = 3;
            board[5][4] = 2;
            board[7][3] = 4;
            board[7][4] = 1;
            board[7][5] = 9;
            board[8][4] = 8;
            board[2][7] = 6;
            board[3][8] = 3;
            board[4][8] = 1;
            board[5][8] = 6;
            board[6][6] = 2;
            board[6][7] = 8;
            board[7][8] = 5;
            board[8][7] = 7;
            board[8][8] = 9;
        } else if (game == 2) {
            // TODO
        }

    }

    public void move(int num, int line, int column) throws ImmutableException {
        // fixed by game1
        if (game == 1) {
            if ((line == 2 && column == 1) || (line == 2 && column == 2) || (line == 0 && column == 0) || (line == 1 && column == 0) || (line == 0 && column == 1) || (line == 3 && column == 0) || (line == 4 && column == 0) || (line == 5 && column == 0) || (line == 6 && column == 1) || (line == 0 && column == 4) || (line == 1 && column == 3) || (line == 1 && column == 4) || (line == 1 && column == 5) || (line == 3 && column == 4) || (line == 4 && column == 3) || (line == 4 && column == 5) || (line == 5 && column == 4) || (line == 7 && column == 3) || (line == 7 && column == 4) || (line == 7 && column == 5) || (line == 8 && column == 4) || (line == 2 && column == 7) || (line == 3 && column == 8) || (line == 4 && column == 8) || (line == 5 && column == 8) || (line == 6 && column == 6) || (line == 6 && column == 7) || (line == 7 && column == 8) || (line == 8 && column == 7) || (line == 8 && column == 8)) {
                System.out.println("[ERROR] You can't alter this number!\n");
                // throw new ImmutableException("[ERROR] You can't alter this number!\n");
            } else {
                board[line][column] = num;
                System.out.println("Number " + num + " positioned.\n");
            }
        }
    }


    public void ruler() {
        isFinalizable = true;
        for (int i = 0; i < 9; i++) { // line checker
            for (int j = 0; j < 9; j++) { // column checker
                if (board[i][j] != 0) { // if spot value is different from 0


                    // between spots -------------------------
                    for (int column = 0; column < 9; column++) {
                        if (column != j && board[i][j] == board[i][column]) {
                            System.out.println("Spot line: " + i + ", column: " + j + " is invalid.");
                            isFinalizable = false;
                            break;
                        }
                    }
                    for (int line = 0; line < 9; line++) {
                        if (line != i && board[i][j] == board[line][j]) {
                            System.out.println("Spot line: " + i + ", column: " + j + " is invalid.");
                            isFinalizable = false;
                            break;
                        }
                    }
                    // verifying 3x3
                    int lineBlock = (i / 3) * 3;
                    int colBlock = (j / 3) * 3;
                    for (int ib = lineBlock; ib < lineBlock + 3; ib++) {
                        for (int jb = colBlock; jb < colBlock + 3; jb++) {
                            if ((ib != i || jb != j) && board[ib][jb] == board[i][j]) {
                                System.out.println("Duplicated number in 3x3 block (line: " + i + ", column: " + j + ").\n");
                                isFinalizable = false;
                            }
                        }
                    }
                }
            }
        }

    }

    public void finishSudoku() {
        if (isFinalizable) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Congratulations! You bravely finished the challenge! \nThanks for playing.\nWanna another round? \n Type - 'YES' / 'NO'");
            String awnser = scanner.nextLine();
            if (awnser.equalsIgnoreCase("NO")) {
                // shutdown timer system
                gameTimer.shutdown();
            } else if (awnser.equalsIgnoreCase("YES")) {
                System.out.println("Wait for updates! for now, restart the game.");
                gameTimer.shutdown();
            } else if (!awnser.equalsIgnoreCase("YES") || !awnser.equalsIgnoreCase("NO")) {
                System.out.println("You are funny haha. nice try!");
                gameTimer.shutdown();
            }

        } else if (!isFinalizable) {
            System.out.println("You need to complete correctly the game to finish it. I believe in you! but you are not done yet..");
        }
    }

    public void startNewGame(int num) {
        gameTimer.shutdown();
        Sudoku sudoku = new Sudoku(num);
    }

    public void showBoard() {
        System.out.println(String.format(tableBoard.BOARD_TEMPLATE, board[0][0], board[0][1], board[0][2], board[0][3], board[0][4], board[0][5], board[0][6], board[0][7], board[0][8],
                board[1][0], board[1][1], board[1][2], board[1][3], board[1][4], board[1][5], board[1][6], board[1][7], board[1][8],
                board[2][0], board[2][1], board[2][2], board[2][3], board[2][4], board[2][5], board[2][6], board[2][7], board[2][8],
                board[3][0], board[3][1], board[3][2], board[3][3], board[3][4], board[3][5], board[3][6], board[3][7], board[3][8],
                board[4][0], board[4][1], board[4][2], board[4][3], board[4][4], board[4][5], board[4][6], board[4][7], board[4][8],
                board[5][0], board[5][1], board[5][2], board[5][3], board[5][4], board[5][5], board[5][6], board[5][7], board[5][8],
                board[6][0], board[6][1], board[6][2], board[6][3], board[6][4], board[6][5], board[6][6], board[6][7], board[6][8],
                board[7][0], board[7][1], board[7][2], board[7][3], board[7][4], board[7][5], board[7][6], board[7][7], board[7][8],
                board[8][0], board[8][1], board[8][2], board[8][3], board[8][4], board[8][5], board[8][6], board[8][7], board[8][8]
        ));
    }
}