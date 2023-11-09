/**
 *
 */
public class OnlineBook extends OnlineTextItem {
   protected String author;

/**
*@param nameIn - name
*@param priceIn - price
*/
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }

/**
*@return - name, author, price
*/
   public String toString() {
      return name + " - " + author + ": $" + price;
   }

/**
*@param nameIn - author name
*/
   public void setAuthor(String nameIn) {
      author = nameIn;
   }
}