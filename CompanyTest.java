
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CompanyTest {
    /**
     * Default constructor for test class CompanyTest
     */

    private Company company;
    private User client1;
    private User client2;
    private User seller1;
    private User seller2;
    Property property;

    public CompanyTest() {
    }

    @Test
    public void testConstructor() {
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getProperties());
        assertNotNull(company.getSells());
    }

    @Test
    public void testCreateSell() {
        assertTrue(company.createSell(client1, seller1, property));
    }

    @Test
    public void testCalculateSellsOfTheYear() {
        assertEquals(3, company.calculateSellsOfTheYear(2024));
    }

    @Test
    public void findSellerOfTheYear() {
        assertEquals("seller1", company.findSellerOfTheYear(2024));
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        client1 = new User("client1", "911111111", "zemanel@yahoo.com");
        client2 = new User("client2", "922222222", "tochico@hotmail.com");
        seller1 = new User("seller1", "966777101", "fefe@remax.pt");
        seller2 = new User("seller2", "966777152", "roro@remax.pt");
        property = new Property("T3 Monte Belo", 150000.0, "property1");

        company = new Company();
        company.createSell(client1, seller1, property);
        company.createSell(client1, seller1, property);
        company.createSell(client1, seller1, property);

        company.registerClient(client1);
        company.registerClient(client2);
        company.registerSeller(seller1);
        company.registerSeller(seller2);

    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
    }
}
