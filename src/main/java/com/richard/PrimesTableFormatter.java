package com.richard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by highl on 22/10/2016.
 */
public class PrimesTableFormatter implements TableFormatter{

    private List<String> tableRows;

    public List<String> formatTable(long[][] table) {
        tableRows = new ArrayList<String>();
        for(int x =0; x < table.length; x++){
            String row = "|";
            for(int y = 0; y <table[x].length;y++){
                row = row + String.valueOf(table[x][y]) + "|";

            }
            tableRows.add(row);
        }
        return tableRows;
    }
}
