package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        double[] array1 = {2, 3, 7, 9, 44};
        double[] array2 = {2, 3, 9, 44};
        Arrays.sort(array1);

        if(array1.length%2 != 0)
        {
            System.out.println("The Median for array1 is: " + array1[(array1.length-1)/2]);
        }
        else
        {
            double middleElement1 = array1[(array1.length/2)-1];
            double middleElement2 = array1[array1.length/2];
            double middleElementSum = (middleElement1 + middleElement2);
            double median = (middleElementSum/2);
            System.out.println("The median for array2 is: " + median);
        }

        if(array2.length%2 != 0)
        {
            System.out.println("The Median for array2 is: " + array2[(array2.length-1)/2]);
        }
        else
        {
            double middleElement1 = array2[(array2.length/2)-1];
            double middleElement2 = array2[array2.length/2];
            double middleElementSum = (middleElement1 + middleElement2);
            double median = (middleElementSum/2);
            System.out.println("The median for array2 is: " + median);
        }
    }
}
