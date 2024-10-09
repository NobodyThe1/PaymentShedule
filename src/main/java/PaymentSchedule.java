import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaymentSchedule {
    private double loanAmount;
    private int loanTerm;
    private double annualInterestRate;
    private LocalDate issueDate;
    private String paymentType;

    public PaymentSchedule(double loanAmount, int loanTerm, double annualInterestRate, LocalDate issueDate, String paymentType) {
        this.loanAmount = loanAmount;
        this.loanTerm = loanTerm;
        this.annualInterestRate = annualInterestRate;
        this.issueDate = issueDate;
        this.paymentType = paymentType;
    }

    public List<Payment> calculatePayments() {
        List<Payment> payments = new ArrayList<>();
        double monthInterestRate = annualInterestRate / 100 / 12; // месячная процентная ставка

        if ("аннуитетный".equalsIgnoreCase(paymentType)) {
            double monthlyPayment = (loanAmount * monthInterestRate) / (1 - Math.pow(1 + monthInterestRate, -loanTerm));

            LocalDate paymentDate = issueDate.withDayOfMonth(1);
            for (int i = 0; i < loanTerm; i++) {
                paymentDate = issueDate.plusMonths(i);
                paymentDate = adjustPaymentDate(paymentDate);

                payments.add(new Payment(paymentDate, monthlyPayment));
            }
        } else if ("дифференцированный".equalsIgnoreCase(paymentType)) {
            for (int i = 1; i <= loanTerm; i++) {
                double principalPayment = loanAmount / loanTerm;
                double interestPayment = (loanAmount - (principalPayment * (i - 1))) * monthInterestRate;
                double monthlyPayment = principalPayment + interestPayment;

                LocalDate paymentDate = issueDate.plusMonths(i);
                paymentDate = adjustPaymentDate(paymentDate);

                payments.add(new Payment(paymentDate, monthlyPayment));
            }
        } else {
            System.out.println("Неверный тип графика!");
        }

        return payments;
    }

    private LocalDate adjustPaymentDate(LocalDate date) {

        if (date.getDayOfWeek().getValue() == 6) { // суббота
            date = date.plusDays(2);
        } else if (date.getDayOfWeek().getValue() == 7) { // воскресенье
            date = date.plusDays(1);

        }

        for (LocalDate date1 : Holiday.createHoliday().getJanuaryHolidays()) {
            if (date1.equals(date)) {
                date = LocalDate.of(2025, 1, 9);
            }
        }

        for (LocalDate date1 : Holiday.createHoliday().getMay1Holidays()) {
            if (date1.equals(date)) {
                date = LocalDate.of(2025, 5, 5);
            }
        }

        for (LocalDate date1 : Holiday.createHoliday().getMay2Holidays()) {
            if (date1.equals(date)) {
                date = LocalDate.of(2025, 5, 12);
            }
        }

        for (LocalDate date1 : Holiday.createHoliday().getJuneHolidays()) {
            if (date1.equals(date)) {
                date = LocalDate.of(2025, 6, 16);
            }
        }

        for (LocalDate date1 : Holiday.createHoliday().getNovemberHolidays()) {
            if (date1.equals(date)) {
                date = LocalDate.of(2025, 11, 5);
            }
        }

        for (LocalDate date1 : Holiday.createHoliday().getHolidays()) {
            if (date1.equals(date)) {
                date = LocalDate.of(2026, 1, 9);
            }
        }

        return date;
    }


}