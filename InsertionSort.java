package HW2;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        InsertionS(array);
        System.out.println(Arrays.toString(array));
    }
    
    static void InsertionS(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > element) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = element;
        }
    }
}
