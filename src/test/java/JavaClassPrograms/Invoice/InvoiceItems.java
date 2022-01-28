package JavaClassPrograms.Invoice;
//@author Andy
//@version 1
import com.opencsv.CSVReader;
import java.io.FileReader;
public class InvoiceItems {
    String partNumber;
    String partDescription;
    int quantity;
    double price;
    String CSV_PATH = "resources/ItemsInCart.csv";
    private CSVReader csvReader;
    String[] csvCell;
    double  totalAmount;

//Default constructor for invoice
    public InvoiceItems() {
    }
    //Calculates invoice amount
     double getInvoiceAmount(){
         return quantity *price;
     }
     //Prints the customer information, calls to get invoice amount to calcuate price.
    void printInvoice() throws Exception{
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Andy's Hardware Store Invoice");
        System.out.println("Contact me at 264-456-1249 for any issues");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Buyer Name : Tod Barley 2051154864");
        System.out.println("Shipping Address: 6648 County Road 392, Dayton OH, 45227, US");
        System.out.println("Billing Address: 6648 County Road 392, Dayton OH, 45227, US");
        System.out.println("--------------------------------------------------------------------------------");
        csvReader = new CSVReader(new FileReader(CSV_PATH));
        while ((csvCell = csvReader.readNext()) != null){
            partNumber = csvCell[0];
            partDescription = csvCell[1];
            quantity = Integer.parseInt(csvCell[2]);
            price =  Double.parseDouble(csvCell[3]);
            if (price < 0) {price = 0.0;}
            if (quantity < 0) {quantity = 0;}
            totalAmount += getInvoiceAmount();
            printItemsInCart();
            System.out.println("--------------------------------------------------------------------------------");
        }
        System.out.println("Your total invoice amount is: " + Math.round(totalAmount*100.0)/100.0);
        System.out.println("Thank you for shopping at Andy's Hardware Store. Come see us again!");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Page 1/1");
    }
     //Prints the rest of the invoice for each item
    void printItemsInCart(){
        System.out.println("Part Number: " + partNumber);
        System.out.println("Part Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Item: $" + price);
    }
}





