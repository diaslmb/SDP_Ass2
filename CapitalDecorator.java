public abstract class CapitalDecorator implements Country {
    protected Country decoratedCountry;

    public CapitalDecorator(Country decoratedCountry) {
        this.decoratedCountry = decoratedCountry;
    }

    @Override
    public void displayInfo() {
        decoratedCountry.displayInfo();
    }
}