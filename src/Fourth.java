public class Fourth {
    public static void main(String[] asgr) {
        int verifiedNumber = 123456789;
        boolean equallyZero = true;
        int DividedVerifiedNumber = verifiedNumber;
        int numberOfRank = 0;
        do {
            DividedVerifiedNumber = DividedVerifiedNumber / 10;
            if (DividedVerifiedNumber == 0) {
                equallyZero = false;
            }
            numberOfRank++;
        } while (equallyZero);
        boolean descend = true;
        for (int i = 1; i < numberOfRank; i++) {
            int firstRank = (int) Math.pow(10, numberOfRank - i);
            int secondRank = (int) Math.pow(10, numberOfRank - 1 - i);
            int upperRank = verifiedNumber / firstRank % 10;
            int lowerRank = verifiedNumber / secondRank % 10;
            if (upperRank > lowerRank) {
                descend = false;
            }
        }
        if (descend) {
            System.out.printf("Цифры числа  %d возрастают ", verifiedNumber);
        } else {
            System.out.printf("Цифры числа  %d убывают ", verifiedNumber);
        }
    }
}