package POO.Product;

public class Product {
    private String name;
    private double price;

    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public double TotalValueInStock() {
        double valueInStock = this.getQuantity() * this.getPrice();
        return valueInStock;
    }

    public void addProducts(int quantity) {
        this.setQuantity(this.getQuantity() + quantity);
    }

    public void removeProducts(int i) {
        this.setQuantity(this.getQuantity() - i);
    }

    public void fichaTecnica() {
        System.out.println("Nome =" + this.getName());
        System.out.println("Preco = " + this.getPrice());
        System.out.println("Quantidade = " + this.getQuantity());
        System.out.println("Valor Total em Estoque " +this.TotalValueInStock());
    }
}
