package com.richard;

/**
 * Created by highl on 22/10/2016.
 */
public interface MultiplicationTableBuilder {


    /**
     * Adds a tableformatter to the TableBuilder
     * @param tableFormatter the TableFormatter
     * @return the MultiplicationTableBuilder
     */
    MultiplicationTableBuilder withFormatter(TableFormatter tableFormatter);

    /**
     * Adds a Prime Number generation Algorithm to the TableBuilder
     * @param algorithm the PrimesAlgorithm
     * @return the MultiplicationTableBuilder
     */
    MultiplicationTableBuilder withAlgorithm(PrimesAlgorithm algorithm);

    /**
     * Builds the multiplication table and returns a FormattedTable object
     * @param dimensions the dimensions of the table
     * @return FormattedTable
     */
    FormattedTable build(int dimensions);



}
