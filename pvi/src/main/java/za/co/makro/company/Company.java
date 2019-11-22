
package za.co.makro.company;

import java.util.Scanner;
import za.co.makro.person.*;

public  class Company{
private  String name;
private String registrationNumber;
private String branch;
private String address;
private long telephone;
private String emailAddress;

public Company(){}

 private static Employee  employees [];
private static Customer [] customers;

public Company(String name,String registrationNumber,String branch,String address,long telephone,String emailAddress){
this.name = name;
this.registrationNumber = registrationNumber;
this.branch = branch;
this.address = address;
this.telephone = telephone;
this.emailAddress = emailAddress;
}


public static void setEmployees(Employee [] employees){

employees = employees;
}
public static Employee[] getEmployees(){

return employees;
}
public static void setCustomers(Customer [] customers){
customers = customers;
}
public static Customer[] getCustomers(){
return customers;
}
public void setName(String name){
this.name = name;
}

public String getName(){
return name;
}

public void setRegistrationNumber(String registrationNumber){
this.registrationNumber = registrationNumber;
}
public String getRegistrationNumber(){
return registrationNumber;
}

public void setBranch(String branch){
this.branch = branch;
}

public String getBranch(){
return branch;
}

public void setAddress(String address){
this.address = address;
}

public String getAddress(){
return address;
}

public void setTelephone(long telephone){
this.telephone = telephone;
}

public long getTelephone(){
return telephone;
}
 
public void setEmailAddress(String emailAddress){
this.emailAddress = emailAddress;
}
public String getEmailAddress(){
return emailAddress;
}

public void registerEmployee(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number Of Employee Register");
int number = sc.nextInt();
Employee [] employs = new Employee[number]; 
for(int a = 0; a < number; a++){

Employee employee = new Employee();

System.out.println("Register new Employee Below");


sc.nextLine();
System.out.println("Enter name");
employee.setName(sc.nextLine());

System.out.println("Enter surname");
employee.setSurname(sc.nextLine());

System.out.println("Enter gender");
employee.setGender(sc.nextLine());

System.out.println("Enter dateOfBirth");
employee.setDateOfBirth(sc.nextLine());

System.out.println("Enter phoneNumber");
employee.setPhoneNumber(sc.nextLong());

System.out.println("Enter idNumber");
employee.setIdNumber(sc.nextLong());

sc.nextLine();
System.out.println("Enter address");
employee.setAddress(sc.nextLine());

System.out.println("Enter emailAddress");
employee.setEmailAddress(sc.nextLine());

employs[a] = employee;
}
employees = employs;
}


public void displayEmployee(){

for(int a = 0; a < employees.length;a++){

System.out.println(this.employees[a].getName());
System.out.println(this.employees[a].getSurname());
System.out.println(this.employees[a].getGender());
System.out.println(this.employees[a].getDateOfBirth());
System.out.println(this.employees[a].getIdNumber());
System.out.println(this.employees[a].getAddress());
System.out.println(this.employees[a].getEmailAddress());
} 


}



}



