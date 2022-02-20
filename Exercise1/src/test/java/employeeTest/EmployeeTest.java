package employeeTest;

import com.company.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void computeBaseSalary() {
        Employee employee=new Employee();
        employee.getInfo("John Smith",10,5);
        double baseSal=employee.computeBaseSalary();
        assertEquals(1000,baseSal,0);
    }

    @Test
    public void addSal() {
        Employee employee=new Employee();
        employee.getInfo("John Smith",10,5);
        employee.computeBaseSalary();
        double add=employee.addSal();
        assertEquals(1000,add,0);

    }

    @Test
    public void addWork() {
        Employee employee=new Employee();
        employee.getInfo("John Smith",10,5);
        employee.computeBaseSalary();
        double work=employee.addWork();
        assertEquals(1000,work,0);
    }
}