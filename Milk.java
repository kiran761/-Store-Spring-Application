public class Milk {
    String milkName;
    int milkCost;
    int milkQuantity;
    String milkExpiry;

    public Milk(String milkName, int milkCost, int milkQuantity, String milkExpiry) {
        this.milkName = milkName;
        this.milkCost = milkCost;
        this.milkQuantity = milkQuantity;
        this.milkExpiry = milkExpiry;
    }
    

    @Override
    public String toString() {
        return "Milk [milkName=" + milkName + ", milkCost=" + milkCost + ", milkQuantity=" + milkQuantity
                + ", milkExpiry=" + milkExpiry + "]";
    }


    public Milk() {
    }

    public String getMilkName() {
        return milkName;
    }

    public void setMilkName(String milkName) {
        this.milkName = milkName;
    }

    public int getMilkCost() {
        return milkCost;
    }

    public void setMilkCost(int milkCost) {
        this.milkCost = milkCost;
    }

    public int getMilkQuantity() {
        return milkQuantity;
    }

    public void setMilkQuantity(int milkQuantity) {
        this.milkQuantity = milkQuantity;
    }

    public String getMilkExpiry() {
        return milkExpiry;
    }

    public void setMilkExpiry(String milkExpiry) {
        this.milkExpiry = milkExpiry;
    }

}