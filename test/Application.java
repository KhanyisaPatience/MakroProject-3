public class Application{

public static void main(String[] args){

product product[] = new product[4];

Scanner sc = new Scanner(System.in);


System.out.println(                                 Welcome to Makro                                 );
System.out.println(                                  BIG on life                                     );

System.out.println();

System.out.println("Enter product name");
product.productName = sc.nextLine();

System.out.println("Enter barcode");
product.barcode = sc.nextLong();

System.out.println("Enter quantity");
product.quantity = sc.nextInt();

System.out.println("Manufacture date");
product.manufactureDate = sc.nextLine();

System.out.println("Enter Expiry date");
product.expiryDate = sc.nextLine();

System.out.println("Enter price");
product.price = sc.nextDouble();

for(int a = 0;b < 5;a++)
System.out.println("");

product p1 = new product();


}
}

