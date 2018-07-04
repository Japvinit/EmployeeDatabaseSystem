/*
 This class extends the EmployeeInfo class and is for a full-time employee
 */

public class FullTimeEmployee extends EmployeeInfo {

    private double annualSalary; //attribute for salary

    public double getAnnualSalary() { //getter for salary
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) { //setter for salary
        this.annualSalary = annualSalary;
    }

    //constructor to pass assigned values to the attributes
    public FullTimeEmployee(int empNum, String fName, String lName,
            int s, int workLoc,
            double annSal, double dedRate) {
        super(empNum, fName, lName, s, workLoc, dedRate, 0);
        annualSalary = annSal;
    }
    //method to caluclate full-time employee's salary

    public double calcIncome() {
        double salary = (annualSalary) * (1.0 - getDeductionsRate());
        salary = Math.round(salary * 100);
        salary = salary / 100;
        return salary;
    }

}
