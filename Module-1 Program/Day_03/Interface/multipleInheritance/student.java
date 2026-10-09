package multipleInheritance;

public class student implements teacher, HOD {
    @Override
    public void guide() {
        System.out.println("student guide");

    }
    @Override
    public void teach() {
        System.out.println("student teach");
    }
}
