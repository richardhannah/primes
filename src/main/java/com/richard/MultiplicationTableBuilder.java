package com.richard;

/**
 * Created by highl on 22/10/2016.
 */
public interface MultiplicationTableBuilder {


    MultiplicationTableBuilder withFormatter(TableFormatter tableFormatter);
    MultiplicationTableBuilder withAlgorithm(PrimesAlgorithm algorithm);
    FormattedTable build(int dimensions);



}
