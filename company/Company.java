package makroProject.Company;
import java.util.Scanner;

public class Company{

private  String name;
private  String registrationNumber;
private String branch;
private String address;
private long telephone;
private String emailAddress;


Scanner sc = new Scanner(System.in);
/*System.out.println("Makro");
System.out.println("1991/006805/07");
Sysytem.out.println("Makro Silver Lakes Branch");
System.out.println("Corner of Stellenberg and Solomon Mahlangu roads");
System.out.println("0860 300 999");
System.out.println("Makro.co.za);
*/

//Scanner sc = new Scanner(System.in);

public void setName(String name){
this.name = name;
}

public String getName(){
return name;
}
public void setRegistrationNumber(registrationNumber){
this.registerNumber;
}
public String getRegisterNumber(){
return registrationNumber;
}
public void setBranch(branch){
this.branch;
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
public void setTelephone(){
this.telephone;
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
}
