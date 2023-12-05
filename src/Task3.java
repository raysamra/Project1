public class Task3 {
    public static void main(String[] args) {

        String str= "It's Savera's Birthday today. It's Sunday. Today is Java Class";

        String[] strArr= str.split("[.]"); //split based on period and is in array
        System.out.println(strArr.length); //gives how many rows in array
        System.out.println(strArr[1].trim()); //will print 2nd row amd trim space before 'Its'


    }
}
