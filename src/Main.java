public class Main {
    public static void main(String[] args) {
        // Criando alguns filmes usando constantes inteiras
        Movie movie1 = new Movie("O Senhor dos Anéis", Movie.REGULAR);
        Movie movie2 = new Movie("Divertidamente 2", Movie.CHILDRENS);
        Movie movie3 = new Movie("Deadpool 3", Movie.NEW_RELEASE);

        // Criando um cliente
        Customer customer = new Customer("Vinicius");

        // Criando alguns alugueis
        Rental rental1 = new Rental(movie1, 3); // 3 dias
        Rental rental2 = new Rental(movie2, 4); // 4 dias
        Rental rental3 = new Rental(movie3, 2); // 2 dias

        // Adicionando ao cliente
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        // Exibindo o resultado
        System.out.println(customer.statement());
    }
}
