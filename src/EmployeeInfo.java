/*
This class contains all the general attributes and their respective getters and setters
 */
public class EmployeeInfo {
    //attributes

    private int empNumber;
    private String firstName;
    private String lastName;
    private int sex;
    private int workLoc;
    private double deductionsRate;
    int jobType;

    public EmployeeInfo() {

    }

    public EmployeeInfo(int empNum, String fName, String lName, int s, int workLocation, double dRate, int jbType) //constructor to pass assigned values to attributes
    {
        empNumber = empNum;
        firstName = fName;
        lastName = lName;
        sex = s;
        workLoc = workLocation;
        deductionsRate = dRate;
        jobType = jbType;
    }

    public int getEmpNumber() //getter for Employee ID
    {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) //setter for Employee ID
    {
        this.empNumber = empNumber;
    }

    public int getJobType() { //getter for job type
        return jobType;
    }

    public void setJobType(int jbType) { //setter for job type
        jobType = jbType;
    }

    public int getEmpSex() { //getter for Employee gender
        return (sex);
    }

    public void setEmpSex(int s) { //setter for Employee gender
        sex = s;
    }

    public int getWorkLoc() { //getter for Employee's work loaction
        return (workLoc);
    }

    public void setWorLoc(int empLoc) { //setter for Employee's work loaction
        workLoc = empLoc;
    }

    public String getFirstName() //getter for Employee's first name
    {
        return firstName;
    }

    public void setFirstName(String firstName) //setter for Employee's first name
    {
        this.firstName = firstName;
    }

    public String getLastName() //getter for Employee's last name
    {
        return lastName;
    }

    public double getDeductionsRate() { //getter for deductions rate
        return deductionsRate;
    }

    public void setLastName(String lastName) //setter for Employee's last name
    {
        this.lastName = lastName;
    }

    public void setDeductionsRate(double deductionsRate) { //setter for deductions rate
        this.deductionsRate = deductionsRate;
    }

}
