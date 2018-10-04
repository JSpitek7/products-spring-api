package app;

public class Product {
    private int id;
    private String name;
    private double price;
    private String category;

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public String getCategory() {
        return this.category;
    }
    private void setId(int id) {
        this.id = id;
    }
    private void setName(String name) {
        this.name = name;
    }
    private void setPrice(double price) {
        this.price = price;
    }
    private void setCategory(String category) {
        this.category = category;
    }

    Product() {}

    Product(int id, String name, double price, String category) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setCategory(category);
    }
}