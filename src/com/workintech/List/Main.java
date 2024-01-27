package com.workintech.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryList groceryList = new GroceryList();
        int choice;
        do {
            System.out.println("Options:");
            System.out.println("0 - Quit");
            System.out.println("1 - Add items to the list");
            System.out.println("2 - Remove items from the list");
            System.out.println("3 - Check if an item is in the list");


            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("eklenmesini istedğiniz elamanları giriniz.(birden fazlaysa virgül kullanın)");
                    String itemsToAdd = scanner.nextLine();
                    groceryList.addItem(itemsToAdd);
                    break;
                case 2:
                    System.out.println("silinmesini istedğiniz elamanları giriniz.(birden fazlaysa virgül kullanın)");
                    String itemsToRemove = scanner.nextLine();
                    groceryList.removeItem(itemsToRemove);
                    break;
            }
            groceryList.printSorted();
        } while (choice != 0);
        scanner.close();


    }
}