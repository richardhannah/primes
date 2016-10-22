package com.richard;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.math3.primes.Primes;

import java.util.List;

/**
 * Created by highl on 22/10/2016.
 */
public class PrimeFactorGenerator implements FactorGenerator {
    public long[] generateFactors(int numberOfFactors) {
        return simplePrimeFactors(numberOfFactors);
    }

    private long[] simplePrimeFactors(int numberOfFactors){

        long[] factors = new long[numberOfFactors];

        int position = 0;
        for(int i = 0; i < factors.length; i++){
            if(Primes.isPrime(i)){
                factors[position] = i;
                position++;
            }
        }
        return factors;
    }
}
