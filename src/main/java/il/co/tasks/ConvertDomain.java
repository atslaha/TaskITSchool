package il.co.tasks;

import java.util.ArrayList;
import java.util.List;

public class ConvertDomain {
    private  List<Double> convertSides;

    public ConvertDomain(){
        this.convertSides = new ArrayList<Double>();
    }

    public List<Double> getConvertSides() {
        return convertSides;
    }

    public void setConvertSides(List<Double> convertSides) {
        this.convertSides = convertSides;
    }

    public  void setConvertSides(Double side){
        this.convertSides.add(side);
    }
}
