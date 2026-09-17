public class NGO {

    private String name;
    private String location;
    private String contact;
    private String foodAccepted;

    public NGO(String name, String location, String contact, String foodAccepted) {
        this.name = name;
        this.location = location;
        this.contact = contact;
        this.foodAccepted = foodAccepted;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getContact() {
        return contact;
    }

    public String getFoodAccepted() {
        return foodAccepted;
    }
}