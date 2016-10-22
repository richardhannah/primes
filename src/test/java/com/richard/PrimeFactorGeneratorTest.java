package com.richard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by highl on 22/10/2016.
 */
public class PrimeFactorGeneratorTest {

    FactorGenerator factorGenerator;

    @Before
    public void setup(){
        factorGenerator = new PrimeFactorGenerator();
    }

    @Test
    public void generateFactors() throws Exception {

        int numfactors =2;

        long[] factors = factorGenerator.generateFactors(numfactors);

        assertThat(factors.length).isEqualTo(numfactors);


    }

}