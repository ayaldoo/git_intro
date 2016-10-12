package eecs285.proj1.ayaldoo;


/**
 * This class is used to instantiate objects that represent our customers.
 * Each customer object will describe one customer.
 * @author Alex Yaldoo 
 * @version Project 1
 */
public class CustomerClass
{   
  private String LastName;
  private String FirstName;  
  
  CustomerClass(String inLastName, String inFirstName)
  {
    ///Value constructor that simply assigns the newly created
    ///customer’s attributes to the corresponding values provided.
    this.LastName = inLastName;
    this.FirstName = inFirstName;
  }
  
  void printCustomerInfo()
  {
    ///Prints the customer’s attributes in a formatted way.
    ///Specifically, if a customer’s last name is Smith and
    ///their first name is Jane, then this method will
    ///print "Customer – Last, First: Smith, Jane" (the quotes
    ///will not be printed!)
    System.out.println("Customer - Last, First: " + LastName + ", " + FirstName);
  }
  
  String getFirstName()
  {
    ///Simple getter function that returns the customer's first
    ///name attribute.
    return FirstName;
  }
  
  String getLastName()
  {
    ///Simple getter function that returns the customer's last
    ///name attribute.
    return LastName;
  }
}