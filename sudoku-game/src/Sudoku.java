import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sudoku {
    int[][] board = new int[9][];

    int[] top1 = new int[9];
    int top2[] = new int[9];
    int top3[] = new int[9];

    int middle1[] = new int[9];
    int middle2[] = new int[9];
    int middle3[] = new int[9];

    int bottom1[] = new int[9];
    int bottom2[] = new int[9];
    int bottom3[] = new int[9];

    public Sudoku() {
        randomStart();
    }

    private void randomStart() {
        Random random = new Random();
        Random binary = new Random();
        List<Integer> topChecker1 = new ArrayList<>();
        List<Integer> topChecker2 = new ArrayList<>();
        List<Integer> topChecker3 = new ArrayList<>();
        List<Integer> middleChecker1 = new ArrayList<>();
        List<Integer> middleChecker2 = new ArrayList<>();
        List<Integer> middleChecker3 = new ArrayList<>();
        List<Integer> bottomChecker1 = new ArrayList<>();
        List<Integer> bottomChecker2 = new ArrayList<>();
        List<Integer> bottomChecker3 = new ArrayList<>();

        // top 1
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum;

            if (isSlotEmpty == 0) { // false -slot needs value
                do {
                    randomNum = random.nextInt(9) + 1;
                } while (topChecker1.contains(randomNum));
                top1[i] = randomNum;
                topChecker1.add(randomNum);
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                top1[i] = 0;
            }

        }
        // top2
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum;

            if (isSlotEmpty == 0) { // false -slot needs value
                do {
                    randomNum = random.nextInt(9) + 1;
                } while (topChecker2.contains(randomNum));
                top2[i] = randomNum;
                topChecker2.add(randomNum);
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                top2[i] = 0;
            }

        }
        // top 3
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum;

            if (isSlotEmpty == 0) { // false -slot needs value
                do {
                    randomNum = random.nextInt(9) + 1;
                } while (topChecker3.contains(randomNum));
                top3[i] = randomNum;
                topChecker3.add(randomNum);
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                top3[i] = 0;
            }
        }
        // middle 1
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum;

            if (isSlotEmpty == 0) { // false -slot needs value
                do {
                    randomNum = random.nextInt(9) + 1;
                } while (middleChecker1.contains(randomNum));
                middle1[i] = randomNum;
                middleChecker1.add(randomNum);
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                middle1[i] = 0;
            }
        }
        // middle 2
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum;

            if (isSlotEmpty == 0) { // false -slot needs value
                do {
                    randomNum = random.nextInt(9) + 1;
                } while (middleChecker2.contains(randomNum));
                middle2[i] = randomNum;
                middleChecker2.add(randomNum);
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                middle2[i] = 0;
            }

        }
        //middle 3
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum;

            if (isSlotEmpty == 0) { // false -slot needs value
                do {
                    randomNum = random.nextInt(9) + 1;
                } while (middleChecker3.contains(randomNum));
                middle3[i] = randomNum;
                middleChecker3.add(randomNum);
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                middle3[i] = 0;
            }
        }
        // bottom 1
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum;

            if (isSlotEmpty == 0) { // false -slot needs value
                do {
                    randomNum = random.nextInt(9) + 1;
                } while (bottomChecker1.contains(randomNum));
                bottom1[i] = randomNum;
                bottomChecker1.add(randomNum);
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                bottom1[i] = 0;
            }
        }
        // bottom 2
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum;

            if (isSlotEmpty == 0) { // false -slot needs value
                do {
                    randomNum = random.nextInt(9) + 1;
                } while (bottomChecker2.contains(randomNum));
                bottom2[i] = randomNum;
                bottomChecker2.add(randomNum);
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                bottom2[i] = 0;
            }
        }
        // bottom 3
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum;

            if (isSlotEmpty == 0) { // false -slot needs value
                do {
                    randomNum = random.nextInt(9) + 1;
                } while (bottomChecker3.contains(randomNum));
                bottom3[i] = randomNum;
                bottomChecker3.add(randomNum);
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                bottom3[i] = 0;
            }
        }
        board[0] = top1;
        board[1] = top2;
        board[2] = top3;
        board[3] = middle1;
        board[4] = middle2;
        board[5] = middle3;
        board[6] = bottom1;
        board[7] = bottom2;
        board[8] = bottom3;
        List<Integer> table = new ArrayList<>();
        Arrays.stream(board).forEach(n -> Arrays.stream(n).forEach(e -> table.add(e)));
        table.stream()
                .forEach(n -> System.out.println(n));
        }

    public void spotRulerStarting() {
        if (top1[0] != 0) {
            if (top1[0] == top1[3] || top1[0] == top1[6] || top1[0] == middle1[0] || top1[0] == middle1[3] || top1[0] == middle1[6] || top1[0] == bottom1[0] || top1[0] == bottom1[3] || top1[0] == bottom1[6] || top1[0] == top2[0] || top1[0] == top2[1] || top1[0] == top2[2] || top1[0] == top3[0] || top1[0] == top3[1] || top1[0] == top3[2]) {
                System.out.println("\nInvalid position!\n");
            }
        }



    }


}
