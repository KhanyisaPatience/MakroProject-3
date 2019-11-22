
package za.co.makro.person;
import java.util.Scanner;
public abstract class Person{

private String address;
private String emailAddress;
private long phoneNumber;
private long idNumber;
private String dateOfBirth;
private String gender;
private String surname;
private String name;

public Person(){}

public Person(String firstName,String lastName,String address,String emailAddress,long phoneNumber){
this.name = firstName;
this.surname = lastName;
this.address = address;
this.emailAddress = emailAddress;
this.phoneNumber = phoneNumber;
}

public void setSurname(String surname){

this.surname = surname;
}

public String getSurname(){

return surname;
}

public void setName(String name){

this.name = name;
}

public String getName(){

return name;
}

public void setGender(String sex){

gender = sex;
}

public String getGender(){

return gender;
}
public void setDateOfBirth(String dateOfBirth){

this.dateOfBirth = dateOfBirth;

}

public String getDateOfBirth(){

return dateOfBirth;
}


public void setIdNumber(long id){

idNumber = id;
}

public long getIdNumber(){

return idNumber;
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

public  void register(){



}

public void login(Person p1, String userName, String password){
Scanner sc = new Scanner(System.in);

/*System.out.println("Enter username");
username = sc.nextLine();
System.out.println("Enter password");
password = sc.nextLine();
for(int a = 0; a < 
*/
}
}

