public class Address {
    class Address{
        private String city;
        System.out.println(address.setCity());
        address.setCity("Artur");
        System.out.println(address.setCity());

        System.out.println(address.getStreet());
        address.setStreet("Przykład");
        System.out.println(address.setStreet());

        Address address = new Address("Łódź","Kocielna");
        private String street;

         public Address(String city, String street){
            this.city=city;
            this.street=street;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }
    }

}
