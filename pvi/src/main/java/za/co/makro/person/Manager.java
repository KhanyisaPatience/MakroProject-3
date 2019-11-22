package za.co.makro.person;

import za.co.makro.person.Customer;
import za.co.makro.person.Employee;
import za.co.makro.company.Company;
import za.co.makro.person.Person;
import za.co.makro.inventory.Product;
import za.co.makro.company.Supplier;
import java.util.Scanner;

public class Manager extends Employee{
Scanner sc = new Scanner(System.in);
public Manager(){}
/*public Manager(String firstName,String lastName,String address,String emailAddress,long phoneNumber,long EmployeeNumber,String position,String userName,String password){

}*/



//@Override
public void register(){
System.out.println("Customer Registration");
System.out.print("Firstname: ");
String firstName = sc.nextLine();

System.out.print("Lastname: ");
String lastName = sc.nextLine();

System.out.print("Identity number: ");
long idNumber = sc.nextLong();

System.out.print("Gender: ");
String gender = sc.nextLine();

System.out.print("Age: ");
int age = sc.nextInt();

System.out.print("Date of Birth: ");
String dateOfBirth = sc.nextLine();

System.out.print("Phone number: ");
long phoneNumber = sc.nextLong();

System.out.print("Address ");
String address  = sc.nextLine();

System.out.println("Email address: ");
String emailAddress = sc.nextLine();
}

public void registerSupplier(){

System.out.println("Supplier Registration");

System.out.print("Supplier Number: ");
String supplierNumber = sc.nextLine();

System.out.print("Registration Number: ");
String registrationNumber = sc.nextLine();

System.out.print("Name: ");
String name = sc.nextLine();

System.out.print("Branch: ");
String branch = sc.nextLine();

System.out.print("Address: ");
String address =sc.nextLine();

System.out.print("Telephone: ");
long telephone = sc.nextLong();

System.out.print("Email Address: ");
String emailAddress = sc.nextLine();
}

public void ReceiveGoods(){
System.out.println("Goods received");
System.out.println("Rice,Sugar,Tea,Salt,Juice");

}

//@Override
public void login(Supplier supplier){

System.out.println("Employee Login Details");
System.out.print("Username: ");
String username = sc.nextLine();

System.out.println("Password: ");
String password = sc.nextLine();

for(int a = 0;  a < Company.getEmployees().length;a++){

if(Company.getEmployees()[a].getUsername().equals(username) &&  Company.getEmployees()[a].getPassword().equals(password)

 && Company.getEmployees()[a].getPosition().equalsIgnoreCase("MANAGER")){
System.out.println("Login successful");


supplier.supply();
supplier.displayProduct();

}

}
}
}
