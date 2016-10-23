package com.richard;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by highl on 22/10/2016.
 */
public class Application {

    private static InputProcessor inputProcessor;

    public static void main(String[] args) {

        inputProcessor = new InputProcessor(System.in,System.out);
        System.out.println("Prime number multiplication table");
        System.out.println("Select Algorithm");
        System.out.println("1. Apache commons math3 library");
        System.out.println("2. Sieve of Eratosthenes");
        System.out.println("3. Exit");

        PrimesAlgorithm algorithm = selectAlgorithm(inputProcessor.getInput());

        System.out.println("Enter size of grid");
        int dimensions = inputProcessor.getInput();

        MultiplicationTableBuilder tableBuilder = new PrimesTableBuilder()
                .withFormatter(new PrimesTableFormatter())
                .withAlgorithm(algorithm);
        FormattedTable table = tableBuilder.build(dimensions);
        table.display();
        main(new String[]{""});

    }

    private static PrimesAlgorithm selectAlgorithm(int choice){
        switch (choice){
            case 1:
                return new SimplePrimes();
            case 2:
                return new EratosthenesSieve();
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid selection - please try again");
                return selectAlgorithm(inputProcessor.getInput());
        }
    }

    public static class InputProcessor {

        private final Scanner scanner;
        private final PrintStream out;

        public InputProcessor(InputStream in, PrintStream out) {
            this.scanner = new Scanner(in);
            this.out = out;
        }

        public int getInput() {
            int retvalue;
            do {
                System.out.println("Enter size of grid");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid entry");
                    scanner.next();
                }
                retvalue = scanner.nextInt();
            } while (retvalue <= 0);

            return scanner.nextInt();
        }
    }
}


