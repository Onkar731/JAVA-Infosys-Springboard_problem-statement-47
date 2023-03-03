public class RemoveEven {
    public static int removeEven(int number) {
        // declaring variables
        int digitPower = 0;
        int newNumber = 0;

        while(number != 0) {
            int lastDigit = number%10;

            if(lastDigit%2 == 1) {
                newNumber = lastDigit * (int)Math.pow(10, digitPower) + newNumber;
                digitPower++;
            }

            // removing last digit
            number /= 10;
        }

        // returning new number
        return newNumber;
    }
}