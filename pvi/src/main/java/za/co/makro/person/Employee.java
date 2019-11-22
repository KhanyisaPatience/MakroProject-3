package za.co.makro.person;

import za.co.makro.person.Person;
import za.co.makro.company.Company;
import java.util.Scanner;

public  class Employee extends Person{
private long employeeNumber;
private String position;
protected String username;
protected String password;

public Employee(){}

public Employee(String firstName,String lastName,String address,String emailAddress,long phoneNumber,long employeeNumber,String position,String 
userName,String password){
super(firstName,lastName,address,emailAddress,phoneNumber);
this.employeeNumber = employeeNumber;
this.position = position;
this.username = username;
this.password = password;
}

public void setUsername(String username){

this.username = username;
}
public String getUsername(){
return username;
}
public void setPassword(String password){

this.password = password;
}
public String getPassword(){
return password;
}

public void  setEmployeeNumber(long EmployeeNumber){
this.employeeNumber = employeeNumber;
}

public long getEmployeeNumber(){
return employeeNumber;
}

public void setPosition(String position){
this.position = position;
}

public String getPosition(){
return position;
}

public void registerCustomer(){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Number Of Customer Register");

int number = sc.nextInt();

Customer [] customers = new Customer[number]; 

for(int a = 0; a < customers.length; a++){
Customer customer = new Customer();

System.out.println("Creat New Customer Account Below");



System.out.println("Enter name");
customer.setName(sc.nextLine());

System.out.println("Enter surname");
customer.setSurname(sc.nextLine());

System.out.println("Enter gender");
customer.setGender(sc.nextLine());

System.out.println("Enter dateOfBirth");
customer.setDateOfBirth(sc.nextLine());

System.out.println("Enter phoneNumber");
customer.setPhoneNumber(sc.nextLong());

System.out.println("Enter idNumber");
customer.setIdNumber(sc.nextLong());

System.out.println("Enter address");
customer.setAddress(sc.nextLine());

System.out.println("Enter emailAddress");
customer.setEmailAddress(sc.nextLine());

customers[a] = customer;
}
Company.setCustomers(customers);

}


public void displayCustomer(){

for(int a = 0; a < Company.getCustomers().length;a++){

System.out.println(Company.getCustomers()[a].getName());
System.out.println(Company.getCustomers()[a].getSurname());
System.out.println(Company.getCustomers()[a].getGender());
System.out.println(Company.getCustomers()[a].getDateOfBirth());
System.out.println(Company.getCustomers()[a].getIdNumber());
System.out.println(Company.getCustomers()[a].getAddress());
System.out.println(Company.getCustomers()[a].getEmailAddress());
} 


}
}
