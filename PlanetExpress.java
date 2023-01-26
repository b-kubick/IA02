
import java.util.ArrayList;

public class PlanetExpress implements IShipper{
    private static final String NAME = "Planet Express";
    private final ArrayList<Product> items = new ArrayList<>();

    private int totalQuantity = 0;

    private double totalWeight = 0;

    @Override
    public String companyName() {
        return NAME;
    }

    @Override
    public void addProducts(Shipment shipment) {
        for (Product item : shipment.getProducts()) {
            items.add(item);
            totalQuantity += item.getQty();
            totalWeight += item.getWeightOunces();
        }

    }

    // Use System.lineSeparator() so that the code works in all platforms
    @Override
    public String outputProducts() {
        StringBuilder sbReport = new StringBuilder();
        //Todo 3 - Add formatted table header
        //Todo 4 - Format Output Round weight to 2 decimal points
        sbReport.append(String.format("%10s %40s %18s %30s", "Product Id", "Quantity", "Description", "Weight (oz)"));
        sbReport.append(System.lineSeparator());
        sbReport.append(String.format("%s%s","----------------------------------------------------------------------------------------------------",System.lineSeparator()));
        for (Product item : items) {
            sbReport.append(String.format("%-45s %-12d %-30s %-10.2f", item.getId(), item.getQty(), item.getDescription(), item.getWeightOunces()));
            sbReport.append(System.lineSeparator());
        }

        System.out.println(System.lineSeparator());
        sbReport.append("\nTotal number of items: " + totalQuantity + "\n");
        sbReport.append(String.format("Total weight of items: %.2f oz\n", totalWeight));
        return sbReport.toString();
    }
}
