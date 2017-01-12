import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mateusz on 2017-01-12.
 */
public class EmployeeTest {
    @Test
    public void testEmployeeSorting(){
        Employee e2=new Employee(2,"Stefan",9000,40,LocalDate.of(2009,12,24));
        Employee e3=new Employee(3,"Endru",4500, 27,LocalDate.of(2015,05,05));
        Employee e1=new Employee(1,"Heniek",1000,18,LocalDate.now());
        Employee e4=new Employee(5,"Zenon",2000,30,LocalDate.of(1999,01,15));
        Employee e5=new Employee(4,"Horacy",500,21,LocalDate.of(2001,07,04));
        List<Employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        System.out.println("Print of unordered list:");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
        System.out.println("Sortowanie Naturalne:");
        Collections.sort(list);//natural order sort that is compareTo method of comparable interface
        assertEquals(e1,list.get(0));
        assertEquals(e4,list.get(4));
        System.out.println(list.get(0).toString());
        System.out.println(list.get(4).toString());
        System.out.println("Sortowanie Imię:");
        Collections.sort(list,Employee.NameComparator);
        assertEquals(e3,list.get(0));
        assertEquals(e4,list.get(4));
        System.out.println(list.get(0).toString());
        System.out.println(list.get(4).toString());
        System.out.println("Sortowanie Wiek:");
        Collections.sort(list,Employee.AgeComparator);
        assertEquals(e1,list.get(0));
        assertEquals(e2,list.get(4));
        System.out.println(list.get(0).toString());
        System.out.println(list.get(4).toString());
        System.out.println("Sortowanie Data:");
        Collections.sort(list,Employee.DateComparator);
        assertEquals(e4,list.get(0));
        assertEquals(e1,list.get(4));
        System.out.println(list.get(0).toString());
        System.out.println(list.get(4).toString());
        System.out.println("Sortowanie Zarobki:");
        Collections.sort(list,Employee.SalaryComparator);
        assertEquals(e5,list.get(0));
        assertEquals(e2,list.get(4));
        System.out.println(list.get(0).toString());
        System.out.println(list.get(4).toString());

    }
}
