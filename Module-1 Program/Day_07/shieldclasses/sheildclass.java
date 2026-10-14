package shieldclasses;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.Objects;
import java.util.Comparator;

public class sheildclass {

    public static class Shield<T> {
        private T value;
        private int strength;
        private boolean active;

        public Shield(T value, int strength) {
            this.value = Objects.requireNonNull(value, "Shielded value cannot be null");
            this.strength = Math.max(0, strength);
            this.active = this.strength > 0;
        }

        public T get() {
            if (!active) {
                throw new IllegalStateException("Shield is broken! No access to protected resource.");
            }
            return value;
        }

        public void absorbDamage(int damage) {
            if (!active) return;

            strength -= Math.max(0, damage);
            if (strength <= 0) {
                strength = 0;
                active = false;
            }
        }

        public void recharge(int amount) {
            this.strength += Math.max(0, amount);
            this.active = this.strength > 0;
        }

        public int getStrength() {
            return strength;
        }

        public boolean isActive() {
            return active;
        }

        @Override
        public String toString() {
            return "Shield{active=" + active + ", strength=" + strength + ", value=" + value + "}";
        }
    }

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

        List<String> sortedNames = emps.stream()
                .sorted(Comparator.comparing(Employee::salary))
                .map(Employee::name)
                .toList();

        System.out.println("Employees sorted by salary (Low to High):");
        sortedNames.forEach(System.out::println);

        Employee emp = new Employee(1, "Asha", "Engineering", BigDecimal.valueOf(90000),
                LocalDate.parse("2019-03-01"), Set.of("Java", "SQL"));

        Shield<Employee> secureEmployee = new Shield<>(emp, 100);

        System.out.println("Initial State: " + secureEmployee);
        System.out.println("Accessing Employee Name: " + secureEmployee.get().name());

        secureEmployee.absorbDamage(60);
        System.out.println("After taking 60 damage: " + secureEmployee);

        secureEmployee.absorbDamage(50);
        System.out.println("After taking another 50 damage: " + secureEmployee);

        try {
            secureEmployee.get();
        } catch (IllegalStateException ex) {
            System.out.println("Access Blocked: " + ex.getMessage());
        }
    }
}