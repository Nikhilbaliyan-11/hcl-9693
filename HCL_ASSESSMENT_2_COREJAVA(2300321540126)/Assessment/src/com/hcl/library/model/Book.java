package library.model;

public class Book extends LibraryItem {

    public Book(int id, String title, int year, boolean available) {
        super(id, title, year, available);
    }

    @Override
    double lateFee(int daysLate) {
        return daysLate * 2.0;
    }
}