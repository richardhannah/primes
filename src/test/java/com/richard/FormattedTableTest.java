package com.richard;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

/**
 * Created by highl on 22/10/2016.
 */
public class FormattedTableTest {

    List<String> tableRows;


    Duration duration;

    @Before
    public void setUp() throws Exception {
        tableRows = new ArrayList<>();
        tableRows.add("test");
        duration = Duration.between(Instant.now(),Instant.now().plusNanos(10000));
    }

    @Test
    @Ignore
    public void setTable() throws Exception {

    }

    @Test
    public void display() throws Exception {

        FormattedTable formattedTable = new FormattedTable();
        formattedTable.setTable(tableRows);
        formattedTable.setPrimesDuration(duration);
        formattedTable.setMultTableDuration(duration);
        formattedTable.display();


    }

}