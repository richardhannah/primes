package com.richard;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by highl on 22/10/2016.
 */
public class FormattedTableTest {

    long[][] table;

    @Before
    public void setUp() throws Exception {
        table = new long[3][3];
        table[0] = new long[]{1,2,3};
        table[1] = new long[]{1,2,3};
        table[2] = new long[]{1,2,3};

    }

    @Test
    @Ignore
    public void setTable() throws Exception {

    }

    @Test
    public void display() throws Exception {

        FormattedTable formattedTable = new FormattedTable();
        formattedTable.setTable(table);
        formattedTable.display();


    }

}