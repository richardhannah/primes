package com.richard;

/**
 * Created by highl on 22/10/2016.
 */
public class EratosthenesSieve implements PrimesAlgorithm {

    int range = 8;
    boolean[] primes;

    public EratosthenesSieve(){
        primes = new boolean[range +1];
    }

    public long[] getPrimes(int n) {

        long[] factors = new long[n];

        factors[0] = 2;
        for(int i = 0; i < factors.length -1; i++){
            factors[i + 1] = getNextPrime(factors[i]);
        }
        return factors;
    }

    private long getNextPrime(long lastPrime){
        if(lastPrime * 2 > range){
            range = range*2;
            primes = new boolean[range +1];
            return calculateNextPrime(lastPrime);
        }
        return calculateNextPrime(lastPrime);
    }

    private long calculateNextPrime(long lastPrime){

        for(int i = 0; i < primes.length; i++){
            primes[i] = true;
        }
        primes[0] = false;
        primes[1] = false;
        for(int i = 2; i <= Math.sqrt(range); i++){
            if(primes[i]){
                for(int j = 2; i*j <= range; j++){
                    primes[i*j] = false;
                }
            }
        }

        for(int i = (int)lastPrime +1; i < primes.length; i++){
            if(primes[i]){
                return i;
            }
        }
        return 0;
    }

}
