
public abstract class Person{
private String firstName;
private String lastName;
private String address;
private String emailAddress;
private long phoneNumber;


public Person(String firstName,String lastName,String address,String emailAddress,long phoneNumber){
this.firstName = firstName;
this.lastName = lastName;
this.address = address;
this.emailAddress = emailAddress;
this.phoneNumber = phoneNumber;
}

public String getFirstName(){
return firstName;
}

public void setFirstName(String firstName){
this.firstName = firstName;
}


public String getLastName(){
return lastName;
}


public void setLastName(String lastName){
this.lastName = lastName;
}

public String getAddress(){
return address;
}

public void setAddress(String address){
this.address = address;
}

public String getEmailAddress(){
return emailAddress;
}

public void setEmailAddress(String emailAddress){
this.emailAddress = emailAddress;
}

public long getPhoneNumber(){
return phoneNumber;
}

public void setPhoneNumber(long phoneNumber){
this.phoneNumber = phoneNumber;
}

public void register(){

System.out.println("Registration");
}

public void login(){
System.out.println("Login details");
}
r
}
