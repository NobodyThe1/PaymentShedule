import java.time.LocalDate;
import java.util.ArrayList;

public class Holiday {

    private Holiday() {
    }

    public static Holiday createHoliday() {
        return new Holiday();
    }

    public ArrayList<LocalDate> getJanuaryHolidays() {
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

    public ArrayList<LocalDate> getMay1Holidays() {
        ArrayList<LocalDate> may1Holidays = new ArrayList<LocalDate>();
        may1Holidays.add(LocalDate.of(2025, 5, 1));
        may1Holidays.add(LocalDate.of(2025, 5, 2));
        return may1Holidays;
    }

    public ArrayList<LocalDate> getMay2Holidays() {
        ArrayList<LocalDate> may2Holidays = new ArrayList<LocalDate>();
        may2Holidays.add(LocalDate.of(2025,5,8));
        may2Holidays.add(LocalDate.of(2025,5,9));
        return may2Holidays;
    }

    public ArrayList<LocalDate> getJuneHolidays() {
        ArrayList<LocalDate> juneHolidays = new ArrayList<LocalDate>();
        juneHolidays.add(LocalDate.of(2025,6,12));
        juneHolidays.add(LocalDate.of(2025,6,13));
        return juneHolidays;
    }

    public ArrayList<LocalDate> getNovemberHolidays() {
        ArrayList<LocalDate> novemberHolidays = new ArrayList<LocalDate>();
        novemberHolidays.add(LocalDate.of(2025, 11, 3));
        novemberHolidays.add(LocalDate.of(2025, 11, 4));
        return novemberHolidays;
    }

    public ArrayList<LocalDate> getHolidays() {
        ArrayList<LocalDate> holidays = new ArrayList<LocalDate>();
        holidays.add(LocalDate.of(2025,12,31));
        return holidays;
    }
}