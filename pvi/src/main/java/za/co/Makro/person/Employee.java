package za.co.Makro;
import za.co.Makro.person.Person;
import za.co.Makro.person.Employee;

public class Employee extends Person{
private long employeeNumber;
private String position;
private String username;
private String password;


public Employee(String firstName,String lastName,String address,String emailAddress,long phoneNumber,long employeeNumber,String position,String 
username,String password){
super(firstName,lastName,address,emailAddress,phoneNumber);
this.employeeNumber = employeeNumber;
this.position = position;
this.username = username;
this.password = password;
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

public void setUsername(String username){
this.username = username;
}

public String getUsername(){
return username;
}

public void  setPassword(String password){
this.password = password;
}

public String getPassword(){
return password;

}

}

