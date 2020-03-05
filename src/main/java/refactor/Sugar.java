package refactor;

public class Sugar extends Coffee {
  //here is the place to store object
  Coffee coffee;

  /**
   * constorctor.
   * 
   */
  public Sugar(Coffee coffee) {
    this.coffee = coffee;
  }

  /**
   * add sugar to the coffee.
   * 
   */
  public void add() {
    coffee.count += 1;
    coffee.description = coffee.description + "and a teaspone of sugar";
  }

}
