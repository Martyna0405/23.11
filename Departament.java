package Test; //Nazwa projektu//

public enum Departament {
    SALES("spprzedaż");
    ADMINITRATION("administracja");
    FINANCE("Finanse");
        private String name;
    Departament(String name) {this.name = name;}
    public String getName(){return name;}
}
