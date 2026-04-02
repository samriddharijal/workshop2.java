package workshop2;

import java.util.Scanner;

public class qs4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n <= 0) {
            System.out.println("Please enter at least one person.");
            return;
        }

        String[] names = new String[n];
        int[] ages   = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of person " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int oldestIdx  = 0;
        int youngestIdx = 0;

        for (int i = 1; i < n; i++) {
            if (ages[i] > ages[oldestIdx])  oldestIdx  = i;
            if (ages[i] < ages[youngestIdx]) youngestIdx = i;
        }

        System.out.println("\n--- Result ---");
        System.out.println("Oldest  : " + names[oldestIdx]  + " (Age: " + ages[oldestIdx]  + ")");
        System.out.println("Youngest: " + names[youngestIdx] + " (Age: " + ages[youngestIdx] + ")");

        scanner.close();
    }
}
