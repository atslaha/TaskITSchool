package il.co.tasks;

import java.util.Objects;

public class ConvertDomain {

    private Double sideA;
    private Double sideB;

    public ConvertDomain(){}

    public ConvertDomain(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String toString(){
        return "sideA: " + sideA + " sideB: " + sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConvertDomain)) return false;
        ConvertDomain that = (ConvertDomain) o;
        return (Objects.equals(sideA, that.sideA) && Objects.equals(sideB, that.sideB));
    }

    @Override
    public int hashCode() {
        Integer result = 17;
        result = result*37 + sideA.hashCode();
        result = result*37 + sideB.hashCode();
        return result;
    }
}
