package com.richard;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

/**
 * Created by highl on 22/10/2016.
 */
public class PrimesTableFormatterTest {


    private long[][] table;

    private TableFormatter tableFormatter;


    @Before
    public void setUp() throws Exception {
        table = new long[3][3];
        table[0] = new long[]{1,2,3};
        table[1] = new long[]{1,2,3};
        table[2] = new long[]{1,2,3};

        this.tableFormatter = new PrimesTableFormatter();
    }

    @Test
    public void formatTable() throws Exception {

        List<String> formattedRows;

        formattedRows = tableFormatter.formatTable(table);

        String regex = "[\\|\\d\\|]+";
        for(String row : formattedRows){
            assertTrue(row.matches(regex));
        }

    }




}

