import java.util.Random;

public class Fifth {
    public static void main(String[] asgr) {
        Random random = new Random();
        int[] array = new int[10];
        int length = array.length;
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
            System.out.printf("[%d]", array[i]);
        }
        System.out.printf("%nСортировка%n");
        boolean sortingFinished;
        do {
            sortingFinished = true;
            for (int j = 0; j < length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int invert = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = invert;
                    sortingFinished = false;
                }
            }
        } while (sortingFinished == false);
        for (int i = 0; i < length; i++) {
            System.out.printf("[%d]", array[i]);
        }
    }
}