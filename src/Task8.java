public class Task8 {
    public static void main(String[] args) {

        int[][] numbers = {
                {2, 4, 6, 8},
                {3, 9, 12, 15},
                {5, 11, 13, 17}
        };
        int high = numbers[0][0];
        int low = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > high) {
                    high = numbers[i][j];
                }
                if (numbers[i][j] < low) {
                    low = numbers[i][j];
                }
            }
        }

        System.out.println("Highest Number in the Array: " + high);
        System.out.println("Lowest Number in the Array: " + low);
    }
}
