package com.richard;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by highl on 22/10/2016.
 */
public class FormattedTable {

    List<String> tableRows;
    private long[][] table;
    private Duration primesDuration;
    private Duration multTableDuration;

    public void setPrimesDuration(Duration primesDuration) {
        this.primesDuration = primesDuration;
    }

    public void setMultTableDuration(Duration multTableDuration) {
        this.multTableDuration = multTableDuration;
    }

    public void setTable(long[][] table){
        this.table=table;
        tableRows = new ArrayList<String>();
        for(int x =0; x < table.length; x++){
            String row = "|";
            for(int y = 0; y <table[x].length;y++){
                row = row + String.valueOf(table[x][y]) + "|";

            }
            tableRows.add(row);
        }
    }

    public void display(){
        for(String row : tableRows){
            System.out.println(row);
        }
        System.out.println("PrimeFactors generated in " + primesDuration.getNano()/1000 + " microseconds");
        System.out.println("Multiplication table calculated in " + multTableDuration.getNano()/1000 + " microseconds");

    }
}
