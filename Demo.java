import java.util.Scanner;

enum ShipmentType {
  FEDEX,
  UPS,
  PLANET
}

public class Demo {

  Scanner keyboard = new Scanner(System.in);
  // Variable to hold the new shipment products
  Shipment shipment = new Shipment();

  public void runDemo() {
    shipment.addProduct(new Product("ea904c59-6e47-4982-b018-5ee9781e1e64", 1, "Mechanical Keyboard", 5.2));
    shipment.addProduct(new Product("58d5ac1b-417f-4843-b9c8-6b957fda61f9", 1, "Wireless Mouse", 1.3));
    shipment.addProduct(new Product("91f496f6-f6fe-4c5b-913a-810449456a50", 3, "HP Monitor", 25.1));
    shipment.addProduct(new Product("c25bee68-2b1b-4b29-afb8-885ea84f7859", 2, "Aperion Speakers", 20.8));

    System.out.println("How do you want to ship your order?");
    System.out.println("1) FedEx");
    System.out.println("2) UPS");
    System.out.println("3) Planet Express");

    // Read user input
    String userInput = keyboard.nextLine();

    //Parse user's choice to an integer
    int choiceNum = Integer.parseInt(userInput);

    // Declare choice as ShipmentType type. Since it is an enum it has indices 0-2.
    ShipmentType choice = ShipmentType.values()[choiceNum - 1];

    //TODO 2 - You only need one reference variable of type IShipper that can hold any of the three types
    //Create a mew IShipper that can hold all three types (UPS, FEDEX, PLANET) since they implement IShipper interface
    IShipper shipper = null;

    // Switch between user choices
    switch (choice) {
      case FEDEX:
        shipper = new FederalExpress();
        break;
      case UPS:
        shipper = new UnitedParcelService();
        break;
      case PLANET:
        shipper = new PlanetExpress();
        break;
      default:
        System.out.println("Invalid choice");
    }

    // Call addProducts() method to add all products of the shipment into the shipper
    shipper.addProducts(shipment);
    String shipperName = shipper.companyName();

    System.out.println("Your shipment is being processed by " + shipperName);
    System.out.println("Items getting ready to ship:");

    // Declare a new productList variable that holds the output from all the shipping types
    // Depending on what the user chooses is going to call the right Java Class
    String productList = shipper.outputProducts();

    // Print the productList
    System.out.println(productList);

  }

}

