import java.util.ArrayList;

public class FoodManager {

    private ArrayList<Food> foods = new ArrayList<>();

    public void addFood(Food food) {
        foods.add(food);
        System.out.println("\nFood added successfully!");
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void showAvailableFood() {

        System.out.println("\n");
        System.out.println("              AVAILABLE FOOD");
        System.out.println("              --------------");

        boolean found = false;

        for (int i = 0; i < foods.size(); i++) {

            Food food = foods.get(i);

            if (food.getStatus().equals("Available")) {

                found = true;

                System.out.println("\n[" + (i + 1) + "] " + food.getName());
                System.out.println("    Quantity : " + food.getQuantity()
                        + " " + food.getUnit());
                System.out.println("    Type     : " + food.getType());
                System.out.println("    Expiry   : " + food.getExpiryDate());
                System.out.println("    Status   : Available");
            }
        }

        if (!found) {
            System.out.println("\nNo food is currently available.");
        }
    }

    public void showAllFood() {

        System.out.println("\n");
        System.out.println("              DONATION HISTORY");
        System.out.println("              ----------------");

        if (foods.isEmpty()) {
            System.out.println("\nNo food records found.");
            return;
        }

        for (int i = 0; i < foods.size(); i++) {

            Food food = foods.get(i);

            System.out.println("\n[" + (i + 1) + "] " + food.getName());
            System.out.println("    Quantity : " + food.getQuantity()
                    + " " + food.getUnit());
            System.out.println("    Type     : " + food.getType());
            System.out.println("    Expiry   : " + food.getExpiryDate());
            System.out.println("    Status   : " + food.getStatus());

            if (food.getStatus().equals("Donated")) {
                System.out.println("    Donated To : " + food.getDonatedTo());
            }
        }
    }

    public int getTotalFood() {
        return foods.size();
    }

    public int getAvailableFood() {

        int count = 0;

        for (Food food : foods) {
            if (food.getStatus().equals("Available")) {
                count++;
            }
        }

        return count;
    }

    public int getDonatedFood() {

        int count = 0;

        for (Food food : foods) {
            if (food.getStatus().equals("Donated")) {
                count++;
            }
        }

        return count;
    }
}