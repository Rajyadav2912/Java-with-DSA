import java.util.*;

public class _86_2DArrRepresentation {
    public static boolean SearchKey(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key is found : " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key is not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        // input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter your Key : ");
        int key = sc.nextInt();
        // OutPut
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
                // Find your largest element
                Largest = Math.max(Largest, matrix[i][j]);
                // Find your Smallest element
                Smallest = Math.min(Smallest, matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Largest Element is : " + Largest);
        System.out.println("Smallest Element is : " + Smallest);
        SearchKey(matrix, key);
    }
}
