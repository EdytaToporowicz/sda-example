package com.sda.example.client;

import com.sda.example.application.EntryController;

import java.util.Scanner;

public class ExampleClient {

    private final EntryController entryController = new EntryController();

    public void runClientInterface() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Twoja aplikacja została uruchomiona");

        while (true) {
            System.out.println("Witaj w pamiętniku, co chcesz zrobić: ");
            System.out.println("1. Dodać nowy wpis");
            System.out.println("2. Odczytać istniejące wpisy");
            System.out.println("0. Zamknąć aplikacje");

            int response = scanner.nextInt();

            switch (response) {
                case 1:
                    addNewEntry();
                    break;
                case 2:
                    readAllEntries();
                    break;
                case 0:
                    System.out.println("Twoja aplikacja jest zamykana");
                    return;
            }
        }

    }

    private void readAllEntries() {
        String response = entryController.readAllEntries();
        System.out.println("Twoje wpisy: " + response);
    }

    private void addNewEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tytul wpisu: ");
        String title = scanner.nextLine();
        System.out.print("Podaj zawartość wpisu: ");
        String content = scanner.nextLine();
        String response = entryController.addNewEntry(title, content);
        System.out.println("Nowy wpis został dodany: " + response + "\n");
    }
}
