public class Main {
    public static void main(String[] args) {

        int taskN;

        // Heading
        System.out.println();
        System.out.println();
        System.out.println("<<<<  Homework 06  >>>>");
        System.out.println();

        taskN = 0;

        // Task 1

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        for (short i = 1; i <= 10; i += 1) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println();


        // Task 2

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        for (short i = 10; i >= 1; i -= 1) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println();


        // Task 3

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int a;
        for (short i = 0; i <= 17; i += 1) {
            a = i % 2;
            if (a == 0) {
                System.out.print(i + " | ");
            }
        }
        System.out.println();
        System.out.println();

        // Task 4

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        for (short i = 10; i >= -10; i -= 1) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println();


        // Task 5

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int counter = 0;
        for (short i = 1904; i <= 2096; i += 4) {
            counter += 1;
            System.out.print(i + ", ");
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
        System.out.println();
        System.out.println();

        // Task 6

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        for (short i = 7; i <= 98; i += 7) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println();

        // Task 7

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        for (short i = 1; i <= 512; i *= 2) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println();

        // Task 8

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int deposit = 0;
        for (short i = 1; i <= 12; i++) {
            deposit = deposit + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна: " + deposit);
        }
        System.out.println();
        System.out.println();

        // Task 9

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        double deposit2 = 0;
        for (short i = 1; i <= 12; i++) {
            deposit2 = (deposit2 + 29000) * 1.1;
            System.out.print("Месяц " + i + ", сумма накоплений равна: ");
            System.out.printf("%.2f", deposit2);
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // Task 10

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        for (short i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (i * 2));
        }
        System.out.println();
        System.out.println();
    }
}

