public static void printPrimes(boolean[] arr, int n) {
    int countPrimes = 0;
    System.out.println("Prime numbers up to " + n);
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
