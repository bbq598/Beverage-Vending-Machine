package refactor;

public class ReadyToOrderState implements State {


  VendingMachine vendingMachine;

  /**
   * constructor.
   * 
   */
  public ReadyToOrderState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  /**
   * change to another state.
   * 
   */
  
  @Override
  public void breeCoffee() {
    // TODO Auto-generated method stub
    System.out.println(
        "what kind of coffee you want, we have espresso, americano, "
        + "and latte macchiato, also you can add condiments for your coffee.");
    vendingMachine.setState(vendingMachine.getBrewCoffeeState());
  }

  /**
   * change to another state.
   * 
   */
  
  @Override
  public void makeTea() {
    // TODO Auto-generated method stub
    System.out.println("what kind of tea you want, we have black tea, green tea and yellow tea");
    vendingMachine.setState(vendingMachine.getMakeTeaState());
  }
  
  /**
   * doing nothing.
   * 
   */
  @Override
  public void readyToOrder() {
    // TODO Auto-generated method stub
    System.out.println("PLesae make your decision.");
  }


  /**
   * doing nothing.
   * 
   */
  @Override
  public void pushbotton() {
    // TODO Auto-generated method stub
    System.out.println("PLesae make your decision.");
  }

  /**
   * doing nothing.
   * 
   */

  @Override
  public void teaChoice(String choice) {
    // TODO Auto-generated method stub
    System.out.println("PLesae make your decision.");
  }

  /**
   * doing nothing.
   * 
   */

  @Override
  public void coffeeChoice(String choice) {
    // TODO Auto-generated method stub
    System.out.println("PLesae make your decision.");
  }

  /**
   * doing nothing.
   * 
   */

  @Override
  public void addCondiments(String choice) {
    // TODO Auto-generated method stub
    System.out.println("Only coffee can add condiments");
  }



}
