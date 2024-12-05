public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] primeNumbers = findPrimes(n);
        printPrimes(primeNumbers, n);
    }

    public static boolean[] findPrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int k = 2; k <= n; k++) {
            primes[k] = true;
        }
        for (int i = 2; i <= n / 2; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                primes[j] = false;
            }
        }
        return primes;
    }

    public static void printPrimes(boolean[] arr, int n) {
        int countPrimes = 0;
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                countPrimes++;
                System.out.println(i);
            }
        }
        System.out.println("There are " + countPrimes + " primes between 2 and " + n +
                " (" + ((int) (((double) countPrimes / n) * 100) + "% are primes)"));
    }

    public static void println(boolean[] arr) {
        System.out.println("printing arr:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
