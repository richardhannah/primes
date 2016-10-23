package com.richard;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

/**
 * Created by highl on 22/10/2016.
 */
public class FormattedTableTest {

    long[][] table;


    Duration duration;

    @Before
    public void setUp() throws Exception {

        table = new long[3][3];
        table[0] = new long[]{1,2,3};
        table[1] = new long[]{1,2,3};
        table[2] = new long[]{1,2,3};

        duration = Duration.between(Instant.now(),Instant.now().plusNanos(10000));
    }

    @Test
    @Ignore
    public void setTable() throws Exception {

    }

    @Test
    public void display() throws Exception {

        FormattedTable formattedTable = new FormattedTable();
        formattedTable.setTable(table);
        formattedTable.setPrimesDuration(duration);
        formattedTable.setMultTableDuration(duration);
        formattedTable.display();


    }

}