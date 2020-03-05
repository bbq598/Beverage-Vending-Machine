package refactor;

public class VendingMachine {
  //here is the place to store object
  private State brewCoffeeState;
  private State readyToOrderState;
  private State makeTeaState;

  private State currentState;
  String name = "VendingMachine";

  /**
   * return the name.
   * @return the name
   */
  public String getName() {
    return name;
  }



  /**
   * set the name.
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * constructor.
   * 
   */
  public VendingMachine() {
    brewCoffeeState = new BrewCoffeeState(this);
    readyToOrderState = new ReadyToOrderState(this);
    makeTeaState = new MakeTeaState(this);
    System.out.println("Hi,what kind of beverage you want");
    currentState = this.readyToOrderState;
  }


  /**
   * use currentState to excute breeCoffee.
   * 
   */
  public void breeCoffee() {
    currentState.breeCoffee();
  }

  /**
   * use currentState to excute makeTea.
   * 
   */
  public void makeTea() {
    currentState.makeTea();
  }

  /**
   * change to excute readToOrder.
   * 
   */
  public void readToOrder() {
    currentState.readyToOrder();
  }

  /**
   * use currentState to excute addCondiments.
   * 
   */
  public void addCondiments(String choice) {
    currentState.addCondiments(choice);
  }


  /**
   * use currentState to excute pushbotton.
   * 
   */
  public void pushbotton() {
    currentState.pushbotton();
  }

  /**
   * use currentState to excute teaChoice.
   * 
   */
  public void teaChoice(String choice) {
    currentState.teaChoice(choice);
  }


  /**
   * use currentState to excute coffeeChoice.
   * 
   */
  public void coffeeChoice(String choice) {
    currentState.coffeeChoice(choice);
  }


  /**
   * set currentState.
   * 
   */
  public void setState(State state) {
    this.currentState = state;
  }

  /**
   * get state.
   * 
   */
  public State getState() {
    return currentState;
  }

  /**
   * get state.
   * 
   */
  public State getBrewCoffeeState() {
    return brewCoffeeState;
  }

  /**
   * get state.
   * 
   */
  public State getReadyToOrderState() {
    return readyToOrderState;
  }

  /**
   * get state.
   * 
   */
  public State getMakeTeaState() {
    return makeTeaState;
  }


}
