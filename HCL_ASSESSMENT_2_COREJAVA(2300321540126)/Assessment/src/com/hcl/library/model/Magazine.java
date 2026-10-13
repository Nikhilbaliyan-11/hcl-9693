package library.model;

public class Magazine extends LibraryItem {

    public Magazine(int id, String title, int year, boolean available) {
        super(id, title, year, available);
    }

    @Override
    double lateFee(int daysLate) {
        return daysLate * 1.0;
    }
}