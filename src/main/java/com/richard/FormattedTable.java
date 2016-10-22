package com.richard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by highl on 22/10/2016.
 */
public class FormattedTable {

    List<String> tableRows;
    private long[][] table;

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
    }
}
