/**
 * Author: Serenity Brown and Justin Girgis
 * The interface for our Observer
 * Date: 4/19/2020
 */

public interface Observer {
    /**
     * Update any changes to the observer
     * Observers are the people who will be alerted of a change
     * Is watching when the stocks will change
     */
    public void update(Subject subject);
}
