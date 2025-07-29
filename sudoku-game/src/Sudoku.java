import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Sudoku {
    int board[][] = new int[9][9];

    int top1[] = new int[9];
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
        List<Integer> randomChecker = new ArrayList<>();

        // top 1
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum = random.nextInt(9) + 1;

            if (isSlotEmpty == 0) { // false -slot needs value
                if (randomChecker.contains(randomNum)) {
                    int secRandomNum = random.nextInt(9) + 1;
                    if (secRandomNum == randomNum) {
                        top1[i] = 0;
                    } else {
                        top1[i] = secRandomNum;
                        randomChecker.add(secRandomNum);
                    }
                } else {
                    top1[i] = randomNum;
                    randomChecker.add(randomNum);
                }
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                top1[i] = 0;
            }

        }
        // top2
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum = random.nextInt(9) + 1;

            if (isSlotEmpty == 0) { // false -slot needs value
                if (randomChecker.contains(randomNum)) {
                    int secRandomNum = random.nextInt(9) + 1;
                    if (secRandomNum == randomNum) {
                        top2[i] = 0;
                    } else {
                        top2[i] = secRandomNum;
                        randomChecker.add(secRandomNum);
                    }
                } else {
                    top2[i] = randomNum;
                    randomChecker.add(randomNum);
                }
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                top2[i] = 0;
            }

        }
        // top 3
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum = random.nextInt(9) + 1;

            if (isSlotEmpty == 0) { // false -slot needs value
                if (randomChecker.contains(randomNum)) {
                    int secRandomNum = random.nextInt(9) + 1;
                    if (secRandomNum == randomNum) {
                        top3[i] = 0;
                    } else {
                        top3[i] = secRandomNum;
                        randomChecker.add(secRandomNum);
                    }
                } else {
                    top3[i] = randomNum;
                    randomChecker.add(randomNum);
                }
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                top3[i] = 0;
            }

        }
        // middle 1
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum = random.nextInt(9) + 1;

            if (isSlotEmpty == 0) { // false -slot needs value
                if (randomChecker.contains(randomNum)) {
                    int secRandomNum = random.nextInt(9) + 1;
                    if (secRandomNum == randomNum) {
                        middle1[i] = 0;
                    } else {
                        middle1[i] = secRandomNum;
                        randomChecker.add(secRandomNum);
                    }
                } else {
                    middle1[i] = randomNum;
                    randomChecker.add(randomNum);
                }
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                middle1[i] = 0;
            }

        }
        // middle 2
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum = random.nextInt(9) + 1;

            if (isSlotEmpty == 0) { // false -slot needs value
                if (randomChecker.contains(randomNum)) {
                    int secRandomNum = random.nextInt(9) + 1;
                    if (secRandomNum == randomNum) {
                        middle2[i] = 0;
                    } else {
                        middle2[i] = secRandomNum;
                        randomChecker.add(secRandomNum);
                    }
                } else {
                    middle2[i] = randomNum;
                    randomChecker.add(randomNum);
                }
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                middle2[i] = 0;
            }

        }
        //middle 3
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum = random.nextInt(9) + 1;

            if (isSlotEmpty == 0) { // false -slot needs value
                if (randomChecker.contains(randomNum)) {
                    int secRandomNum = random.nextInt(9) + 1;
                    if (secRandomNum == randomNum) {
                        middle3[i] = 0;
                    } else {
                        middle3[i] = secRandomNum;
                        randomChecker.add(secRandomNum);
                    }
                } else {
                    middle3[i] = randomNum;
                    randomChecker.add(randomNum);
                }
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                middle3[i] = 0;
            }

        }
        // bottom 1
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum = random.nextInt(9) + 1;

            if (isSlotEmpty == 0) { // false -slot needs value
                if (randomChecker.contains(randomNum)) {
                    int secRandomNum = random.nextInt(9) + 1;
                    if (secRandomNum == randomNum) {
                        bottom1[i] = 0;
                    } else {
                        bottom1[i] = secRandomNum;
                        randomChecker.add(secRandomNum);
                    }
                } else {
                    bottom1[i] = randomNum;
                    randomChecker.add(randomNum);
                }
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                bottom1[i] = 0;
            }

        }
        // bottom 2
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum = random.nextInt(9) + 1;

            if (isSlotEmpty == 0) { // false -slot needs value
                if (randomChecker.contains(randomNum)) {
                    int secRandomNum = random.nextInt(9) + 1;
                    if (secRandomNum == randomNum) {
                        bottom2[i] = 0;
                    } else {
                        bottom2[i] = secRandomNum;
                        randomChecker.add(secRandomNum);
                    }
                } else {
                    bottom2[i] = randomNum;
                    randomChecker.add(randomNum);
                }
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                bottom2[i] = 0;
            }
        }
        // bottom 3
        for (int i = 0; i < 9; i++) {
            int isSlotEmpty = binary.nextInt(3); // 0, 1 or 2
            int randomNum = random.nextInt(9) + 1;

            if (isSlotEmpty == 0) { // false -slot needs value
                if (randomChecker.contains(randomNum)) {
                    int secRandomNum = random.nextInt(9) + 1;
                    if (secRandomNum == randomNum) {
                        bottom3[i] = 0;
                    } else {
                        bottom3[i] = secRandomNum;
                        randomChecker.add(secRandomNum);
                    }
                } else {
                    bottom3[i] = randomNum;
                    randomChecker.add(randomNum);
                }
            }
            if (isSlotEmpty == 1 || isSlotEmpty == 2) { // true -slot without value
                bottom3[i] = 0;
            }
        }
    }

    private void spotRulerStarting() {

            if (top1[0] != 0) {
                if (top1[0] == top1[3] || top1[0] == top1[6] || top1[0] == middle1[0] || top1[0] == middle1[3] || top1[0] == middle1[6] || top1[0] == bottom1[0] || top1[0] == bottom1[3] || top1[0] == bottom1[6] || top1[0] == top2[0] || top1[0] == top2[1] || top1[0] == top2[2] || top1[0] == top3[0] || top1[0] == top3[1] || top1[0] == top3[2]) {

                }
            }

    }


}
