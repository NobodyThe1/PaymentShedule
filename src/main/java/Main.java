import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму кредита: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Введите срок кредита (в месяцах): ");
        int loanTermMonths = scanner.nextInt();

        System.out.print("Введите процентную ставку: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Введите дату выдачи (число от 1 до 31): ");
        int issueDay = scanner.nextInt();

        LocalDate issueDate = LocalDate.now().withDayOfMonth(issueDay);

        System.out.print("Введите тип графика (аннуитетный/дифференцированный): ");
        String paymentType = scanner.next();

        PaymentSchedule schedule = new PaymentSchedule(loanAmount, loanTermMonths, interestRate, issueDate, paymentType);
        List<Payment> payments = schedule.calculatePayments();

        System.out.println("График платежей:");
        for (Payment payment : payments) {
            System.out.printf("Дата: %s, Сумма платежа: %.2f\n", payment.date, payment.amount);
        }

        scanner.close();
    }
}