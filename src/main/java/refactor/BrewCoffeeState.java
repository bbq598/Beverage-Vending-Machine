package refactor;

public class BrewCoffeeState implements State {
  //here is the palce to store the two object
  VendingMachine vendingMachine;
  Coffee coffee;

  /**
   * constructor.
   * 
   */
  public BrewCoffeeState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
    Coffee coffee = new Coffee();
    this.coffee = coffee;
  }
  
  /**
   * doing nothing.
   * 
   */
  @Override
  public void breeCoffee() {
    // TODO Auto-generated method stub

    System.out.println(
        "what kind of coffee you want, we have espresso, americano, "
        + "and latte macchiato, also you can add condiments for your coffee.");
  }

  /**
   * doing nothing.
   * 
   */
  @Override
  public void makeTea() {
    // TODO Auto-generated method stub
    System.out.println("let's finish the coffee first");
  }

  /**
   * doing nothing.
   * 
   */
  @Override
  public void readyToOrder() {
    // TODO Auto-generated method stub
    System.out.println("let's finish the coffee first");
  }

  /**
   * add condiments and make sure not reach out the limit.
   * 
   */
  
  @Override
  public void addCondiments(String choice) {
    // TODO Auto-generated method stub
    if (coffee.count <= 3) {
      if (choice.contentEquals("milk")) {
        Milk milk = new Milk(coffee);
        milk.add();
        System.out.println("Ok, anything else");
      }
      if (choice.equals("sugar")) {
        Sugar sugar = new Sugar(coffee);
        sugar.add();
        System.out.println("Ok, anything else");

      }
    } else {
      System.out.println("you can choose up to three condiments");
    }

  }

  /**
   * change to another state.
   * 
   */

  @Override
  public void pushbotton() {
    // TODO Auto-generated method stub
    System.out.println("let me make you the coffee, enjoy your " + coffee.description);
    vendingMachine.setState(vendingMachine.getReadyToOrderState());
    System.out.println("Hi,what kind of beverage you want");

  }

  /**
   * doing nothing.
   * 
   */
  @Override
  public void teaChoice(String choice) {
    // TODO Auto-generated method stub
    System.out.println("let's finish the coffee first");
  }

  /**
   * making coffee.
   * 
   */
  @Override
  public void coffeeChoice(String choice) {
    // TODO Auto-generated method stub
    Coffee coffee = new Coffee();
    this.coffee = coffee;
    this.coffee.setName(choice);
  }



}
