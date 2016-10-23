package com.richard;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;

/**
 * Created by highl on 23/10/2016.
 */
public class PrimesTableBuilderTest {

    MultiplicationTableBuilder multiplicationTableBuilder;

    @Mock
    TableFormatter tableFormatter;

    @Mock
    PrimesAlgorithm primesAlgorithm;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        multiplicationTableBuilder = new PrimesTableBuilder();
    }

    @Test
    public void withFactorGenerator() throws Exception {
        MultiplicationTableBuilder builder = multiplicationTableBuilder.withAlgorithm(primesAlgorithm);
        assertTrue(builder.equals(multiplicationTableBuilder));
    }

    @Test
    public void withFormatter() throws Exception {
        MultiplicationTableBuilder builder = multiplicationTableBuilder.withFormatter(tableFormatter);
        assertTrue(builder.equals(multiplicationTableBuilder));
    }

    @Test
    public void build() throws Exception {

        long[] factors = new long[]{2,3,5};

        given(primesAlgorithm.getPrimes(anyInt())).willReturn(factors);

        FormattedTable formattedTable = multiplicationTableBuilder
                .withFormatter(tableFormatter)
                .withAlgorithm(primesAlgorithm)
                .build(1);
    }

    @Test
    public void setTable() throws Exception {

    }

}