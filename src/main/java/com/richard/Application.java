package com.richard;

/**
 * Created by highl on 22/10/2016.
 */
public class Application {

    public static void main(String[] args) {



        System.out.println("Prime number multiplication table");
        int dimensions = 1;
        try {
            dimensions = System.in.read();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        MultiplicationTableBuilder tableBuilder = new PrimesTableBuilder()
                .withFormatter(new PrimesTableFormatter())
                .withFactorGenerator(new PrimeFactorGenerator());
        FormattedTable table = tableBuilder.build(dimensions);
        table.display();

    }



}
