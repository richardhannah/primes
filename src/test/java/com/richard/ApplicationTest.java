package com.richard;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;

/**
 * Created by highl on 23/10/2016.
 */
public class ApplicationTest {

    @Mock
    PrimesAlgorithm primesAlgorithm;

    @Mock
    TableFormatter tableFormatter;

    @Mock
    MultiplicationTableBuilder tableBuilder;

    @Mock
    FormattedTable formattedTable;

    @Mock
    Application.InputProcessor inputProcessor;




    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    @Ignore
    public void main() throws Exception {

        given(inputProcessor.getInput()).willReturn(2);
        given(tableBuilder.build(anyInt())).willReturn(formattedTable);

        Application.main(new String[]{""});

    }

}