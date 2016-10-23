package com.richard;

/**
 * Created by highl on 22/10/2016.
 */
public class PrimesTableBuilder implements MultiplicationTableBuilder {

    FormattedTable formattedTable;
    TableFormatter formatter;
    PrimesAlgorithm primesAlgorithm;

    public MultiplicationTableBuilder withAlgorithm(PrimesAlgorithm algorithm) {
        this.primesAlgorithm = algorithm;
        return this;
    }

    public MultiplicationTableBuilder withFormatter(TableFormatter tableFormatter) {
        this.formatter = tableFormatter;
        return this;
    }

    public FormattedTable build(int dimensions) {

        long[] factors = primesAlgorithm.getPrimes(dimensions);

        long[][] table = new long[dimensions+1][dimensions+1];

        for(int i = 1;i < table.length;i++){
            table[0][i] = factors[i-1];
            table[i][0] = factors[i-1];
        }

        formattedTable = new FormattedTable();
        formattedTable.setTable(calculated(table));
        return formattedTable;
    }

    private long[][] calculated(long[][] table){

        for(int x = 1;x < table.length; x++){
            for(int y = 1;y < table.length; y++){
                table[x][y] = table[0][x] * table[y][0];
            }
        }
        return table;
    }

}
