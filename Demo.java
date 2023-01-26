import java.util.Scanner;

enum ShipmentType {
  FEDEX,
  UPS
}

public class Demo {

  Scanner keyboard = new Scanner(System.in);
  Shipment shipment = new Shipment();

  public void runDemo() {
    shipment.addProduct(new Product("ea904c59-6e47-4982-b018-5ee9781e1e64", 1, "Mechanical Keyboard", 5.2));
    shipment.addProduct(new Product("58d5ac1b-417f-4843-b9c8-6b957fda61f9", 1, "Wireless Mouse", 1.3));
    shipment.addProduct(new Product("91f496f6-f6fe-4c5b-913a-810449456a50", 3, "HP Monitor", 25.1));
    shipment.addProduct(new Product("c25bee68-2b1b-4b29-afb8-885ea84f7859", 2, "Aperion Speakers", 20.8));

    System.out.println("How do you want to ship your order?");
    System.out.println("1) FedEx");
    System.out.println("2) UPS");
    String userInput = keyboard.nextLine();
    int choiceNum = Integer.parseInt(userInput);
    ShipmentType choice = ShipmentType.values()[choiceNum - 1];

    String shipperName = null;
    FederalExpress fedex = null;
    UnitedParcelService ups = null;
    switch (choice) {
      case FEDEX:
        fedex = new FederalExpress();
        fedex.addItems(shipment);
        shipperName = fedex.company();
        break;
      case UPS:
        ups = new UnitedParcelService();
        ups.addProducts(shipment);
        shipperName = ups.compName();
        break;
      default:
        System.out.println("Invalid choice");
    }

    System.out.println("Your shipment is being processed by " + shipperName);
    System.out.println("Items getting ready to ship:");
    String productList = null;
    switch (choice) {
      case FEDEX:
        productList = fedex.outputProducts();
        break;
      case UPS:
        productList = ups.showProducts();
        break;
      default:
        throw new AssertionError();
    }
    System.out.println(productList);
  }

}

