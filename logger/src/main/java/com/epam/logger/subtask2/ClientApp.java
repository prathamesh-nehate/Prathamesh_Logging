package com.epam.logger.subtask2;

import org.apache.logging.log4j.*;
import java.util.Scanner;

class ClientApp {
    static Logger LOGGER = LogManager.getLogger(ClientApp.class);

    static void displayLabel() {
        System.out.println("*********************************************************");
        System.out.println("                ConstructionCostCalculator               ");
        System.out.println("*********************************************************");
        LOGGER.info("displayLabael Called");
    }

    static void displayMenu() {
        System.out.println("List of Material Standard");
        System.out.println("1.Standard");
        System.out.println("2.Above Standard");
        System.out.println("3.High Standard");
        System.out.println("4.High Standard + Fully Automated");
        LOGGER.info("displayMenu Called");
    }

    public static void main(String[] args) {
        LOGGER.info("main method  Called");
        Construction objectConstruction = new Construction();
    
        displayLabel();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Carpet area of House (in square feet) : ");

        int squareFeet = input.nextInt();

        displayMenu();

        System.out.println("Select Material Standard");
        int menuEnumerationIndex = input.nextInt();

        LOGGER.info("Value Accepted");
        System.out.print("Construction cost is : ");

        try {
            System.out.println(objectConstruction.calculateCostPerSquareFeet(menuEnumerationIndex, squareFeet));
            LOGGER.info("Cost Successfully Calculated");
        } catch (InputValueException e) {
            System.err.println(e.getMessage());;
            LOGGER.info(e.getMessage());
        }

        input.close();        
    }
}