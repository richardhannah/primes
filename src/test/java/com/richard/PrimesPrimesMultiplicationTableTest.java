package com.richard;


import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by highl on 22/10/2016.
 */
public class PrimesPrimesMultiplicationTableTest {


    MultiplicationTable multiplicationTable;

    @Before
    public void setUp() throws Exception {
        multiplicationTable = new PrimesMultiplicationTable();
    }

    @Test
    public void getPrimesArray() throws Exception {

        int arraySize = 1;

        int[][] primesArray = multiplicationTable.getPrimesArray(arraySize);

        assertThat(primesArray.length).isEqualTo(arraySize + 1); //row
        assertThat(primesArray[0].length).isEqualTo(arraySize + 1); //col

    }

}