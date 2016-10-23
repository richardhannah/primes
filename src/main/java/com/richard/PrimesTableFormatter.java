package com.richard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by highl on 22/10/2016.
 */
public class PrimesTableFormatter implements TableFormatter{

    private List<String> tableRows;

    public List<String> formatTable(long[][] table,int dimensions) {

        int maxCellWidth = String.valueOf(table[dimensions][dimensions]).length();

        tableRows = new ArrayList<String>();
        for(int x =0; x < table.length; x++){
            String row = "|";
            for(int y = 0; y <table[x].length;y++){
                String value = String.valueOf(table[x][y]);
                int cellspace = maxCellWidth - value.length();
                String spacer = "";
                for(int i = 0; i < cellspace;i++){
                    spacer =spacer + " ";
                }
                if(x==0 && y==0){
                    row = row + spacer + " " + "|";
                }
                else {
                    row = row + spacer + value + "|";
                }
            }
            tableRows.add(row);
        }
        return tableRows;
    }
}
