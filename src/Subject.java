/**
 * Author: Serenity Brown and Justin Girgis
 * The interface to register, notify, and remove observers.
 * Date: 4/19/2020
 */
public interface Subject {


    public boolean registerObserver(Observer observer);
    public void notifyObservers();
    public boolean removeObserver(Observer observer);

}
