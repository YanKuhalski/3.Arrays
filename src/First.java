import java.util.Random;

public class First {
    public static void main(String[] args) {
        int length=10;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            Random a = new Random();
            array[i] = a.nextInt(5);
        }
        System.out.printf("[");
        for (int i = 0; i < length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("]");
        int max = array[0], min = array[0];
        for (int i = 0; i < length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.printf("%nMax value = %d%nMin value = %d %n", min, max);
        for (int i = 0; i < length; i++) {
            if (array[i] == max) {
                array[i] = 99;
            }
            if (array[i] == min) {
                array[i] = 0;
            }
        }
        System.out.printf("[");
        for (int i = 0; i < length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}