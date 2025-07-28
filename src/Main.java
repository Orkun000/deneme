public class Main {
    public static void main(String[] args) {
        System.out.println("İlk");
        System.out.println("orkun ...");

        Customer customer1 = new Customer("ali", "yılmaz", "123");
        CustomerDTO customerDto1 = new CustomerDTO(customer1.name, customer1.surname);
        System.out.println("Hoş Geldin " + " " +customerDto1.name+" "+ customerDto1.surname);
    }
}