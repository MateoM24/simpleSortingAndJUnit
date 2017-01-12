import java.time.LocalDate;
import java.util.Comparator;

/**
 * Created by Mateusz on 2017-01-12.
 */
public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int salary;
    private int age;
    private LocalDate dateOfJoin;

    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.salary - o2.salary;
        }
    };
    public static Comparator<Employee> AgeComparator = (o1, o2) -> {
        return o1.age - o2.age;
    };
    public static Comparator<Employee> DateComparator = (o1, o2) -> {
        return o1.dateOfJoin.compareTo(o2.dateOfJoin);
    };

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", dateOfJoin=" + dateOfJoin;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
        hash = 47 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 47 * hash + this.salary;
        hash = 47 * hash + this.age;
        hash = 47 * hash + (this.dateOfJoin != null ? this.dateOfJoin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.dateOfJoin != other.dateOfJoin && (this.dateOfJoin == null || !this.dateOfJoin.equals(other.dateOfJoin))) {

            return false;
        }
        return true;
    }

    public Employee(int id, String name, int salary, int age, LocalDate dateOfJoin) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.dateOfJoin = dateOfJoin;
    }
}