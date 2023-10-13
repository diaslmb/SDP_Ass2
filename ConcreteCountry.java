public class ConcreteCountry implements Country {
    private String name;

    public ConcreteCountry(String name) {
        this.name = name;
    }

    @Override
    public void displayInfo() {
        System.out.println("Country: " + name);
    }
}