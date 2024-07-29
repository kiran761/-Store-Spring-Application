public class Chocolates {
    String chocolateName;
    int chocolateCost;
    int chocolateQuantity;
    String chocolateExpiry;

    public Chocolates(String chocolateName,int chocolateCost,  int chocolateQuantity, String chocolateExpiry) {
        this.chocolateCost = chocolateCost;
        this.chocolateExpiry = chocolateExpiry;
        this.chocolateName = chocolateName;
        this.chocolateQuantity = chocolateQuantity;
    }

    
    public String getChocolateName() {
        return chocolateName;
    }

    public void setChocolateName(String chocolateName) {
        this.chocolateName = chocolateName;
    }

    public int getChocolateCost() {
        return chocolateCost;
    }

    public void setChocolateCost(int chocolateCost) {
        this.chocolateCost = chocolateCost;
    }

    public int getChocolateQuantity() {
        return chocolateQuantity;
    }

    public void setChocolateQuantity(int chocolateQuantity) {
        this.chocolateQuantity = chocolateQuantity;
    }

    public String getChocolateExpiry() {
        return chocolateExpiry;
    }

    public void setChocolateExpiry(String chocolateExpiry) {
        this.chocolateExpiry = chocolateExpiry;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Chocolates{");
        sb.append("chocolateName=").append(chocolateName);
        sb.append(", chocolateCost=").append(chocolateCost);
        sb.append(", chocolateQuantity=").append(chocolateQuantity);
        sb.append(", chocolateExpiry=").append(chocolateExpiry);
        sb.append('}');
        return sb.toString();
    }

}