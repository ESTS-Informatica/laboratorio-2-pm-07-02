

/**
 * A property to sell.
 *
 * @author POO
 * @version 03/2024
 */
public class Property {

    private static int NUMBER_OF_PROPERTIES = 0;
    private final String id;
    private String description;
    private double price;

    /**
     * Constructor of class Property
     *
     * @param description The property description.
     * @param price The property price.
     */
    public Property(String description, double price, String id) {
        this.id = id;
        this.description = description;
        this.price = price;
        NUMBER_OF_PROPERTIES++;
    }

    /**
     * Id selector.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Description selector.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Description modifier.
     * 
     * @param description The new description. Must not be null.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Price selector.
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * Price modifier.
     * 
     * @param price The new price. Must not be negative.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Descricao\t:\t" + this.description + "\nPreco\t:\t" + this.price + " Euros";
    }
}
