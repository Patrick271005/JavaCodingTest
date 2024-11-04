package ie.atu.javaTest;

public class Product {

    private String productId;
    private String name;
    private double price;
    private int quantity;

    //default constructor
    public Product() {
        this.productId=null;
        this.name=null;
        this.price=null;
         this.quantity =null;

    }

    public Product(String pId, String pname, double cost, int qty) {
        productId = pId;
      name = pname;
       price = cost;
       quantity = qty;
    }




    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +

                '}';
    }



}
