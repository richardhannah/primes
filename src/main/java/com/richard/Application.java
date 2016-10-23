package com.richard;

import java.util.Scanner;

/**
 * Created by highl on 22/10/2016.
 */
public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime number multiplication table");
        PrimesAlgorithm algorithm = selectAlgorithm(scanner);
        int dimensions = collectInput(scanner);

        MultiplicationTableBuilder tableBuilder = new PrimesTableBuilder()
                .withFormatter(new PrimesTableFormatter())
                .withAlgorithm(algorithm);
        FormattedTable table = tableBuilder.build(dimensions);
        table.display();
        main(new String[]{""});

    }

    private static PrimesAlgorithm selectAlgorithm(Scanner scanner){
        int choice;
        System.out.println("Select Algorithm");
        System.out.println("1. Apache commons math3 library");
        System.out.println("2. Sieve of Eratosthenes");
        System.out.println("3. Exit");
        do {
            System.out.println("Enter selection");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid entry");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice <= 0);

        switch (choice){
            case 1:
                return new SimplePrimes();
            case 2:
                return new EratosthenesSieve();
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid selection");
                selectAlgorithm(scanner);
        }
        return null;
    }

    private static int collectInput(Scanner scanner){
        int dimensions;
        do {
            System.out.println("Enter size of grid");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid entry");
                scanner.next();
            }
            dimensions = scanner.nextInt();
        } while (dimensions <= 0);
        return dimensions;
    }
}
