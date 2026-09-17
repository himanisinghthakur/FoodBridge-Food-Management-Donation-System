import java.util.ArrayList;

public class NGOManager {

    private ArrayList<NGO> ngos = new ArrayList<>();

    public NGOManager() {

        ngos.add(new NGO(
                "Robin Hood Army",
                "Bhopal",
                "Contact to be verified",
                "Cooked Food, Packaged Food"
        ));

        ngos.add(new NGO(
                "Feeding India",
                "Bhopal",
                "Contact to be verified",
                "Cooked Food, Packaged Food"
        ));

        ngos.add(new NGO(
                "Akshaya Patra Foundation",
                "Bhopal",
                "Contact to be verified",
                "Cooked Food"
        ));

        ngos.add(new NGO(
                "Annamrita Foundation",
                "Bhopal",
                "Contact to be verified",
                "Cooked Food"
        ));
    }

    public void addNGO(NGO ngo) {
        ngos.add(ngo);
        System.out.println("\nNGO added successfully!");
    }

    public void showNGOs() {

        System.out.println("\n");
        System.out.println("              NGO DIRECTORY");
        System.out.println("              ------------");

        for (int i = 0; i < ngos.size(); i++) {

            NGO ngo = ngos.get(i);

            System.out.println("\n[" + (i + 1) + "] " + ngo.getName());
            System.out.println("    Location : " + ngo.getLocation());
            System.out.println("    Contact  : " + ngo.getContact());
            System.out.println("    Accepts  : " + ngo.getFoodAccepted());
        }
    }

    public ArrayList<NGO> getNGOs() {
        return ngos;
    }

    public int getNGOCount() {
        return ngos.size();
    }
}