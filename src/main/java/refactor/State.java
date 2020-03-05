package refactor;

public interface State {
  
  /**
   * breeCoffee.
   * 
   */
  public void breeCoffee();

  /**
   * makeTea.
   * 
   */
  public void makeTea();

  /**
   * readyToOrder.
   * 
   */
  public void readyToOrder();

  /**
   * addCondiments.
   * 
   */
  public void addCondiments(String choice);
  
  /**
   * pushbotton.
   * 
   */
  public void pushbotton();

  /**
   * teaChoice.
   * 
   */
  public void teaChoice(String choice);

  /**
   * coffeeChoice.
   * 
   */
  public void coffeeChoice(String choice);

}
