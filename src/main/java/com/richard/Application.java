package com.richard;

import java.util.Scanner;

/**
 * Created by highl on 22/10/2016.
 */
public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime number multiplication table");
        int dimensions;

        do {
            System.out.println("Enter size of grid");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid entry");
                scanner.next();
            }
            dimensions = scanner.nextInt();
        } while (dimensions <= 0);


        MultiplicationTableBuilder tableBuilder = new PrimesTableBuilder()
                .withFormatter(new PrimesTableFormatter())
                .withFactorGenerator(new PrimeFactorGenerator(new EratosthenesSieve()));
        FormattedTable table = tableBuilder.build(dimensions);
        table.display();

    }
}
