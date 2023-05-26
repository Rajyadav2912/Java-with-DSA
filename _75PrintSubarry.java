
public class _75PrintSubarry {

    public static void PrintSubarry(int number[]) {
        int total_Sub_arry = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                total_Sub_arry++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray is : " + total_Sub_arry);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        PrintSubarry(number);
    }
}
