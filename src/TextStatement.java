public class TextStatement extends Statement {

    @Override
    protected String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    @Override
    protected String rentalLine(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
    }

    @Override
    protected String footer(Customer aCustomer) {
        return "Amount owed is " + aCustomer.getTotalCharge() + "\n" +
                "You earned " + aCustomer.getTotalFrequentRenterPoints() +
                " frequent renter points";
    }
}
