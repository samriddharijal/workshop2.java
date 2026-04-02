package workshop2;



public class qs11{
 private String street;
 private String city;
 private String zipCode;

 
 public String getStreet()  { return street; }
 public String getCity()    { return city; }
 public String getZipCode() { return zipCode; }


 public void setStreet(String street)   { this.street = street; }
 public void setCity(String city)       { this.city = city; }
 public void setZipCode(String zipCode) { this.zipCode = zipCode; }

 public static void main(String[] args) {
     qs11 address = new qs11();
     address.setStreet("Thamel Street");
     address.setCity("Kathmandu");
     address.setZipCode("44600");

     System.out.println("Street: "   + address.getStreet());
     System.out.println("City: "     + address.getCity());
     System.out.println("Zip Code: " + address.getZipCode());
 }
}
