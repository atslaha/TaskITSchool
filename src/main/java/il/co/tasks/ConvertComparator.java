package il.co.tasks;

public class ConvertComparator {

    static String convertCompare(ConvertDomain firstConvert, ConvertDomain secondConvert){
        if (((firstConvert.getSideA() > secondConvert.getSideA())
                && (firstConvert.getSideB() > secondConvert.getSideB())
                &&(firstConvert.getSideA() > secondConvert.getSideB()))){
            return "You can put the second Convert inside First one";
        }else
        if ((secondConvert.getSideA() > firstConvert.getSideA())
                && (secondConvert.getSideA() > firstConvert.getSideB())
                && (secondConvert.getSideB() > firstConvert.getSideB())){
            return "You can put the first Convert inside Second one";
        }
        else return "You can't put any Convert inside each other";
    }
}
