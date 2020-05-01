/**
 * Author: Serenity Brown and Justin Girgis
 * Driver class to test our Observer
 * Date: 4/19/2020
 */
public class main {

    public static void main(String[] args) {
	// write your code here
        /** Instance of stocks*/
        Stock orcl = new Stock("ORCL", 335.94); //create new Stocks
        Stock bac = new Stock("BAC", 212.87);
        /** Agent instances */
        Agent tom = new Agent("Tom Clancey"); // create new Agents
        Agent robert = new Agent("Robert Mitchner");
        Agent noah = new Agent("Noah Ben Shea");
        Agent richard = new Agent("Richard Rohr");
        // have a few agents subscribe to stocks
        orcl.registerObserver(tom);
        orcl.registerObserver(richard);
        bac.registerObserver(robert);
        bac.registerObserver(richard);
        bac.registerObserver(tom);
        orcl.registerObserver(noah);


        // place some bids on some stocks
        new Bid(orcl, 1, TransactionType.BUY); //notifies everyone subscribed to Oracle stock

        orcl.removeObserver(noah); //removes Noah from subscription to oracle
        new Bid(orcl, 1, TransactionType.BUY); // print again to show that he has been removed


        new Bid(bac, 3, TransactionType.SELL); // notifies everyone subscribed to BofA stock





    }
}
