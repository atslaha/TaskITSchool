package il.co.tasks;

public class App {
    public static void main(String[] args) {
        int exitOrContinue;
        ConvertDomain firstConvert = new ConvertDomain();
        ConvertDomain secondConvert = new ConvertDomain();
        InputOutputOperations inputOperations = new InputOutputOperations();

        while (true) {

                firstConvert.setSideA(inputOperations.inputConvertSide());
                firstConvert.setSideB(inputOperations.inputConvertSide());
                secondConvert.setSideA(inputOperations.inputConvertSide());
                secondConvert.setSideB(inputOperations.inputConvertSide());

            System.out.println(ConvertComparator.convertCompare(firstConvert, secondConvert));

            System.out.println(firstConvert.toString());
            System.out.println(secondConvert.toString());

                // Exit the program or continue;
                System.out.println("Continue: 1, Exit 2 ");
                firstConvert.setSideA(0);
                firstConvert.setSideB(0);
                secondConvert.setSideA(0);
                secondConvert.setSideB(0);
            exitOrContinue = inputOperations.exitProgram();
                if (exitOrContinue == 2) {
                    break;
                }
        }
    }
}