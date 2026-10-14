package Streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.Comparator;

public class Record_employeeAnalytics {
// record is immutable
    record Employee(int id, String name, String dept, BigDecimal salary,
                    LocalDate hireDate, Set<String> skills) {
    }

    static Employee e(int id, String n, String d, int sal, String date, String... skills) {
        return new Employee(id, n, d, BigDecimal.valueOf(sal),
                LocalDate.parse(date), Set.of(skills));
    }

    public static void main(String[] args) {
        List<Employee> emps = List.of(
                e(1, "Asha", "Engineering", 90000, "2019-03-01", "Java", "SQL"),
                e(2, "Rahul", "Engineering", 85000, "2020-07-15", "Python", "AWS"),
                e(3, "Priya", "HR", 65000, "2018-11-20", "Communication", "Recruitment"),
                e(4, "Amit", "Finance", 78000, "2021-01-10", "Excel", "SQL"),
                e(5, "Neha", "Engineering", 110000, "2017-06-12", "Java", "Spring", "Kubernetes"),
                e(6, "Vikram", "Marketing", 60000, "2022-04-05", "SEO", "Analytics"),
                e(7, "Ananya", "Engineering", 95000, "2019-09-18", "React", "JavaScript")
        );

        // Solution for Q1-> Employee names sorted by salary
        List<String> sortedNames = emps.stream().filter(s-> s.dept.contains("Engineering"))
                .sorted(Comparator.comparing(Employee::salary))
                .map(Employee::name)
                .toList();
        System.out.println("Employees sorted by salary (Low to High):");
        sortedNames.forEach(System.out::println);
        System.out.println();

        // Solution for Q2
       List<String> topThreeEarners = emps.stream().sorted(Comparator.comparing(Employee::name))
               .limit(3).map(Employee::name)
               .toList();
        System.out.println("top three earners::");
        topThreeEarners.forEach(System.out::println);
        System.out.println();

       // solution for Q3


    }
}