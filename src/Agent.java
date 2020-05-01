
/**
 * Authors: Justin Girgis and Serenity Brown
 * Agent class is the Observer aka the agents
 * who are watching the stocks change and being alerted on it
 * Date: 4/19/2020
 */
public class Agent implements Observer {
    /** Name of the agent, or person observing the stock*/
    private String nameOfAgent;
    /** Accepts an instance of Subject (Being our Stock)*/
    //Subject stock;


    public Agent(String nameOfAgent){
        this.nameOfAgent = nameOfAgent;
        /** Allowing this observer(agent) to be observed by our stock object*/
    }

    /**
     * toString for Agent class that will return Agent's name
     * @return string
     */
    @Override
    public String toString() {
        return "Agent - Name: " + nameOfAgent + " alerted to ";
    }


    /**
     * Will need to call getBid() to see what changed in Stock
     * @param subject
     */
    @Override
    public void update(Subject subject) {
        Bid stock = ((Stock) subject).getBid();
        System.out.println(this.toString() + " " + stock);
    }
}
