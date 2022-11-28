import behavioral.Behavioral;
import creational.Creational;
import structural.Structural;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        short select;
        final Scanner scanner = new Scanner(System.in);

        do {
            printMenu();

            System.out.print("Selected option: ");
            select = scanner.nextShort();

            switch (select) {
                case 1 -> Creational.singleton();
                case 2 -> Creational.factory();
                case 3 -> Creational.abstractFactory();
                case 4 -> Creational.builder();
                case 5 -> Creational.prototype();
                case 6 -> Structural.adapter();
                case 7 -> Structural.bridge();
                case 8 -> Structural.composite();
                case 9 -> Structural.decorator();
                case 10 -> Structural.facade();
                case 11 -> Structural.flyweight();
                case 12 -> Structural.proxy();
                case 13 -> Behavioral.observer();
                case 14 -> Behavioral.chainOfResponsability();
                case 15 -> Behavioral.iterator();
                case 16 -> Behavioral.memento();
                case 17 -> Behavioral.state();
                case 18 -> Behavioral.template();
                case 19 -> Behavioral.command();
                case 20 -> Behavioral.mediator();
                case 21 -> Behavioral.strategy();
                case 22 -> Behavioral.visitor();
            }

            clear();
        } while (select != 0);
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("| 1 - Creational: Singleton                                 |");
        System.out.println("| 2 - Creational: Factory                                   |");
        System.out.println("| 3 - Creational: Abstract Factory                          |");
        System.out.println("| 4 - Creational: Builder                                   |");
        System.out.println("| 5 - Creational: Prototype                                 |");
        System.out.println("| 6 - Structural: Adapter (Wrapper)                         |");
        System.out.println("| 7 - Structural: Bridge (Handle/Body)                      |");
        System.out.println("| 8 - Structural: Composite                                 |");
        System.out.println("| 9 - Structural: Decorator (Wrapper)                       |");
        System.out.println("| 10 - Structural: Facade                                   |");
        System.out.println("| 11 - Structural: Flyweight                                |");
        System.out.println("| 12 - Structural: Proxy (Surrogate)                        |");
        System.out.println("| 13 - Behavioral: Observer (Dependents, Publish-Subscribe) |");
        System.out.println("| 14 - Behavioral: Chain of responsibility                  |");
        System.out.println("| 15 - Behavioral: Iterator (Cursor)                        |");
        System.out.println("| 16 - Behavioral: Memento                                  |");
        System.out.println("| 17 - Behavioral: State                                    |");
        System.out.println("| 18 - Behavioral: Template Method                          |");
        System.out.println("| 19 - Behavioral: Command (Action, Transaction)            |");
        System.out.println("| 20 - Behavioral: Mediator                                 |");
        System.out.println("| 21 - Behavioral: Strategy (Policy)                        |");
        System.out.println("| 22 - Behavioral: Visitor                                  |");
        System.out.println("| 0 - Exit                                                  |");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("=> You cand find more documentation in: https://www.digitalocean.com/community/tutorials/gangs-of-four-gof-design-patterns");
        System.out.println("Real examples you can find and read in https://java-design-patterns.com/ or https://github.com/iluwatar/java-design-patterns");
        System.out.println();
    }

    private static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}