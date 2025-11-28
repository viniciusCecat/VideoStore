import java.util.Enumeration;

public abstract class Statement {

    public String value(Customer aCustomer) {
        StringBuilder result = new StringBuilder();

        result.append(header(aCustomer));

        Enumeration<Rental> rentals = aCustomer.getRentals();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result.append(rentalLine(each));
        }

        result.append(footer(aCustomer));

        return result.toString();
    }

    protected abstract String header(Customer aCustomer);
    protected abstract String rentalLine(Rental each);
    protected abstract String footer(Customer aCustomer);
}
