public class Task1 {
    public static void main(String[] args) {
        int [] temps={78,75,82,63,75,66,81};

        int high=temps[0];
        int low=temps[0];

        for (int day = 1; day < temps.length; day++) {
            if (temps[day] > high) {
                high = temps[day];
            }

            if (temps[day] < low) {
                low = temps[day];
            }
        }
        System.out.println("Highest temperature for the week: " + high);
        System.out.println("Lowest temperature for the week: " + low);

    }
}
