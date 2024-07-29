public class Eggs {
    String eggName;
    int eggCost;
    int eggQuantity;
    String eggExpiry;

    public Eggs() {
    }

    public Eggs(String eggName, int eggCost, int eggQuantity, String eggExpiry) {

        this.eggName = eggName;
        this.eggCost = eggCost;
        this.eggQuantity = eggQuantity;
        this.eggExpiry = eggExpiry;
    }
    

    @Override
    public String toString() {
        return "Eggs [eggName=" + eggName + ", eggCost=" + eggCost + ", eggQuantity=" + eggQuantity + ", eggExpiry="
                + eggExpiry + "]";
    }

    public String getEggName() {
        return eggName;
    }

    public void setEggName(String eggName) {
        this.eggName = eggName;
    }

    public int getEggCost() {
        return eggCost;
    }

    public void setEggCost(int eggCost) {
        this.eggCost = eggCost;
    }

    public int getEggQuantity() {
        return eggQuantity;
    }

    public void setEggQuantity(int eggQuantity) {
        this.eggQuantity = eggQuantity;
    }

    public String getEggExpiry() {
        return eggExpiry;
    }

    public void setEggExpiry(String eggExpiry) {
        this.eggExpiry = eggExpiry;
    }

}