
/**
 * Authors: Justin Girgis and Serenity
 * Purpose: Transaction Type enum, that is a buy or sell
 * Date: 4/19/2020
 */

/**
 * enum for transaction type, either BUY or SELL
 * Each enum can have a toString which I thought was pretty cool
 *
 */
public enum TransactionType {
        BUY {
            @Override
            public String toString() {
                return "Buying";
            }
        },
         SELL {
             @Override
             public String toString() {
                 return "Selling";
             }

         }
   }



