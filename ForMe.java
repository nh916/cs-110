import java.util.Random;

public class ForMe {
    private int randomBetween11And30;
    private int halfWayPoint;
    private char space = ' ';

    private void setRandom() {
        boolean flag = true;
        int min = 11;
        int max = 30;

        while (flag == true) {
            Random random = new Random();
//             randomBetween11And30 = (int) (Math.random() * (max - min)) + min;
            randomBetween11And30 = random.nextInt(max - min + 1) + min;
            if (randomBetween11And30 % 2 != 0) {
                flag = false;
                halfWayPoint = (randomBetween11And30 - 1) / 2;
                return;
            }
        }
    }

    private void drawShape() {
//        randomBetween11And30 = 7;
//        halfWayPoint = (randomBetween11And30 - 1) / 2;

        int amountToPrintInBetween = 1;
        int numberOfSpaces = randomBetween11And30 / 2;
        char firstInitial = 'M';

        for (int i = 0; i < halfWayPoint; i++) {

            for (int k = 0; k < numberOfSpaces; k++) {
                System.out.print(space);
            }
            for (int j = 0; j < amountToPrintInBetween; j++) {
                System.out.print(firstInitial);
            }
            numberOfSpaces = numberOfSpaces - 1;
            amountToPrintInBetween = amountToPrintInBetween + 2;
            System.out.print("\n");
        }
    }

    private void printSpecial() {
        char specialCharacter = '=';
        for (int i = 0; i < randomBetween11And30; i++) {
            System.out.print(specialCharacter);
        }
        System.out.print("\n");
    }

    private void backward() {
        char lastInitial = 'H';
        int amountToPrintInBetween = randomBetween11And30 - 2;
        int numberOfSpaces = 1;

        for (int i = 0; i < halfWayPoint; i++) {
            for (int k = 0; k < numberOfSpaces; k++) {
                System.out.print(space);
            }
            for (int j = 0; j < amountToPrintInBetween; j++) {
                System.out.print(lastInitial);
            }
            System.out.print("\n");
            amountToPrintInBetween = amountToPrintInBetween - 2;
            numberOfSpaces = numberOfSpaces + 1;
        }
    }

    public static void main(String[] args) {
        ForMe forMartin = new ForMe();
//        for (int i = 0; i < 2000; i++) {
        forMartin.setRandom();
        forMartin.drawShape();
        forMartin.printSpecial();
        forMartin.backward();
//        }

    }
}
