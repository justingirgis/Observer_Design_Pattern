import java.text.DecimalFormat;
/**
 * Author: Serenity Brown and Justin Girgis
 * Our Bid class which will handle new bids being created with the number of shares, buy or sell, and which Stock
 * Date: 4/19/2020
 */

public class Bid {
    // member variables of bid
    private int shares;
    private Stock stock;
    private TransactionType transactionType;
    private DecimalFormat format = new DecimalFormat("$#.00");

    /**
     * Bid is passing in a stock that it is going to place a bid on
     * @param stock, bid
     */
    public Bid(Stock stock, int shares, TransactionType transactionType){
    this.shares = shares;
    this.stock = stock;
    this.transactionType = transactionType;
    this.stock.trade(this); // calls the trade function in the stock class
    }


    @Override
    public String toString() {
        return "Bid - Symbol:" + stock.toString() + " " + transactionType.toString()
                + " " + shares + " for the amount:" +
                format.format(shares * stock.getDollarAmount());
    }
}
