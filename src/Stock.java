
import java.util.ArrayList;

/**
 * Author: Justin Girgis and Serenity Brown
 * Purpose: Stock class is the Subject that the observers
 * are watching to see if it changes
 */
public class Stock implements Subject {
    /** Holding an array of Observers to alert if anything changes*/
    private ArrayList<Observer> observers;
    private Bid bid;
    /** Amount of shares as in 20, 30, 40*/
    private int amountOfShares;
    /** Name of stock as in ORCL*/
    private String stockName;
    /** Dollar amount of each trade*/
    private double dollarAmount;

    /**
     * Constructor for Stock class
     * @param stockName
     * @param dollarAmount
     */
    public Stock(String stockName, double dollarAmount){
        this.stockName = stockName;
        this.dollarAmount = dollarAmount;
        this.observers = new ArrayList<>();

    }

    /**
     * trade function that will notify Observers of Bid
     * @param bid
     */
    public void trade(Bid bid){
        this.bid = bid;
        this.notifyObservers();
    }

    /**
     * returns dollar amount of Stock
     * @return dollarAmount
     */
    public double getDollarAmount() {
        return dollarAmount;
    }

    /**
     * Returns the Stock's name
     * @return stockName
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * Returns the Bid
     * @return bid
     */
    public Bid getBid(){
        return this.bid;
    }

    /**
     * Adds the observer to the Array List only if it is not already there
     * @param observer
     * @return true or false
     */
    @Override
    public boolean registerObserver(Observer observer) {
        if(observers.contains(observer)){
            return false;
        }else{
            observers.add(observer);
            return true;
        }
    }

    /**
     * Removes an Observer if it is in the Array List
     * @param observer
     * @return
     */
    @Override
    public boolean removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
            return true;
        }else{
            return false;
        }
    }

    /**
     * Notify observer updates and changes
     */
    @Override
    public void notifyObservers() {
        for(Observer next: this.observers){
          next.update(this);
        }
    }

    /**
     * toString for Stock class
     * @return string
     */
    @Override
    public String toString() {

        return this.getStockName();
    }

}
