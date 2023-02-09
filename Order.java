import java.util.ArrayList;
import java.util.Arrays;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
      this.name = "Guest";
      this.items = new ArrayList<Item>();


    }

     // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.

    public Order(String name){ // as long as it has different signatures it counts as an overloaded method
      this.name = name;
      this.items = new ArrayList<Item>();

    }
    
    
    // ORDER METHODS
  public void addItem(Item item) {
    this.items.add(item);
  } 

    	// Most of your code will go here, 
    	// so implement the getters and setters first!

  public void display() {
    System.out.println("customer name:" + this.name );
    for (Item item : items) {
      System.out.println(item.getName() + " - " + item.getPrice() );
    }
    System.out.println(this.getOrderTotal()); // this means when we created this instance 
  }

  public void addItems(Item[] itemsArray) {
    System.out.println(Arrays.toString(itemsArray));// gets array
    for(int i = 0; i < itemsArray.length;i++){ // gets items individually
      System.out.println(itemsArray[i].getName()); // .getName prints out name instead of mem location
      this.items.add(itemsArray[i]);
    }
  }

  public void addItems(ArrayList<Item> itemsArrayList) {
    this.items.addAll(itemsArrayList);
  }

  public String getStatusMessage(){

    if(this.ready) {
      return "Your order is ready!";
    } else {
      return "Thank you for waiting. Your order will be ready soon.";
    }
    
  }
//declare var that holds sum of all prices
//loop through the array of order
// grab the price of each item in that array and add to sum

  public double getOrderTotal() {
    double sum = 0; 
    for (Item item : items){ 
      sum += item.getPrice();
    }

    return sum;

  }

    
    // GETTERS & SETTERS
    

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isReady() {
    return this.ready;
  }

  public boolean getReady() {
    return this.ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  public ArrayList<Item> getItems() {
    return this.items;
  }

  public void setItems(ArrayList<Item> items) {
    this.items = items;
  }

}
