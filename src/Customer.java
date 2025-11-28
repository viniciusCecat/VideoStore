import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String _name;
    private List<Rental> _rentals = new ArrayList<>();

    public Customer(String name) {
        this._name = name;
    }

    public void addRental(Rental rental) {
        _rentals.add(rental);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        for (Rental each : _rentals) {
            result.append("\t")
                    .append(each.getMovie().getTitle())
                    .append("\t")
                    .append(each.getCharge())
                    .append("\n");
        }

        result.append("Amount owed is ").append(getTotalCharge()).append("\n");
        result.append("You earned ").append(getTotalFrequentRenterPoints()).append(" frequent renter points");

        return result.toString();
    }

    private double getTotalCharge() {
        double result = 0;

        for (Rental each : _rentals) {
            result += each.getCharge();
        }

        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;

        for (Rental each : _rentals) {
            result += each.getFrequentRenterPoints();
        }

        return result;
    }
}
