package refactor;

public class MakeTeaState implements State {
  // here is the place to store two object
  VendingMachine vendingMachine;
  Tea tea;

  /**
   * constructor.
   * 
   */
  public MakeTeaState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
    Tea tea = new Tea();
    this.tea = tea;
  }

  /**
   * doing nothing.
   * 
   */
  @Override
  public void breeCoffee() {
    // TODO Auto-generated method stub
    System.out.println("I am waiting your tea choice");
  }

  /**
   * doing nothing.
   * 
   */
  @Override
  public void makeTea() {
    // TODO Auto-generated method stub
    System.out.println("what kind of tea you want,we have black tea, green tea and yellow tea");
  }

  /**
   * doing nothing.
   * 
   */
  @Override
  public void readyToOrder() {
    // TODO Auto-generated method stub
    System.out.println("I am waiting your tea choice");
  }

  /**
   * doing nothing.
   * 
   */
  @Override
  public void addCondiments(String choice) {
    // TODO Auto-generated method stub
    System.out.println("Only Coffee could add Condiments");
  }

  /**
   * change to another state.
   * 
   */
  @Override
  public void pushbotton() {
    // TODO Auto-generated method stub
    System.out.println("Ok I am making it right now, enjoy your" + this.tea.getName());
    vendingMachine.setState(vendingMachine.getReadyToOrderState());
    System.out.println("Hi,what kind of beverage you want");
  }

  /**
   * start making tea.
   * 
   */
  @Override
  public void teaChoice(String choice) {
    // TODO Auto-generated method stub
    Tea tea = new Tea();
    this.tea = tea;
    this.tea.setName(choice);
    System.out.println("please push the button to finish your choice, you choose " + this.tea.name);
  }

  /**
   * doing nothing.
   * 
   */
  @Override
  public void coffeeChoice(String choice) {
    // TODO Auto-generated method stub
    System.out.println("Let's firtst finish the tea");

  }



}
