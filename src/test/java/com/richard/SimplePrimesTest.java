package com.richard;

import org.apache.commons.math3.primes.Primes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by highl on 23/10/2016.
 */
public class SimplePrimesTest {
    PrimesAlgorithm primesAlgorithm;

    @Before
    public void setup(){
        primesAlgorithm = new SimplePrimes();
    }


    @Test
    public void getPrimes() throws Exception {
        int numfactors =3;

        long[] primes = primesAlgorithm.getPrimes(numfactors);

        assertTrue(primes.length == numfactors);
        for(long prime : primes){
            assertTrue(Primes.isPrime((int)prime));
        }
    }
}