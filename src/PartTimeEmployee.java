/*
 This class extends the EmployeeInfo class and is for a part-time employee
 */
public class PartTimeEmployee extends EmployeeInfo {

    private double hourlyWage;

    public double getHourlyWage() { //getter for hourly wage
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) { //getter for hourly wage
        this.hourlyWage = hourlyWage;
    }

    public double getHoursPerWeek() { //getter for hours per week
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) { //setter for hours per week
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getWeeksPerYear() { //getter for weeks per year
        return weeksPerYear;
    }

    public void setWeeksPerYear(double weeksPerYear) { //setter for weeks per year
        this.weeksPerYear = weeksPerYear;
    }
    private double hoursPerWeek;
    private double weeksPerYear;

    //constructor to pass assigned values to the attributes
    public PartTimeEmployee(int empNum, String fName, String lName,
            int s, int workLoc,
            double hWage, double hPerWeek,
            double wPerYear, double dedRate) {
        super(empNum, fName, lName, s, workLoc, dedRate, 1);
        hourlyWage = hWage;
        hoursPerWeek = hPerWeek;
        weeksPerYear = wPerYear;
    }

    //method to calculate the salary
    public double calcIncome() {
        double salary = (hourlyWage * hoursPerWeek * weeksPerYear) * (1.0 - getDeductionsRate());
        salary = Math.round(salary * 100);
        salary = salary / 100;
        return salary;

    }
}
