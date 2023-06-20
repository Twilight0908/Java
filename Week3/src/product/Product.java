package product;

public class Product {
    private int idProduct;
    private String nameProduct;
    private int quantity;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, int quantity) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.quantity = quantity;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Ma San Pham: " + idProduct +
                " Ten San Pham: " + nameProduct +
                " So Luong: " + quantity;
    }
}
