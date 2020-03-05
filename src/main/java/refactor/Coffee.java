package refactor;

public class Coffee {
  //here is the place to store the attribute
  String name;
  int count;
  String description;

  /**
   * return the name.
   * @return the name
   * 
   * 
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
    description = name;
  }



}
