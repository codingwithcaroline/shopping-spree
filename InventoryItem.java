/**
 *
 */
public class InventoryItem {
   protected String name = "";
   protected double price = 0;
   private static double taxRate = 0;

 /**
 *@param nameIn - name
 *@param priceIn - price
 */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }

 /**
 *@return - name
 */
   public String getName() {
      return name;
   }

 /**
 *@return - total cost
 */
   public double calculateCost() {
      return price * (1 + taxRate);
   }

 /**
 *@param taxRateIn - tax rate
 */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }

 /**
 *@return - name and cost
 */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}