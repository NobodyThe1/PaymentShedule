import java.time.LocalDate;
import java.util.ArrayList;

public class Holiday {

    private Holiday() {
    }
    
    private LocalDate dateAfter2025JanuaryHolidays = LocalDate.of(2025, 1, 9);
    private LocalDate dateAfter2025May1Holidays = LocalDate.of(2025, 5, 5
    );
    private LocalDate dateAfter2025May2Holidays = LocalDate.of(2025, 5, 12);
    private LocalDate dateAfter2025JuneHolidays = LocalDate.of(2025, 6, 16);
    private LocalDate dateAfter2025NovemberHolidays = LocalDate.of(2025, 11, 5);
    private LocalDate dateAfter2025Holidays = LocalDate.of(2026, 1, 9);

    public LocalDate getDateAfter2025JanuaryHolidays() {
        return dateAfter2025JanuaryHolidays;
    }

    public LocalDate getDateAfter2025May1Holidays() {
        return dateAfter2025May1Holidays;
    }

    public LocalDate getDateAfter2025May2Holidays() {
        return dateAfter2025May2Holidays;
    }

    public LocalDate getDateAfter2025JuneHolidays() {
        return dateAfter2025JuneHolidays;
    }

    public LocalDate getDateAfter2025NovemberHolidays() {
        return dateAfter2025NovemberHolidays;
    }

    public LocalDate getDateAfter2025Holidays() {
        return dateAfter2025Holidays;
    }


    public static Holiday createHoliday() {
        return new Holiday();
    }

    public ArrayList<LocalDate> get2025JanuaryHolidays() {
        ArrayList<LocalDate> januaryHolidays = new ArrayList<LocalDate>();
        januaryHolidays.add(LocalDate.of(2025,1,1));
        januaryHolidays.add(LocalDate.of(2025,1,2));
        januaryHolidays.add(LocalDate.of(2025,1,3));
        januaryHolidays.add(LocalDate.of(2025,1,4));
        januaryHolidays.add(LocalDate.of(2025,1,5));
        januaryHolidays.add(LocalDate.of(2025,1,6));
        januaryHolidays.add(LocalDate.of(2025,1,7));
        januaryHolidays.add(LocalDate.of(2025,1,8));
        return januaryHolidays;
    }

    public ArrayList<LocalDate> get2025May1Holidays() {
        ArrayList<LocalDate> may1Holidays = new ArrayList<LocalDate>();
        may1Holidays.add(LocalDate.of(2025, 5, 1));
        may1Holidays.add(LocalDate.of(2025, 5, 2));
        return may1Holidays;
    }

    public ArrayList<LocalDate> get2025May2Holidays() {
        ArrayList<LocalDate> may2Holidays = new ArrayList<LocalDate>();
        may2Holidays.add(LocalDate.of(2025,5,8));
        may2Holidays.add(LocalDate.of(2025,5,9));
        return may2Holidays;
    }

    public ArrayList<LocalDate> get2025JuneHolidays() {
        ArrayList<LocalDate> juneHolidays = new ArrayList<LocalDate>();
        juneHolidays.add(LocalDate.of(2025,6,12));
        juneHolidays.add(LocalDate.of(2025,6,13));
        return juneHolidays;
    }

    public ArrayList<LocalDate> get2025NovemberHolidays() {
        ArrayList<LocalDate> novemberHolidays = new ArrayList<LocalDate>();
        novemberHolidays.add(LocalDate.of(2025, 11, 3));
        novemberHolidays.add(LocalDate.of(2025, 11, 4));
        return novemberHolidays;
    }

    public ArrayList<LocalDate> get2025Holidays() {
        ArrayList<LocalDate> holidays = new ArrayList<LocalDate>();
        holidays.add(LocalDate.of(2025,12,31));
        return holidays;
    }
}