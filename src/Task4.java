public class Task4 {
    public static void main(String[] args) {
        int [][] numbers={
                {5,22,34,54,26},
                {6,8,15,27,30,44},
                {9,11,17,24,66,88}
        };
        int sumEven=0;
        int sumOdd=0;

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                if(numbers[i][j]%2==0) {
                    sumEven = sumEven + numbers[i][j];
                }else{
                    sumOdd= sumOdd+numbers[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is "+sumEven);
        System.out.println("The sum of odd numbers is "+sumOdd);


    }
}
