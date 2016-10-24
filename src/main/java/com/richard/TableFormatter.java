package com.richard;

import java.util.List;

/**
 * Created by highl on 22/10/2016.
 */
public interface TableFormatter {

    /**
     * Formats a 2d array into a list of strings
     * @param table the table
     * @param dimensions dimensions of the table
     * @return list of strings
     */
    List<String> formatTable(long[][] table,int dimensions);

}
