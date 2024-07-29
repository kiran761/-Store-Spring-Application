public class Apple implements Comparable<Apple> {
    String appleName;
    int appleCost;
    int appleQuantity;
    String appleExpiry;
    String appleColor;

    public Apple(String appleColor, int appleCost, int appleQuantity, String appleExpiry, String appleName) {
        this.appleColor = appleColor;
        this.appleCost = appleCost;
        this.appleExpiry = appleExpiry;
        this.appleName = appleName;
        this.appleQuantity = appleQuantity;
    }

    public Apple() {
    }

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public int getAppleCost() {
        return appleCost;
    }

    public void setAppleCost(int appleCost) {
        this.appleCost = appleCost;
    }

    public int getAppleQuantity() {
        return appleQuantity;
    }

    public void setAppleQuantity(int appleQuantity) {
        this.appleQuantity = appleQuantity;
    }

    public String getAppleExpiry() {
        return appleExpiry;
    }

    public void setAppleExpiry(String appleExpiry) {
        this.appleExpiry = appleExpiry;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    @Override
    public String toString() {
        return "Apple [appleName=" + appleName + ", appleCost=" + appleCost + ", appleQuantity=" + appleQuantity
                + ", appleExpiry=" + appleExpiry + ", appleColor=" + appleColor + "]";
    }

    public int compareTo(Apple a)
    {
        return this.appleColor.compareTo(a.appleColor);
    }


}