public class que18 {
    public static void main(String[] args) {
        int originalNum = 121;
        int num = originalNum;
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // Check if the original number and reversed number are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
