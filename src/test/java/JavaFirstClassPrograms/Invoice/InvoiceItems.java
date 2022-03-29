package JavaClassPrograms.Invoice;
//@author Andy
//@version 1

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.opencsv.CSVReader;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;

public class InvoiceItems {
    String partNumber;
    String partDescription;
    int quantity;
    double price;
    String CSV_PATH = "resources/ItemsInCart.csv";
    String[] csvCell;
    double  totalAmount;
    Document document = new Document();

//Default constructor for invoice
    public InvoiceItems() {

    }
    //Calculates invoice amount
     double getInvoiceAmount(){
         return quantity *price;
     }
     //Prints the customer information, calls to get invoice amount to calcuate price.
    void printInvoice() throws Exception{

        OutputStream outputStream = new FileOutputStream("resources/Invoice1.pdf");
        PdfWriter.getInstance(document, outputStream);
        document.open();
        document.add(new Paragraph("--------------------------------------------------------------------------------"));
        document.add(new Paragraph("Andy's Hardware Store Invoice"));
        document.add(new Paragraph("Contact me at 264-456-1249 for any issues"));
        document.add(new Paragraph("--------------------------------------------------------------------------------"));
        document.add(new Paragraph("Buyer Name : Tod Barley 2051154864"));
        document.add(new Paragraph("Shipping Address: 6648 County Road 392, Dayton OH, 45227, US"));
        document.add(new Paragraph("Billing Address: 6648 County Road 392, Dayton OH, 45227, US"));
        document.add(new Paragraph("--------------------------------------------------------------------------------"));
        CSVReader csvReader = new CSVReader(new FileReader(CSV_PATH));
        while ((csvCell = csvReader.readNext()) != null){
            partNumber = csvCell[0];
            partDescription = csvCell[1];
            quantity = Integer.parseInt(csvCell[2]);
            price =  Double.parseDouble(csvCell[3]);
            if (price < 0) {price = 0.0;}
            if (quantity < 0) {quantity = 0;}
            totalAmount += getInvoiceAmount();
            printItemsInCart();
            document.add(new Paragraph("--------------------------------------------------------------------------------"));
        }
        document.add(new Paragraph("Your total invoice amount is: " + Math.round(totalAmount*100.0)/100.0));
        document.add(new Paragraph("Thank you for shopping at Andy's Hardware Store. Come see us again!"));
        document.add(new Paragraph("--------------------------------------------------------------------------------"));
        document.close();
        outputStream.close();
    }
     //Prints the rest of the invoice for each item
    void printItemsInCart() throws Exception{

        document.add(new Paragraph("Part Number: " + partNumber));
        document.add(new Paragraph("Part Description: " + partDescription));
        document.add(new Paragraph("Quantity: " + quantity));
        document.add(new Paragraph("Price Per Item: $" + price));
    }

}





