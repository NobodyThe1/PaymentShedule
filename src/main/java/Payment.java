import java.time.LocalDate;

public class Payment {
    LocalDate date;
    double amount;

    Payment(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }
}