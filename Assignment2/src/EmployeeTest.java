class Q2 {
    private String fname;
    private String lname;
    private double salary;

    public Q2(String fname, String lname, double salary) {
        this.fname = fname;
        this.lname = lname;
        setSalary(salary);
    }

    public void setFName(String fname) {
        this.fname = fname;
    }

    public void setLName(String lname) {
        this.lname = lname;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Invalid salary input.");
            return;
        }
        this.salary = salary;
    }

    public String getFName() {
        return fname;
    }

    public String getLName() {
        return lname;
    }

    
    public double getSalary() {
        return salary;
    }
}



public class EmployeeTest {
    public static void main(String[] args) {
        Q2 emp1 = new Q2("Saurabh", "Chikte", 500000);
        Q2 emp2 = new Q2("Shubham", "Pawar", 85000);

        
        System.out.println("Employee details before update:");
        printEmployee(emp1);
        printEmployee(emp2);

        emp1.setSalary(emp1.getSalary() * 1.10);
        emp2.setSalary(emp2.getSalary() * 1.10);

        System.out.println("\nEmployee details after increment:");
        printEmployee(emp1);
        printEmployee(emp2);
    }

    private static void printEmployee(Q2 employee) {
        System.out.println(
            "Employee: " + employee.getFName() + " "
            + employee.getLName() + " Salary: "
            + employee.getSalary()
        );
    }
}