



/*************************************************************************
 *  Compilation:  javac Primes.java
 *  Execution:    java Primes N
 *  
 *  Determines whether or not N is prime.
 *
 *   % java Prime 81
 *   81 is not prime
 *
 *   % java Prime 17
 *   17 is prime
 *
 *   % java Prime 30864324691489
 *   30864324691489 is not prime
 *
 *
 *************************************************************************/



public class Prime {

    public static void main(String[] args) { 
        long N = Long.parseLong(args[0]);
        boolean isPrime = true;
        if (N < 2) isPrime = false;

        // try all possible factors i of N
        // if if N has a factor, then it has one less than or equal to sqrt(N),
        // so for efficiency we only need to check i <= sqrt(N) or equivalently i*i <= N
        for (long i = 2; i*i <= N; i++) {

            // if i divides evenly into N, N is not prime, so break out of loop
            if (N % i == 0) {
                isPrime = false;
                break;
            }
        }

        // print out whether or not N is prime
        if (isPrime) System.out.println(N + " is prime");
        else         System.out.println(N + " is not prime");
    }
}
