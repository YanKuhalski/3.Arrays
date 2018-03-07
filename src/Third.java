import java.util.Random;

public class Third {
    public static void main(String[] args) {
        int[] array = new int[10];
        int length = array.length;
        for (int i = 0; i < 10; i++) {
            Random a = new Random();
            array[i] = a.nextInt(100);
        }
        System.out.printf("[");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("]");
        for (int i = 0; i < length / 2; i++) {
            int invert = array[i];
            System.out.printf("%n%d <-> %d", invert, array[length - 1 - i]);
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = invert;
        }
        System.out.printf("%n[");
        for (int i = 0; i < length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("]");
    }
}