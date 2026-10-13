package library.model;

abstract class LibraryItem implements Comparable<LibraryItem> {
    private int id;
    private String title;
    private int year;
    private boolean available;

    public LibraryItem(int id, String title, int year, boolean available) {
        if(title.isBlank() || !(year >1900 && year <2026)) {
            throw new IllegalArgumentException("Invalid year");
        }
        this.id = id;
        this.title = title;
        this.year = year;
        this.available = available;
    }
    abstract double lateFee(int daysLate);

    @Override
    public int compareTo(LibraryItem o) {
        return this.title.compareTo(o.title);
    }

    public boolean isAvailable() {
        return available;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
