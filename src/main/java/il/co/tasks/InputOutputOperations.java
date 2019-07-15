package il.co.tasks;

import java.util.Scanner;

public class InputOutputOperations {

    private Scanner scn = new Scanner(System.in);
    private Double sideOfConvert;
    private Integer exitOrContinue;
    private String inputString;

    public Double inputConvertSide() {
        while (true) {
            System.out.println("Enter Sides Of Convert");
            if (scn.hasNextDouble()) {
                inputString = scn.next();
                sideOfConvert = Double.parseDouble(inputString);
                System.out.println("Side of Convert saved successfuly");
                break;
            } else {
                System.out.println("ERROR INPUT!" + "\n" + "Type a digit again please!");
                inputString = scn.nextLine();
                inputString = scn.next();
            }
        }
        return sideOfConvert;
    }

    public int exitProgram() {
        while (true) {
            // Input the choice digit //
            while (true) {
                if (scn.hasNextInt()) {
                    exitOrContinue = scn.nextInt();
                    break;
                } else {
                    System.out.println("ERROR INPUT" + "\n" + "Leave The Program: 1, Continue: 2");
                    inputString = scn.next();
                }
            }
            // Check the choice (1 or 2)//
            if (exitOrContinue >= 1 && exitOrContinue <= 2) {
                break;
            } else {
                System.out.println("ERROR INPUT" + "\n" + "Leave Comix Library: 1, Continue: 2");
            }
        }
        return exitOrContinue;
    }
}
