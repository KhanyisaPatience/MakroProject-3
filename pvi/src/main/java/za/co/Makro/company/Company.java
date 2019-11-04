//company class
package za.co.Makro.company;
import za.co.Makro.inventory.Product;
public abstract class Company{
private  String name;
private String registrationNumber;
private String branch;
private String address;
private long telephone;
private String emailAddress;

Company(){}
public Company(String name,String registrationNumber,String branch,String address,long telephone,String emailAddress){
this.name = name;
this.registrationNumber = registrationNumber;
this.branch = branch;
this.address = address;
this.telephone = telephone;
this.emailAddress = emailAddress;
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
}
