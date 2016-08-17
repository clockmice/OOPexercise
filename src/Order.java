public class Order
{
    public int id;
    public String product;
    public Address Home;
    public Address Delivery;
    public Address Invoice;

    public Order(int id, String product, Address home, Address delivery, Address invoice) {
        this.id = id;
        this.product = product;
        Home = home;
        Delivery = delivery;
        Invoice = invoice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", Home=" + Home +
                ", Delivery=" + Delivery +
                ", Invoice=" + Invoice +
                '}';
    }
}