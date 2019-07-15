package il.co.tasks;


import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Integer exitOrContinue;
        Double a,b,c,d;
        ConvertDomain firstConvert = new ConvertDomain();
        ConvertDomain secondConvert = new ConvertDomain();
        InputOutputOperations inputOperations = new InputOutputOperations();

        while (true) {

                firstConvert.setConvertSides(inputOperations.inputConvertSide());
                firstConvert.setConvertSides(inputOperations.inputConvertSide());
                secondConvert.setConvertSides(inputOperations.inputConvertSide());
                secondConvert.setConvertSides(inputOperations.inputConvertSide());

                Collections.sort(firstConvert.getConvertSides());
                Collections.sort(secondConvert.getConvertSides());

                a = firstConvert.getConvertSides().get(0);
                b = firstConvert.getConvertSides().get(1);
                c = secondConvert.getConvertSides().get(0);
                d = secondConvert.getConvertSides().get(1);

                if ((a > c)&& (a > d) && (b > d)){
                    System.out.println("You can put the second Convert inside First one");
                }else
                if ((c >a) && (c > b) && (d > b)){
                    System.out.println("You can put the first Convert inside Second one");
                }
                else System.out.println("You can't put any Convert inside each other");

            System.out.println(firstConvert.getConvertSides());
            System.out.println(secondConvert.getConvertSides());

                // Exit the program or continue;
                System.out.println("Continue: 1, Exit 2 ");
                firstConvert.getConvertSides().clear();
                secondConvert.getConvertSides().clear();
            exitOrContinue = inputOperations.exitProgram();
                if (exitOrContinue == 2) {
                    break;
                }
        }
    }
}