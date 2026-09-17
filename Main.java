import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static FoodManager foodManager = new FoodManager();
    static NGOManager ngoManager = new NGOManager();

    public static void main(String[] args) {

        welcomeScreen();
    }

    // ================= WELCOME SCREEN =================

    public static void welcomeScreen() {

        System.out.println("\n\n");
        System.out.println("              * * *  FOODBRIDGE  * * *");
        System.out.println();
        System.out.println();
        System.out.println("                WELCOME TO FOODBRIDGE");
        System.out.println();
        System.out.println("              [1]  Add Surplus Food");
        System.out.println("              [2]  Explore Food");
        System.out.println("              [3]  Donate Food");
        System.out.println("              [4]  Find an NGO");
        System.out.println("              [5]  See Our Impact");
        System.out.println();
        System.out.println();
        System.out.println("              GIVE SURPLUS A SECOND PURPOSE");
        System.out.println();

        System.out.print("              Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                addFood();
                homeMenu();
                break;

            case 2:
                exploreFood();
                homeMenu();
                break;

            case 3:
                donateFood();
                homeMenu();
                break;

            case 4:
                showNGOs();
                homeMenu();
                break;

            case 5:
                showDashboard();
                homeMenu();
                break;

            default:
                System.out.println("\n              Invalid choice.");
                welcomeScreen();
        }
    }

    // ================= HOME MENU =================

    public static void homeMenu() {

        System.out.println("\n");
        System.out.println("              FOODBRIDGE HOME");
        System.out.println();
        System.out.println("              [1] Add Surplus Food");
        System.out.println("              [2] Explore Food");
        System.out.println("              [3] Search Food");
        System.out.println("              [4] Donate Food");
        System.out.println("              [5] Donation History");
        System.out.println("              [6] NGO Directory");
        System.out.println("              [7] Add NGO");
        System.out.println("              [8] Impact Dashboard");
        System.out.println("              [9] Back to Welcome");
        System.out.println("              [0] Exit");
        System.out.println();

        System.out.print("              Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                addFood();
                homeMenu();
                break;

            case 2:
                exploreFood();
                homeMenu();
                break;

            case 3:
                searchFood();
                homeMenu();
                break;

            case 4:
                donateFood();
                homeMenu();
                break;

            case 5:
                foodManager.showAllFood();
                pause();
                homeMenu();
                break;

            case 6:
                showNGOs();
                homeMenu();
                break;

            case 7:
                addNGO();
                homeMenu();
                break;

            case 8:
                showDashboard();
                homeMenu();
                break;

            case 9:
                welcomeScreen();
                break;

            case 0:
                System.out.println("\n              Thank you for using FoodBridge!");
                System.out.println("              Less Waste | More Meals");
                break;

            default:
                System.out.println("\n              Invalid choice.");
                homeMenu();
        }
    }

    // ================= ADD FOOD =================

    public static void addFood() {

        System.out.println("\n");
        System.out.println("              ADD SURPLUS FOOD");
        System.out.println("              ----------------");

        System.out.print("\n              Food Name: ");
        String name = sc.nextLine();

        System.out.print("              Quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        System.out.print("              Unit: ");
        String unit = sc.nextLine();

        System.out.print("              Food Type: ");
        String type = sc.nextLine();

        System.out.print("              Expiry Date: ");
        String expiryDate = sc.nextLine();

        Food food = new Food(
                name,
                quantity,
                unit,
                type,
                expiryDate
        );

        foodManager.addFood(food);

        pause();
    }

    // ================= EXPLORE FOOD =================

    public static void exploreFood() {

        foodManager.showAvailableFood();

        pause();
    }

    // ================= SEARCH FOOD =================

    public static void searchFood() {

        System.out.println("\n");
        System.out.println("              SEARCH FOOD");
        System.out.println("              -----------");

        System.out.print("\n              Enter food name: ");

        String search = sc.nextLine().toLowerCase();

        boolean found = false;

        for (Food food : foodManager.getFoods()) {

            if (food.getName().toLowerCase().contains(search)) {

                found = true;

                System.out.println("\n              " + food.getName());
                System.out.println("              Quantity : "
                        + food.getQuantity() + " " + food.getUnit());
                System.out.println("              Type     : "
                        + food.getType());
                System.out.println("              Expiry   : "
                        + food.getExpiryDate());
                System.out.println("              Status   : "
                        + food.getStatus());
            }
        }

        if (!found) {
            System.out.println("\n              No matching food found.");
        }

        pause();
    }

    // ================= DONATE FOOD =================

    public static void donateFood() {

        System.out.println("\n");
        System.out.println("              DONATE FOOD");
        System.out.println("              -----------");

        boolean found = false;

        for (int i = 0; i < foodManager.getFoods().size(); i++) {

            Food food = foodManager.getFoods().get(i);

            if (food.getStatus().equals("Available")) {

                found = true;

                System.out.println("\n              [" + (i + 1) + "] "
                        + food.getName());

                System.out.println("                  "
                        + food.getQuantity() + " "
                        + food.getUnit());
            }
        }

        if (!found) {

            System.out.println("\n              No food available for donation.");
            pause();
            return;
        }

        System.out.print("\n              Select food number: ");

        int foodChoice = sc.nextInt();
        sc.nextLine();

        if (foodChoice < 1 ||
                foodChoice > foodManager.getFoods().size()) {

            System.out.println("\n              Invalid food selection.");
            pause();
            return;
        }

        Food selectedFood =
                foodManager.getFoods().get(foodChoice - 1);

        if (!selectedFood.getStatus().equals("Available")) {

            System.out.println("\n              This food is already donated.");
            pause();
            return;
        }

        System.out.println("\n              SELECT NGO");

        ngoManager.showNGOs();

        System.out.print("\n              Select NGO number: ");

        int ngoChoice = sc.nextInt();
        sc.nextLine();

        if (ngoChoice < 1 ||
                ngoChoice > ngoManager.getNGOs().size()) {

            System.out.println("\n              Invalid NGO selection.");
            pause();
            return;
        }

        NGO selectedNGO =
                ngoManager.getNGOs().get(ngoChoice - 1);

        System.out.println("\n");
        System.out.println("              DONATION SUMMARY");
        System.out.println();
        System.out.println("              Food     : "
                + selectedFood.getName());
        System.out.println("              Quantity : "
                + selectedFood.getQuantity()
                + " "
                + selectedFood.getUnit());
        System.out.println("              NGO      : "
                + selectedNGO.getName());

        System.out.print("\n              Confirm? (yes/no): ");

        String confirm = sc.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {

            selectedFood.donate(selectedNGO.getName());

            System.out.println("\n");
            System.out.println("              DONATION SUCCESSFUL!");
            System.out.println();
            System.out.println("              Food has been donated to "
                    + selectedNGO.getName());

        } else {

            System.out.println("\n              Donation cancelled.");
        }

        pause();
    }

    // ================= NGO DIRECTORY =================

    public static void showNGOs() {

        ngoManager.showNGOs();

        pause();
    }

    // ================= ADD NGO =================

    public static void addNGO() {

        System.out.println("\n");
        System.out.println("              ADD NGO");
        System.out.println("              -------");

        System.out.print("\n              NGO Name: ");
        String name = sc.nextLine();

        System.out.print("              Location: ");
        String location = sc.nextLine();

        System.out.print("              Contact: ");
        String contact = sc.nextLine();

        System.out.print("              Food Accepted: ");
        String foodAccepted = sc.nextLine();

        NGO ngo = new NGO(
                name,
                location,
                contact,
                foodAccepted
        );

        ngoManager.addNGO(ngo);

        pause();
    }

    // ================= DASHBOARD =================

    public static void showDashboard() {

        System.out.println("\n");
        System.out.println("              FOODBRIDGE IMPACT");
        System.out.println("              -----------------");
        System.out.println();

        System.out.println("              Food Items Listed : "
                + foodManager.getTotalFood());

        System.out.println("              Food Available    : "
                + foodManager.getAvailableFood());

        System.out.println("              Food Donated      : "
                + foodManager.getDonatedFood());

        System.out.println("              NGO Partners      : "
                + ngoManager.getNGOCount());

        System.out.println();
        System.out.println("              Less Waste");
        System.out.println("              More Meals");
        System.out.println("              Stronger Community");

        pause();
    }

    // ================= PAUSE =================

    public static void pause() {

        System.out.println("\n              Press Enter to continue...");
        sc.nextLine();
    }
}