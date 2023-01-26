public class UnitedParcelService {

  Product prod1 = null;
  Product prod2 = null;
  Product prod3 = null;
  Product prod4 = null;

  public void addProducts(Shipment shipment) {
    int i = 0;
    for (Product p : shipment.getProducts()) {
      i++;
      switch (i) {
        case 1: prod1 = p; break;
        case 2: prod2 = p; break;
        case 3: prod3 = p; break;
        case 4: prod4 = p; break;
      }
    }
  }

  public String compName() {
    return "UPS";
  }

  public String showProducts() {
    String listOfItems = "";
    listOfItems = listOfItems + prod1.getDescription() + " [" + prod1.getQty() + "]" + System.lineSeparator();
    listOfItems = listOfItems + prod2.getDescription() + " [" + prod2.getQty() + "]" + System.lineSeparator();
    listOfItems = listOfItems + prod3.getDescription() + " [" + prod3.getQty() + "]" + System.lineSeparator();
    listOfItems = listOfItems + prod4.getDescription() + " [" + prod4.getQty() + "]" + System.lineSeparator();

    return listOfItems;
  }


}

