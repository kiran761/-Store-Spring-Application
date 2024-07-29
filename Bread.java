
public class Bread {
    String breadType;
    int breadCost;
    int breadQuantity;
    String breadExpiry;

    public Bread(String breadType,int breadCost, int breadQuantity, String breadExpiry) {
        this.breadCost = breadCost;
        this.breadExpiry = breadExpiry;
        this.breadQuantity = breadQuantity;
        this.breadType = breadType;
    }



    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public int getBreadQuantity() {
        return breadQuantity;
    }

    public void setBreadQuantity(int breadQuantity) {
        this.breadQuantity = breadQuantity;
    }

    public int getBreadCost() {
        return breadCost;
    }

    public void setBreadCost(int breadCost) {
        this.breadCost = breadCost;
    }

    public String getBreadExpiry() {
        return breadExpiry;
    }

    public void setBreadExpiry(String breadExpiry) {
        this.breadExpiry = breadExpiry;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bread{");
        sb.append("breadType=").append(breadType);
        sb.append(", breadCost=").append(breadCost);
        sb.append(", breadQuantity=").append(breadQuantity);
        sb.append(", breadExpiry=").append(breadExpiry);
        sb.append('}');
        return sb.toString();
    }
    

}