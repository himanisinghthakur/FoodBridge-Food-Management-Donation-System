public class Food {
    private String name;
    private int quantity;
    private String unit;
    private String type;
    private String expiryDate;
    private String status;
    private String donatedTo;

    public Food(String name, int quantity, String unit, String type, String expiryDate) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.type = type;
        this.expiryDate = expiryDate;
        this.status = "Available";
        this.donatedTo = "Not Donated";
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getType() {
        return type;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getStatus() {
        return status;
    }

    public String getDonatedTo() {
        return donatedTo;
    }

    public void donate(String ngoName) {
        status = "Donated";
        donatedTo = ngoName;
    }
}