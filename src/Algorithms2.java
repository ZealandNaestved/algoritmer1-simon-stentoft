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
        SortDrengeArray();
        SortRandomNumbersArray();
        BinarySearchArray();
        BinarySearchDrengeNavneArray();
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

    public static int[] SortRandomNumbersArray() {
        int[] numbers = new Data().getRandomNumbers1000(); //Laver et array kaldet numbers, der får data fra randomNumbers1000 array i Data.
        Arrays.sort(numbers); //Bruger Arrays.sort metode til at sortere numrene.
        return numbers;
    }

    // TODO 4 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne

    public static String[] SortDrengeArray() {
        String[] drengeNavne = new Data().getRandomDrengeNavne();
        Arrays.sort(drengeNavne);
        return drengeNavne;
    }
    // TODO 5 Skriv en metode her i denne klasse, som kan finde et tal i Data klassens randomNumbers1000 felt med BINARY SEARCH
    // For at kunne binarySearch skal array være pre sorted i increasing order.

    public static void BinarySearchArray() {
        int result = Arrays.binarySearch(SortRandomNumbersArray(),404);  //Bruger mit sorterede array fra Opg4 pga. array skal være sorteret i forvejen i increasing order før man kan binary search.
        if (result == -1) {
            System.out.println("Element is not present");
        } else
            System.out.println("Element is present at index " + result);
    }

    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH

    public static void BinarySearchDrengeNavneArray() {
        int result = Arrays.binarySearch(SortDrengeArray(),"Brormand");
        if (result == -1) {
            System.out.println("Element is not present");
        } else
            System.out.println("Element is present at index " + result);
    }

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
