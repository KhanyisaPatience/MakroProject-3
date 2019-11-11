package za.co.Makro;
import za.co.Makro.Person;
import za.co.Makro.Employee;
import za.co.Makro.Manager;
import java.util.Scanner;

public class Manager extends Employee{

Scanner sc = new Scanner(System.in);

@Override
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

System.out.print("Date of Bitth: ");
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

}

@Override
public void login(){

System.out.println("Employee Login Details");
System.out.print("Username: ");
String username = sc.nextLine();

System.out.println("Password: ");
String password = sc.nextLine();
}

}
