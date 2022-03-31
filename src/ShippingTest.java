import java.util.ArrayList;

public class ShippingTest
{
  public static void main(String[] args)
  {
    // ---- TESTING PART A ----
    System.out.println("---- TESTING PART A ----");
    ShippingItem myItem = new ShippingItem(10);
    System.out.println(myItem.getCost());

    // ---- TESTING PART B ----
    System.out.println("---- TESTING PART B ----");
    ShippingItem insItem = new InsuredShippingItem(10, 50);
    System.out.println(insItem instanceof InsuredShippingItem);
    
    // ---- TESTING PART C ----
    System.out.println("---- TESTING PART C ----");
    ShippingItem newItem = new InsuredShippingItem(10, 50);
    System.out.println(newItem.getCost());
    
    // ---- TESTING PART D ----
    System.out.println("---- TESTING PART D ----");
    ArrayList<ShippingItem> itemList = new ArrayList<>();
    double totalCost = 0;
    itemList.add(new ShippingItem(10));
    itemList.add(new InsuredShippingItem(20, 50));
    itemList.add(new ShippingItem(30));
    itemList.add(new InsuredShippingItem(50, 70));
    
    /* MISSING CODE, TO BE WRITTEN IN PART D */
    // determine the totalCost of all 4 items by iterating through
    // itemList and adding up the individual cost of each item;
    // if the item is an InsuredShippingItem, add an additional 30
    // dollars of insurance using the addMoreInsurance method BEFORE
    // adding its costs to the total. The print command below should
    // print out 345.0 if your code is correct!
    for(int i = 0; i < itemList.size(); i++)
    {
      if(itemList.get(i) instanceof InsuredShippingItem)
      {
        ((InsuredShippingItem) itemList.get(i)).addMoreInsurance(30);
        totalCost+= ((InsuredShippingItem) itemList.get(i)).getCost();
      }
      else
      {
        totalCost += itemList.get(i).getCost();
      }
    }
    
    System.out.println(totalCost);
  }
}