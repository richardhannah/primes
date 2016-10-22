package com.richard;

import java.util.Scanner;

/**
 * Created by highl on 22/10/2016.
 */
public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime number multiplication table");
        int dimensions = Integer.valueOf(scanner.nextLine());

        MultiplicationTableBuilder tableBuilder = new PrimesTableBuilder()
                .withFormatter(new PrimesTableFormatter())
                .withFactorGenerator(new PrimeFactorGenerator(new EratosthenesSieve()));
        FormattedTable table = tableBuilder.build(dimensions);
        table.display();

    }



}
