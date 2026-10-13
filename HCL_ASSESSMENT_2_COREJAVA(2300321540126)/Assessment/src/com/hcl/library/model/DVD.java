package library.model;

public class DVD extends LibraryItem {

    public DVD(int id, String title, int year, boolean available) {
        super(id, title, year, available);
    }

    @Override
    double lateFee(int daysLate) {
        return daysLate * 5.0;
    }
}