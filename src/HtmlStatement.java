import java.util.Enumeration;

public class HtmlStatement extends Statement {

    @Override
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        StringBuilder result = new StringBuilder();

        result.append("<H1>Rentals for <EM>")
                .append(aCustomer.getName())
                .append("</EM></H1><P>\n");

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for each rental
            result.append(each.getMovie().getTitle())
                    .append(": ")
                    .append(each.getCharge())
                    .append("<BR>\n");
        }

        // add footer lines
        result.append("<P>You owe <EM>")
                .append(aCustomer.getTotalCharge())
                .append("</EM><P>\n");

        result.append("On this rental you earned <EM>")
                .append(aCustomer.getTotalFrequentRenterPoints())
                .append("</EM> frequent renter points<P>");

        return result.toString();
    }
}
