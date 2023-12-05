public class Task5 {
    public static void main(String[] args) {
        int [][] numbers= {
                {5, 22, 34, 54, 26},
                {6, 8, 15, 27, 30, 44},
                {9, 11, 17, 24, 66, 88}
        };

        int num1Before=0;
        int num2Before=0;
        int num1After=1;
        int num2After=1;
        System.out.println("Before swapping 2 numbers in array: ");
        for (int[] i : numbers) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        numbers[num1Before][num2Before]=numbers[num1Before][num2Before]+numbers[num1After][num2After];
        numbers[num1After][num2After]=numbers[num1Before][num2Before]-numbers[num1After][num2After];
        numbers[num1Before][num2Before]=numbers[num1Before][num2Before]-numbers[num1After][num2After];

        System.out.println("After swapping 2 numbers in array: ");
        for (int[] i : numbers) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
