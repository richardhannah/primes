package com.richard;

import org.apache.commons.math3.primes.Primes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.mockito.BDDMockito.given;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by highl on 22/10/2016.
 */
public class PrimeFactorGeneratorTest {

    FactorGenerator factorGenerator;

    @Mock
    PrimesAlgorithm algorithm;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        factorGenerator = new PrimeFactorGenerator(algorithm);
    }

    @Test
    public void generateFactors() throws Exception {

        int numfactors =3;
        given(algorithm.getPrimes(numfactors)).willReturn(new long[]{2,3,5});
        long[] factors = factorGenerator.generateFactors(numfactors);

        assertThat(factors.length).isEqualTo(numfactors);
        for(long factor : factors){
            assertThat(Primes.isPrime((int)factor));
        }


    }

}