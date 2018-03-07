import java.util.Random;

public class Second {
    public static void main(String[] args) {
        int length = 10;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            Random a = new Random();
            array[i] = a.nextInt(10);
        }
        System.out.printf("[");
        for (int i = 0; i < length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("]");
        int numberOfRepited = 0;
        int[][] arrayOfRepetition = new int[length / 2][2];
        for (int i = 0; i < length; i++) {
            int verifiedNumber = array[i];
            int numberOfRepiting = 0;
            boolean retryCheck = true;
            for (int j = 0; j < numberOfRepited; j++) {
                if (verifiedNumber == arrayOfRepetition[j][0])
                    retryCheck = false;
            }
            if (retryCheck)
                for (int a = 0; a < length; a++) {
                    if (verifiedNumber == array[a])
                        numberOfRepiting++;
                }
            if (numberOfRepiting > 1) {
                arrayOfRepetition[numberOfRepited][0] = verifiedNumber;
                arrayOfRepetition[numberOfRepited][1] = numberOfRepiting;
                numberOfRepited++;
            }
        }
        for (int i = 0; i < numberOfRepited; i++) {
            System.out.printf("\n Количество повторений числа [%d]=%d", arrayOfRepetition[i][0], arrayOfRepetition[i][1]);
        }
    }
}