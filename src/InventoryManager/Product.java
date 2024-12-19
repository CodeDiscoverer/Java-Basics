package InventoryManager;

public class Product {
    private int productID;
    private String productName;
    private String size;
    private String type;
    private double price;
    private String misc;

    public Product(int productId, String productName, String size, String type, double price, String misc){
        this.productID = productId;
        this.productName = productName;
        this.size = size;
        this.type = type;
        this.price = price;
        this.misc = misc;
    }

    public int getProductID(){
        return productID;
    }

    public void setProductID(int productID){
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMisc() {
        return misc;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }
}
