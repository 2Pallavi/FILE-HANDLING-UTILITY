package com.file.read;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class modifyfile {
	public static void main(String[] args) {
        String filePath = "C:\\Users\\sunil\\Desktop\\readfile.txt";
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Choose an option:");
            System.out.println("1. Append to file");
            System.out.println("2. Replace file content");
            System.out.print("Enter your choice (1 or 2): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the leftover newline

            boolean appendMode;

            if (choice == 1) {
                appendMode = true;
            } else if (choice == 2) {
                appendMode = false;
            } else {
                System.out.println("Invalid choice. Exiting.");
                scanner.close();
                return;
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, appendMode))) {
                System.out.println("Enter text to write to the file. Type 'EOF' on a new line to finish:");

                String line;
                while (!(line = scanner.nextLine()).equals("EOF")) {
                    writer.write(line);
                    writer.newLine();
                }

                System.out.println("File modified successfully.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}
