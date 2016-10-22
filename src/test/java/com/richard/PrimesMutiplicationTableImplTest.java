package com.richard;


import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by highl on 22/10/2016.
 */
public class PrimesMutiplicationTableImplTest {


    PrimesMultiplicationTable primesMultiplicationTable;

    @Before
    public void setUp() throws Exception {
        primesMultiplicationTable = new PrimesMutiplicationTableImpl();
    }

    @Test
    public void getPrimesArray() throws Exception {

        int arraySize = 1;

        int[][] primesArray = primesMultiplicationTable.getPrimesArray(arraySize);

        assertThat(primesArray.length).isEqualTo(arraySize + 1); //row
        assertThat(primesArray[0].length).isEqualTo(arraySize + 1); //col

    }

}