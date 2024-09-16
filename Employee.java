public class Employee {
    private int employeeID;
    private String firstname;
    private String lastname;


    //applying constructors
    public Employee(int employeeID, String firstname, String lastname){
        this.employeeID = employeeID;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //default constructor
    public Employee(){
        
    }

    //getter and setter for employeeID
    public int getEmployeeID(){
        return employeeID;

    }

    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }

    //getter and setter for firstname
    public String getFirstName(){
        return firstname;
    }
    
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    //getter and setter for lastname
    public String getLastName(){
        return lastname;
    }

    public void setLastName(String lastname){
        this.lastname = lastname;
    }

    // Now is to create method to print employee information
    public void printEmployeeInformation(){
        System.out.println("Employee ID :"+ employeeID);
        System.out.println("Employee Firstname: "+ firstname);
        System.out.println("Employee Lastname: "+ lastname);

    }
    
}
