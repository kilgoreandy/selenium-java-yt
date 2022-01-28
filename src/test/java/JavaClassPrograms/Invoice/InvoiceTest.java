package JavaClassPrograms.Invoice;

// @author Andy
// @version 1
// @
public class InvoiceTest {

    // Test that creates new invoice method four times to test different scenarios
   public static void main(String[] args){
       Invoice iv = new Invoice("844584", "Spoonbill_screwdriver",5, 5.50);
       iv.printInvoice();
       iv.getInvoiceAmount();
       Invoice rf = new Invoice("136578", "null",-5, -4.50);
       rf.printInvoice();
       rf.getInvoiceAmount();
       Invoice zp = new Invoice("619754", "null",17, -5.00);
       zp.printInvoice();
       zp.getInvoiceAmount();
       Invoice zq = new Invoice("3489791", "null",-8, 9.50);
       zq.printInvoice();
       zq.getInvoiceAmount();
   }
}
