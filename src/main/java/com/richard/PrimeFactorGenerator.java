package com.richard;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.math3.primes.Primes;

import java.util.List;

/**
 * Created by highl on 22/10/2016.
 */
public class PrimeFactorGenerator implements FactorGenerator {

    PrimesAlgorithm algorithm;

    public PrimeFactorGenerator(PrimesAlgorithm algorithm){
        this.algorithm=algorithm;
    }

    public long[] generateFactors(int numberOfFactors) {
        return algorithm.getPrimes(numberOfFactors);
    }


}
