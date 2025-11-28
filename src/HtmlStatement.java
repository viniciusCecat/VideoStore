public class HtmlStatement extends Statement {

    @Override
    protected String header(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    @Override
    protected String rentalLine(Rental each) {
        return each.getMovie().getTitle() + ": " + each.getCharge() + "<BR>\n";
    }

    @Override
    protected String footer(Customer aCustomer) {
        return "<P>You owe <EM>" + aCustomer.getTotalCharge() + "</EM><P>\n" +
                "On this rental you earned <EM>" +
                aCustomer.getTotalFrequentRenterPoints() +
                "</EM> frequent renter points<P>";
    }
}
