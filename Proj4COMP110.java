import java.util.Random;
import java.util.Scanner;

public class Proj4COMP110
{
    private int lowerLim;
    private int upperLim;
    private int[] array;
    private int dataSize;

    public Proj4COMP110()
    {
        lowerLim = 15;
        upperLim = 20;
        dataSize = 18;
        array = new int[dataSize];
    }


    public Proj4COMP110(int dataSize)
    {
        boolean flag = true;
        lowerLim = 15;
        upperLim = 20;
        Scanner input = new Scanner(System.in);

        while (flag)
        {
            System.out.print("Enter array size: 15 - 20: ");
            dataSize = input.nextInt();

            if (dataSize >= lowerLim && dataSize <= upperLim)
            {
                array = new int[dataSize];
                flag = false;
            }
            else {
                System.out.println("incorrect value, please try again.");
            }

        }


    }



    public void MHFillArrayWithRandom() {
        Random random = new Random();
        int min = 10;
        int max = 99;

        for (int i = 0; i < array.length; i++) {
            array[i] = min + random.nextInt(max - min + 1);
        }
    }

    public String MHPrintArray() {
        String entireArray = "";

        for (int i = 0; i < array.length; i++) {
            entireArray = entireArray + " " + array[i];
        }
        return entireArray;
    }

    public int MHGetMax(int[] array) {
        int max = 15;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

    public int MHGetMin(int[] array) {
        int min = 100;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    public int MHGetAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        int average = sum / array.length;
        return average;
    }

    public String MHSortPrint()
    {
        String entireArray = "";

        for (int i = 0; i < array.length; i++)
        {
            entireArray = entireArray + " " + array[i] + "\t";
        }
        return entireArray;
    }

    public void MHSelectionSort(int arr[])
    {
        int n = arr.length;

        System.out.println("Sorting ...");

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            int j;
            for (j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[min_idx])
                {
                    min_idx = j;
                }
            }
//            System.out.println(MHPrintArray() + " i: "+ i +" j: " + j);
            System.out.println(MHSortPrint());

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

//            System.out.println(MHPrintArray());
        }
    }

    public double MHGetMedian(int[] array) {
        double median = 0;

        if (array.length % 2 == 0) {
            median = (array[(array.length / 2) -1] + array[((array.length / 2))]) / 2.0;
/*            System.out.println("second " + array[((array.length / 2))]);
            System.out.println("first " + array[(array.length / 2) -1]);*/
        } else {
            median = array[Math.round(array.length / 2)];
        }

        return median;
    }

    public void MHPrintNameStart()
    {
        System.out.println("Martin Hauck - Project 4: Selection Sort");
    }

    public void MHPrintAnswers()
    {

//        fills the array with random numbers
        MHFillArrayWithRandom();

//        prints out the array
//        System.out.println(Arrays.toString(test.array));
        System.out.println("Selection Sort, Number of Array Elements " + array.length);

        System.out.println("Original Array Elements: ");
        System.out.println(MHPrintArray());

//        shows the minimum Value
        System.out.println("Minimum = " + MHGetMin(this.array));

//        shows the maximum
        System.out.println("Maximum = " + MHGetMax(this.array));


//        this shows the average
        System.out.println("Average = " + MHGetAverage(this.array));

//        this shows the sorted array
        MHSelectionSort(this.array);

//        this shows the sorted array
        System.out.println("Median = " + MHGetMedian(this.array));
    }

    public void MHPrintNameEnd()
    {
        System.out.println("Martin Hauck - End of Project 4");
    }



    public static void main(String[] args)
    {
//        makes a new object
        Proj4COMP110 proj4COMP110 = new Proj4COMP110(0);
        proj4COMP110.MHPrintNameStart();
        proj4COMP110.MHPrintAnswers();
        proj4COMP110.MHPrintNameEnd();

    }
}
