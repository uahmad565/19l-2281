abstract class Employee{
    int id;
    String name;
    abstract public void calculatePayroll();
}

interface IPayrollCalculator{
    void calculatePayroll();
}

class HourlyEmployee extends Employee implements IPayrollCalculator{

    @Override
    public void calculatePayroll() {
        System.out.println("Hourly Emp Payroll.\n");
    }

}

class SalaryEmployee extends Employee implements IPayrollCalculator{

    @Override
    public void calculatePayroll() {
        System.out.println("Salary Emp Payroll.\n");
    }

}

class CommissionEmployee extends SalaryEmployee{

    @Override
    public void calculatePayroll() {
        System.out.println("Commission Employee Payroll.\n");
    }

}



class Q2
{
    public static void main(String arg[]) {
            
        Employee hourlyEmployee = new HourlyEmployee();
        Employee commissionEmployee = new CommissionEmployee();
        Employee salaryEmployee = new SalaryEmployee();

        hourlyEmployee.calculatePayroll();
        commissionEmployee.calculatePayroll();
        salaryEmployee.calculatePayroll();

    }
}