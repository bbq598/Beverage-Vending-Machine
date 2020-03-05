package refactor;

public class Milk extends Coffee {
  // here is the place to store object
  Coffee coffee;
  
  /**
   * constorctor.
   * 
   */
  public Milk(Coffee coffee) {
    this.coffee = coffee;
  }
  
  /**
   * add milk to the coffee.
   * 
   */
  public void add() {
    coffee.count += 1;
    coffee.description = coffee.description + "and a cup of milk";
  }



}
