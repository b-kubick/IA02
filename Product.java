public class Product {
  private String id = null;
  private int qty = 0;
  private String description = null;
  private double weight_ounces = 0;

  public Product(String id, int qty, String desc, double weight) {
    this.id = id;
    this.qty = qty;
    description = desc;
    weight_ounces = weight;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getWeightOunces() {
    return weight_ounces;
  }

  public void setWeightOunces(double weightOunces) {
    this.weight_ounces = weightOunces;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }
}

