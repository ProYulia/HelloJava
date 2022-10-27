package HW3;
import java.util.ArrayList;

public class LeeAlgorithm {
    public static void main(String[] args) {
        int[][] field = drawField();
        findPath(5, 0, field);
        printArray(field); 
    }

    static void findPath(int startX, int startY, int[][] field) {
        ArrayList<Integer> storage = new ArrayList<>();
        storage.add(startX);
        storage.add(startY);

        while (storage.size() > 0) {
            int x = storage.get(0);
            int y = storage.get(1);
            storage.remove(0);
            storage.remove(0);

            if (x < 9 && field[x+1][y] == 0) {
                storage.add(x+1);
                storage.add(y);
                field[x+1][y] = field[x][y] + 1;
            }
            if (y < 8 && field[x][y+1] == 0) {
                storage.add(x);
                storage.add(y+1);
                field[x][y+1] = field[x][y] + 1;
            }
            if (x > 0 && field[x-1][y] == 0) {
                storage.add(x-1);
                storage.add(y);
                field[x-1][y] = field[x][y] + 1;
            }
            if (y > 0 && field[x][y-1] == 0) {
                storage.add(x);
                storage.add(y-1);
                field[x][y-1] = field[x][y] + 1;
            }
        }
        field[startX][startY] = 0;
    }

    static int[][] drawField() {
        return new int[][]
        {
            {0, 0,  0,  0,  0,  0,  0, -1, 0},
            {0, 0,  0, -1,  0,  0,  0,  0, 0},
            {0, 0, -1, -1, -1, -1, -1,  0, 0},
            {0, 0,  0, -1,  0, -1,  0,  0, 0},
            {0, 0,  0, -1,  0, -1,  0,  0, 0},
            {0, 0,  0, -1,  0, -1,  0,  0, 0},
            {0, 0,  0,  0,  0, -1, -1,  0, 0},
            {0, 0, -1, -1,  0, -1,  0,  0, 0},
            {0, 0,  0,  0,  0,  0, -1,  0, 0},
            {0, 0,  0,  0,  0,  0,  0,  0, 0}
        };
    }

    static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt == -1) System.out.print("*" + "\t");
                else System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
    
}
