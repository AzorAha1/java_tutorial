public class methodwithreturn {
    public static void main(String[] args) {
        int number1 = 80;
        int number2 = 70;

        int maxvalue = maxValue(number1, number2);
        System.out.printf("The max value between number 1(%d) and number 2(%d) is %d", number1, number2, maxvalue);
    }
    // method to get max value between parameters

    public static int maxValue(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }
}