package za.co.makro.person;

import za.co.makro.person.Person;
import java.util.Scanner;



public class Customer extends Person{

  private int cardNumber;
  public String items;

Scanner sc = new Scanner(System.in);


public Customer(){}



public void setCardNumber(int cardNumber){
this.cardNumber = cardNumber;
}

public int getCardNumber(){
return cardNumber;
}

 

public void purchase(){



}

}
