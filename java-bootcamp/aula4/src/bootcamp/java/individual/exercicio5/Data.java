package bootcamp.java.individual.exercicio5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
    private int day;
    private int month;
    private int year;
    private Calendar calendar;

    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.calendar = buildCalendar();
    }

    private Calendar buildCalendar() {
        Calendar calendar = new GregorianCalendar();
        calendar.setLenient(false);
        calendar.set(Calendar.DAY_OF_MONTH, this.day);
        calendar.set(Calendar.MONTH, this.month - 1);
        calendar.set(Calendar.YEAR, this.year);
        return calendar;
    }

    public boolean isValid() {
        try {
            this.calendar.getTime();
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    public void addDay() {
        this.calendar.add(Calendar.DATE, 1);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }
}
