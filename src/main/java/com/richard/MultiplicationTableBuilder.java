package com.richard;

/**
 * Created by highl on 22/10/2016.
 */
public interface MultiplicationTableBuilder {

    void setTable(long[][] table);
    MultiplicationTableBuilder withFormatter(TableFormatter tableFormatter);
    MultiplicationTableBuilder withFactorGenerator(FactorGenerator factorGenerator);
    FormattedTable build(int dimensions);



}
