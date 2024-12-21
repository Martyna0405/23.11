public class Company {
  private String name;
  private Address adress;

  private List<Employee>employees;
  
  public Company(String name, Address address){
    this.name = name;
    this.address = address;
    this.employees = new ArrayList<>();
  }
  public String getName() { return name;}
  public void setName(String name) {this.name = name;}
  public Address getAddress(){return address;}
  public void setAddress(Address address) {this.address = address;}

  public List<Emplolyee>getEmployyes(){
    return employees;}
}
