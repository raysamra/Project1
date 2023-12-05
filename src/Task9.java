public class Task9 {
    public static void main(String[] args) {
        int[][] numbers = {
                {2, 4, 6, 8},
                {3, 9, 12, 15},
                {5, 11, 13, 17}
        };

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > largest) {
                    secondLargest = largest;
                    largest = numbers[i][j];
                } else if (numbers[i][j] > secondLargest && numbers[i][j] < largest) {
                    secondLargest = numbers[i][j];
                }
            }
        }

        System.out.println(secondLargest);



    }
}
