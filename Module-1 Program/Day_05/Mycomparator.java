
import java.util.Comparator;

public class Mycomparator implements Comparator<student> {
    public int compare(student s1, student s2) {
        return Integer.compare(s1.rno, s2.rno);

    }
}
