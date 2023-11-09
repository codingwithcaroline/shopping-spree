   /**
   *
   */
public class ElectronicsItem extends InventoryItem {
   
   protected double weight = 0;
   
   /**
   *
   */
   public static final double SHIPPING_COST = 1.5;

   /**
   *@param nameIn - name
   *@param priceIn - price
   *@param weightIn - weight
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }

   /**
   *@return - total cost
   */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}