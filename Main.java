import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Object> store = new HashMap<>();

        List<Eggs> eggs = new ArrayList<>();
        eggs.add(new Eggs("Hyderabad Egg", 6, 52, "30-09-2024"));
        eggs.add(new Eggs("Mumbai Egg", 5, 48, "30-09-2024"));
        eggs.add(new Eggs("Chennai Egg", 4, 50, "30-09-2024"));
        eggs.add(new Eggs("Kolkata Egg", 5, 49, "30-09-2024"));
        eggs.add(new Eggs("Delhi Egg", 6, 51, "30-09-2024"));
        eggs.add(new Eggs("Bangalore Egg", 4, 47, "30-09-2024"));
        eggs.add(new Eggs("Pune Egg", 5, 48, "30-09-2024"));
        eggs.add(new Eggs("Jaipur Egg", 6, 50, "30-09-2024"));
        eggs.add(new Eggs("Ahmedabad Egg", 4, 49, "30-09-2024"));
        eggs.add(new Eggs("Lucknow Egg", 5, 47, "30-09-2024"));
        store.put(1, eggs);

        HashSet<Milk> milk = new HashSet<>();
        milk.add(new Milk("Cow Milk", 40, 70, "28-07-2024"));
        milk.add(new Milk("Buffalo Milk", 45, 75, "28-07-2024"));
        milk.add(new Milk("Goat Milk", 38, 65, "28-07-2024"));
        milk.add(new Milk("Organic Cow Milk", 42, 72, "28-07-2024"));
        milk.add(new Milk("Skimmed Milk", 35, 60, "28-07-2024"));
        milk.add(new Milk("Whole Milk", 40, 70, "28-07-2024"));
        milk.add(new Milk("Low-Fat Milk", 37, 62, "28-07-2024"));
        milk.add(new Milk("Almond Milk", 30, 55, "28-07-2024"));
        milk.add(new Milk("Soy Milk", 32, 58, "28-07-2024"));
        milk.add(new Milk("Coconut Milk", 28, 50, "28-07-2024"));
        store.put(2, milk);

        TreeSet<Apple> apples = new TreeSet<>();
        apples.add(new Apple("Kashmir Apple", 35, 27, "27-07-2024", "Red"));
        apples.add(new Apple("Himachali Apple", 30, 25, "27-07-2024", "Green"));
        apples.add(new Apple("Uttarakhand Apple", 32, 26, "27-07-2024", "Yellow"));
        apples.add(new Apple("Arunachal Apple", 28, 22, "27-07-2024", "Pink"));
        apples.add(new Apple("Uttar Pradesh Apple", 33, 28, "27-07-2024", "Orange"));
        apples.add(new Apple("Nagaland Apple", 29, 24, "27-07-2024", "Purple"));
        apples.add(new Apple("Sikkimese Apple", 31, 25, "27-07-2024", "Golden"));
        apples.add(new Apple("Mizoram Apple", 30, 26, "27-07-2024", "Crimson"));
        apples.add(new Apple("Meghalaya Apple", 32, 27, "27-07-2024", "Amber"));
        apples.add(new Apple("Tamil Nadu Apple", 34, 28, "27-07-2024", "Ruby"));
        store.put(4, apples);

        List<Chocolates> chocolates = new LinkedList<>();
        chocolates.add(new Chocolates("Nestle Chocolate", 30, 25, "28-12-2024"));
        chocolates.add(new Chocolates("Cadbury Dairy Milk", 40, 30, "28-12-2024"));
        chocolates.add(new Chocolates("Ferrero Rocher", 50, 50, "28-12-2024"));
        chocolates.add(new Chocolates("KitKat", 35, 25, "28-12-2024"));
        chocolates.add(new Chocolates("Snickers", 45, 35, "28-12-2024"));
        chocolates.add(new Chocolates("Milka", 38, 28, "28-12-2024"));
        chocolates.add(new Chocolates("Lindt", 55, 45, "28-12-2024"));
        chocolates.add(new Chocolates("Toblerone", 48, 40, "28-12-2024"));
        chocolates.add(new Chocolates("Hershey's", 42, 32, "28-12-2024"));
        chocolates.add(new Chocolates("Godiva", 60, 55, "28-12-2024"));
        store.put(3, chocolates);

        Queue<Bread> bread = new ArrayDeque<>();
        bread.offer(new Bread("Brown Bread", 50, 10, "20-07-2024"));
        bread.offer(new Bread("Whole Wheat Bread", 55, 12, "20-07-2024"));
        bread.offer(new Bread("Multigrain Bread", 60, 15, "20-07-2024"));
        bread.offer(new Bread("Oatmeal Bread", 50, 11, "20-07-2024"));
        bread.offer(new Bread("Rye Bread", 52, 13, "20-07-2024"));
        bread.offer(new Bread("Sourdough Bread", 58, 14, "20-07-2024"));
        bread.offer(new Bread("Gluten-Free Bread", 45, 10, "20-07-2024"));
        bread.offer(new Bread("Ciabatta Bread", 54, 13, "20-07-2024"));
        bread.offer(new Bread("Baguette Bread", 56, 14, "20-07-2024"));
        bread.offer(new Bread("Pita Bread", 48, 12, "20-07-2024"));
        store.put(5,bread);

        System.out.println(store);

    }

}
