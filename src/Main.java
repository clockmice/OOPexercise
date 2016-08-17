import com.company.Door;
import com.company.Tire;

public class Main {
    public static void main(String[] args){
// write your code here
        Address homeAdress = new Address("Lisa", "Duettvägen 195", "", 14240, "Skogås", "Sweden");
        Address deliveryAdress = new Address("Lisa", "Duettvägen 195", "", 14240, "Skogås", "Sweden");
        Address invoiceAdress = new Address("Lisa", "Storgatan 12", "våning 3", 10100, "Stockholm", "Sweden");
        Order newOrder = new Order(1, "bil", homeAdress, deliveryAdress, invoiceAdress);

//        System.out.printf("Invoice adress: %s, \n%s, %s, \n%d, %s, \n%s\n",
//                newOrder.Invoice.name,
//                newOrder.Invoice.addressline1, newOrder.Invoice.addressline2,
//                newOrder.Invoice.zipcode, newOrder.Invoice.city,
//                newOrder.Invoice.country);

//        System.out.println(newOrder.Invoice);
//        System.out.println(newOrder);

        Customers customer = new Customers();
        customer.setId(-2);
        customer.setName("");
        customer.setAddress("ababababababababababccccccc");
        customer.setZipcode("66g66");
        customer.setEmail("mail.mail@com");

        System.out.println(customer.getId());
        System.out.println(customer.getName());
        System.out.println(customer.getAddress());
        System.out.println(customer.getZipcode());
        System.out.println(customer.getEmail());

        //Try to create a car with 4 doors (weight 150 each) and 4 tires (Weight 100 each)
        //and the car itself should have a weight of 1000.
        //Then the total weight returned by the car should be 2000.

        Tire[] volvoWheels = {new Tire(100), new Tire(100), new Tire(100), new Tire(100)};
        Door[] volvoDoors = {new Door(150), new Door(150), new Door(150), new Door(150)};

        Car volvo = new Car(1000, volvoWheels, volvoDoors);

        System.out.println(volvo.GetWeight());

    }
}

