package ChapterNine;

/**
 * Author: Jason D'Oyley
 * Date: Jan 12, 2023
 * Topic: Demonstrate exception handling.
 *
 * A Simple Exception Example
 *
 * Here is a simple example that illustrates how to watch for and catch an exception.
 * As you know, it is an error to attempt to index an array beyond its boundaries.
 * When this occurs, the JVM throws an ArrayIndexOutOfBoundsException.
 */

public class ExcDemo1 {
    public static void main(String[] args) {
        int [] nums = new int[4];

        try {
            System.out.println("Before exception is generated");

            // Generate an index out-of-bound exception
            nums[0] = 10;
            System.out.println("this won't be displayed");
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
