/**
 *
 */
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;

/**
*@param nameIn - name
*@param priceIn - price
*/
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }

/**
*@param wordsIn - words
*/
   public void setWordCount(int wordsIn) {
      wordCount = wordsIn;
   }
}