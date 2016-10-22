package com.richard;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

/**
 * Created by highl on 22/10/2016.
 */
public class PrimesGeneratorImplTest {


    PrimesGenerator primesGenerator;

    @Before
    public void setUp() throws Exception {
        primesGenerator = new PrimesGeneratorImpl();
    }

    @Test
    public void getPrimesArray() throws Exception {

        int arraySize = 1;

        int[][] primesArray = primesGenerator.getPrimesArray(arraySize);

        assertThat(primesArray.length).isEqualTo(arraySize + 1); //row
        assertThat(primesArray[0].length).isEqualTo(arraySize + 1); //col

    }

}