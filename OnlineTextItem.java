  /**
*
*/
public abstract class OnlineTextItem extends InventoryItem {

 /**
 *@param nameIn - name
 *@param priceIn - price
 */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

 /**
 *@return - total cost
 */
   public double calculateCost() {
      return price;
   }
}