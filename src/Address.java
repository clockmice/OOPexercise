/**
 * Created by vasil on 8/15/2016.
 */
public class Address {
    String name;
    String addressline1;
    String addressline2;
    int zipcode;
    String city;
    String country;

    public Address(String name, String addressline1, String addressline2, int zipcode, String city, String country) {
        this.name = name;
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.zipcode = zipcode;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", addressline1='" + addressline1 + '\'' +
                ", addressline2='" + addressline2 + '\'' +
                ", zipcode=" + zipcode +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
