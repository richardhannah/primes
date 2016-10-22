package com.richard;

import org.apache.commons.math3.primes.Primes;

/**
 * Created by highl on 22/10/2016.
 */
public class SimplePrimes implements PrimesAlgorithm {
    @Override
    public long[] getPrimes(int n) {
        long[] factors = new long[n];

        factors[0] = 2;
        for(int i = 0; i < factors.length -1; i++){
            factors[i + 1] = Primes.nextPrime((int) factors[i] +1);
        }
        return factors;

    }
}