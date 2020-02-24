package com.epam.logger.subtask1;

import java.util.Scanner;

import org.apache.logging.log4j.*;
public class ClientApp {

    static SimpleInterest objectForSimpleInterest;
    static CompoundInterest objectForCompoundInterest;

    static Logger LOGGER = LogManager.getLogger(ClientApp.class);

    static void displayLabel() {
        System.out.println("*********************************************************");
        System.out.println("                    InterestCalculator                   ");
        System.out.println("*********************************************************");
        LOGGER.info("displayLabael Called");
    }

    static void displayMenu() {
        System.out.println("1.Calculate Simple Interest");
        System.out.println("2.Calculate Coumpound Interest");
        LOGGER.info("displayMenu Called");
    }

    public static void main(String[] args) throws Exception {

        LOGGER.info("main method called");
        objectForCompoundInterest = new CompoundInterest();
        objectForSimpleInterest = new SimpleInterest();

        Double rateOfInterest;
        Integer principalAmount;
        Double periodOfInterest;

        displayLabel();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal Amount :");
        principalAmount = input.nextInt();
        System.out.println("Enter Rate Of Interest :");
        rateOfInterest = input.nextDouble();
        System.out.println("Enter Period Of Interest :");
        periodOfInterest = input.nextDouble();

        displayMenu();
        int choice = input.nextInt();

        LOGGER.info("Values accepted");
        switch (choice) {
            case 1:
                System.out.print("Simple Interest is : ");
                System.out.println(
                        objectForSimpleInterest.calculateInterest(rateOfInterest, principalAmount, periodOfInterest));
                        LOGGER.info("Simple Interest Calculated Successfully");
                break;
            case 2:
                System.out.print("Compound Interest is : ");
                System.out.println(
                        objectForCompoundInterest.calculateInterest(rateOfInterest, principalAmount, periodOfInterest));
                        LOGGER.info("Compound Interest Calculated Successfully");
                break;
            default:
                System.err.println("Enter Valid Operation");
        }
        input.close();
    }
}