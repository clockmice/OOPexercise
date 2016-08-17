public class Customers {
    private int id;
    private String name;
    private String address;
    private String zipcode;
    private String city;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<0){
            id = 0;
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0){
            name = "Unknown";
        }
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() > 20){
            address = address.substring(0, 20);
        }
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        if (zipcode.length()>5){
            zipcode = "00000";
        }
        for (int i=0; i<zipcode.length(); i++){
            if (!Character.isDigit(zipcode.charAt(i))){
                zipcode = "00000";
                break;
            }
        }
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.length()<6 || !email.contains("@") || !email.contains(".") ||
                email.indexOf('@')>email.lastIndexOf('.')) {
            email = "";
        }
        this.email = email;
    }


}
