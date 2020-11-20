import java.util.Arrays;
/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms2 {
    public static void main(String[] args) {
        SearchNumbers1000();
        SearchDrengeNavne();
        SortIntArray();
        SortStringArray();
    }

    // TODO 1 Skriv en metode her i denne klasse, som kan finde et tal i Data klassens randomNumbers1000 felt med LINEAR SEARCH

    public static void SearchNumbers1000() {
        int result = searchLinear(new Data().getRandomNumbers1000(), 999);
        if (result == -1) {
            System.out.println("Element is not present.");
        } else
            System.out.println("Element is present at index " + result);
    }

    // TODO 2 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med LINEAR SEARCH

    public static void SearchDrengeNavne() {
        int result = linearSearch(new Data().getRandomDrengeNavne(),"yayaya");
        if (result == -1) {
            System.out.println("Name is not present");
        } else
            System.out.println("Element is present at index " + result);
    }

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomNumbers1000

    public static int[] SortIntArray() {
        int[] numbers = new Data().getRandomNumbers1000(); //Laver et array kaldet numbers, der får data fra randomNumbers1000 array i Data.
        Arrays.sort(numbers); //Bruger Arrays.sort metode til at sortere numrene.
        return numbers;
    }

    // TODO 4 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne

    public static String[] SortStringArray() {
        String[] drengeNavne = new Data().getRandomDrengeNavne();
        Arrays.sort(drengeNavne);
        return drengeNavne;
    }
    // TODO 5 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomNumbers1000 felt med BINARY SEARCH



    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH


    //Search methods
    public static int searchLinear(int arr[], int x) { //Ints

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1; //Hvis x ikke er i array
    }
    public static int linearSearch(String arr[], String x) { //String
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i].equals(x))
                return i;
        }
        return -1;
    }
}
