import java.util.Scanner;
public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int productID[] = new int[10];
        String productName[] = new String[10];
        int quantity[] = new int[10];

        int count = 0;
        int option;

        do{
            System.out.println("What do you want to do? Select from options given below:");
            System.out.println("1- ADD PRODUCT");
            System.out.println("2- VIEW PRODUCTS");
            System.out.println("3- SEARCH PRODUCT");
            System.out.println("4- UPDATE QUANTITY");
            System.out.println("5- EXIT");
            option=sc.nextInt();
            
            switch (option) {
                case 1:
                    //add product
                    if(count < 10){
                        System.out.print("Enter Product ID: ");
                        productID[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Product Name: ");
                        productName[count] = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        quantity[count] = sc.nextInt();

                        count++;
                        System.out.println("Product Added Successfully!");
                    }else{
                        System.out.println("Inventory is Full!");
                    }
                    break;
            
                case 2:
                    //view products
                    if(count==0){
                        System.out.println("No products available!");
                    }else{
                        for(int i=0;i<count;i++){
                            System.out.println("Product ID : " + productID[i]);
                            System.out.println("Product Name : " + productName[i]);
                            System.out.println("Quantity : " + quantity[i]);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    //search product
                    sc.nextLine();
                    System.out.print("Enter Product Name : ");
                    String name=sc.nextLine();
                    boolean found=false;
                    if(count==0){
                        System.out.println("No Products Available!");
                    }else{
                        for(int i=0;i<count;i++){
                            if(productName[i].equalsIgnoreCase(name)){
                                System.out.println("Product ID : " + productID[i]);
                                System.out.println("Product Name : " + productName[i]);
                                System.out.println("Quantity : " + quantity[i]);
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Product Not Found!");
                        }
                    }
                    break;
                    
                case 4:
                    //update quantity
                    sc.nextLine();
                    System.out.print("Enter Product Name : ");
                    name=sc.nextLine();
                    found=false;
                    if(count==0){
                        System.out.println("No Products Available!");
                    }else{
                        for(int i=0;i<count;i++){
                            if(productName[i].equalsIgnoreCase(name)){
                                found=true;
                                System.out.print("Enter new Quantity : ");
                                int newQuantity=sc.nextInt();
                                quantity[i]=newQuantity;
                                System.out.println("Quantity Updated Successfully!");
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Product Not Found!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }while(option!=5);

        sc.close();
    }
}
