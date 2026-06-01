public class que20 {

    public static void main(String[] args) {
        // display all prime numbers within given range
        int low = 10, high = 50;
        System.out.println("Prime numbers between " + low + " and " + high + ":");
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
