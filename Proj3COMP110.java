// Project 3: Diamond
public class Proj3COMP110 {
    private static int randomBetween11And30 = 0;
    private static char space = ' ';
    private static int numOfLines = 0;

    private static void  setRandom(int min, int max)
    {
        //Create boolean flag to ensure the program runs at least once in the while loop
        //Create max and mins for the number that will be picked
        boolean flag = true;

        //runs loop until it picks a random number that is odd then that number stays and picks halfway point
        //sets flag to false so that it no longer runs
        while (flag == true)
        {
            randomBetween11And30 = (int) (Math.random() * (max - min)) + min;

            // if the number is odd then stop the loop and set halfway point to random number that was created
            if (randomBetween11And30 % 2 != 0)
            {
                flag = false;
                //verticalHalfWayPoint reduce random number by 1 to get an even number and divide by 2
                numOfLines = (randomBetween11And30 - 1) / 2;
            }
        }


    }

    private static void  MHPrintUpperTriangle(int numOfLines, char firstInitial)
    {
        //Create variables to determine size of diamond
        int amountToPrintInRow = 1;
        int numberOfSpaces = (randomBetween11And30 - 1) / 2;

        //as long as variable is less than the halfway point keep going through loop to print spaces
        //each forloop iteration prints out a row
        for (int i = 0; i < numOfLines; i++)
        {

            //as long as the variable K is less than number the number of spaces keep printing space
            for (int k = 0; k < numberOfSpaces; k++)
            {
                System.out.print(space);
            }

            //as long as j is less than amountToPrint, keep printing the first initial
            //prints the first initial amount of time that is specified by amountToPrint
            for (int j = 0; j < amountToPrintInRow; j++)
            {
                System.out.print(firstInitial);
            }
            //every row increases number of letters by 2 and decreases the space by 1

            //take value from number of spaces subtract 1 from it and override value
            numberOfSpaces = numberOfSpaces - 1;
            //take value from amount to print in row add two for next row, and override current value
            amountToPrintInRow = amountToPrintInRow + 2;
            //add new line so the new row starts on a new line
            System.out.print("\n");
        }

    }

    private static void MHPrintMiddleLine(int numOfLines, char specialCharacter)
    {
        //prints out the special character n amount of time,
        //the same amount as the random number picked by the random number
        for (int i = 0; i < randomBetween11And30; i++)
        {
            System.out.print(specialCharacter);
        }
        //after the loop finishes prints out a new line so the next row can start on a new line
        System.out.print("\n");
        //creates and initializes the new variables

    }

    private static void MHPrintLowerTriangle(int numOfLines, char lastInitial)
    {
        //since this triangle is top down backwards it starts with printing the most amount first
        //and then decreases each row
        int amountToPrintInRow = randomBetween11And30 - 2;
        //since this triangle is top down backward it starts with least spaces
        //and becomes more as it goes down the row
        int numberOfSpaces = 1;
        //for loop to print each row of the triangle
        for (int i = 0; i < numOfLines; i++)
        {
            //prints the number of spaces in each row
            for (int k = 0; k < numberOfSpaces; k++)
            {
                System.out.print(space);
            }
            //prints the all the characters in that row
            for (int j = 0; j < amountToPrintInRow; j++)
            {
                System.out.print(lastInitial);
            }
            //prints new line so the new row starts on a new line
            System.out.print("\n");
            //decreases the amount to print in a row by 2 so each row decreases the number of characters
            amountToPrintInRow = amountToPrintInRow - 2;
            //increases the number of spaces for the next row
            numberOfSpaces = numberOfSpaces + 1;
        }

    }


    public static void main(String[] args)
    {
        //prints the beginning of the project
        System.out.println("Martin Hauck - Project 3");

        //prints a new line so the diamond can start on an extra new line
        System.out.print("\n");


        //calling the random method with the min and max numbers to pick between
        setRandom(11, 30);
        //calling MHPrintUpperTriangle with letter to print and with number of lines to print
        MHPrintUpperTriangle(numOfLines, 'M');

        //calling MHPrintMiddleLine with number of characters to print and character to print
        MHPrintMiddleLine(numOfLines, '=');

        //calling MHPrintLowerTriangle with letter to print and with number of lines to print
        MHPrintLowerTriangle(numOfLines, 'H');


        //printing of the end of the project
        System.out.println("Martin Hauck - End of project");
    }

}
