public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Create a base country
        Country country = new ConcreteCountry("Kazakhstan");

        // Add a capital to the country
        Country countryWithCapital = new CountryWithCapitalDecorator(country, "Astana");

        // Display information
        System.out.println("Country Info:");
        country.displayInfo();

        System.out.println("\nCountry Info with Capital:");
        countryWithCapital.displayInfo();
    }
}