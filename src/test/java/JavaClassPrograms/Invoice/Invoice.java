package JavaClassPrograms.Invoice;
//@author Andy
//@version 1

public class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double price;

//Constructor for invoice
    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }
    //Calculates invoice amount
     void getInvoiceAmount(){
        double amount = this.quantity *this.price;
        System.out.println("Total Invoice amount: $" + amount);
        System.out.println("--------------------------------------------------------------------------------");
     }
     //Prints the rest of the invoice
    void printInvoice(){
        if (this.price < 0){
            this.price = 0.0;
        }
        if (this.quantity < 0){
            this.quantity = 0;
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Andy's Hardware Store Invoice");
        System.out.println("Contact me at 264-456-1249 for any issues");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Buyer Name : Tod Barley 2051154864");
        System.out.println("Shipping Address: 6648 County Road 392, Dayton OH, 45227, US");
        System.out.println("Billing Address: 6648 County Road 392, Dayton OH, 45227, US");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Part Number: " + partNumber);
        System.out.println("Part Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Item: $" + price);
    }
}
