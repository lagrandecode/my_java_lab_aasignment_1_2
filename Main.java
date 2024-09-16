import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        //to get the input, I wll need to create scanner object 
        Scanner scanner = new Scanner(System.in);

        //We also need to import the employee in order to create employee object 
        Employee employee = new Employee();

        //read employeeID 
        System.out.println("Enter ID:");
        int employee_ID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Firstname:");
        String first_name = scanner.nextLine();

        System.out.println("Enter Lastname:");
        String last_name = scanner.nextLine();


        employee.setEmployeeID(employee_ID);
        employee.setFirstname(first_name);
        employee.setLastName(last_name);

        //Now lets print the whole information

        System.out.println("Information of the Employee \n");
        employee.printEmployeeInformation();


        //we need to close the scanner
        scanner.close();
        
    }
}