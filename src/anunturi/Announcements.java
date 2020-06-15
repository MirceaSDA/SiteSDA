package anunturi;

public abstract class Announcements {
    private String name;
    private String description;
    private int price;

    public Announcements(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getDetails() {
        return name + " " + price + " " + description;
    }
}
