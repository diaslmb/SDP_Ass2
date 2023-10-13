public class CountryWithCapitalDecorator extends CapitalDecorator {
    private String capital;

    public CountryWithCapitalDecorator(Country decoratedCountry, String capital) {
        super(decoratedCountry);
        this.capital = capital;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capital: " + capital);
    }
}
