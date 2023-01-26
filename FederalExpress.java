import java.util.Stack;

public class FederalExpress {

  private static final String NAME = "Federal Express";
  private final Stack<Product> items = new Stack<>();
  private int total_qty = 0;

  public void addItems(Shipment shipment) {
    for (Product item : shipment.getProducts()) {
      items.push(item);
      total_qty += item.getQty();
    }
  }

  public String company() {
    return NAME;
  }

  public String outputProducts() {
    StringBuilder sbReport = new StringBuilder();
    for (Product item : items) {
      sbReport.append(item.getQty());
      sbReport.append(" " + item.getDescription());
      sbReport.append(" (" + item.getWeightOunces() + " oz)");
      sbReport.append(System.lineSeparator());
    }

    sbReport.append("Total number of items: " + total_qty);
    sbReport.append(System.lineSeparator());
    return sbReport.toString();
  }
}
