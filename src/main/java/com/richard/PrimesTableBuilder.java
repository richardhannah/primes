package com.richard;

/**
 * Created by highl on 22/10/2016.
 */
public class PrimesTableBuilder implements MultiplicationTableBuilder {

    FormattedTable formattedTable;
    TableFormatter formatter;
    FactorGenerator factorGenerator;

    public MultiplicationTableBuilder withFactorGenerator(FactorGenerator factorGenerator) {
        this.factorGenerator = factorGenerator;
        return this;
    }

    public MultiplicationTableBuilder withFormatter(TableFormatter tableFormatter) {
        this.formatter = tableFormatter;
        return this;
    }

    public FormattedTable build(int dimensions) {

        long[] factors = factorGenerator.generateFactors(dimensions);

        long[][] table = new long[dimensions+1][dimensions+1];

        for(int i = 1;i < table.length;i++){
            table[0][i] = factors[i-1];
            table[i][0] = factors[i-1];
        }

        formattedTable = new FormattedTable();
        formattedTable.setTable(table);


        return formattedTable;
    }

    public void setTable(long[][] table) {

    }

}
