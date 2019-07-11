package il.co.tasks;

import java.util.Scanner;

public class InputOutputOperations {

    private Scanner scn = new Scanner(System.in);
    private int sideOfConvert;
    private String inputString;

    public int inputConvertSide() {
        while (true) {
            if (scn.hasNextInt()) {
                inputString = scn.next();
                sideOfConvert = Integer.parseInt(inputString);
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
                    sideOfConvert = scn.nextInt();
                    break;
                } else {
                    System.out.println("ERROR INPUT" + "\n" + "Leave The Program: 1, Continue: 2");
                    inputString = scn.next();
                }
            }
            // Check the choice (1 or 2)//
            if (sideOfConvert >= 1 && sideOfConvert <= 2) {
                break;
            } else {
                System.out.println("ERROR INPUT" + "\n" + "Leave Comix Library: 1, Continue: 2");
            }
        }
        return sideOfConvert;
    }
}
