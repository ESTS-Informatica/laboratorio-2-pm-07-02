
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * The test class CompanyTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
@TestMethodOrder(OrderAnnotation.class)
public class CompanyTest {
    /**
     * Default constructor for test class CompanyTest
     */

    private Company company;
    private User client1;
    private User client2;
    private User client3;
    private User client4;
    private User client5;

    private User seller1;
    private User seller2;
    private User seller3;
    private User seller4;
    private User seller5;

    private Property property1;
    private Property property2;
    private Property property3;
    private Property property4;

    public CompanyTest() {
    }

    @Test
    public void testConstructor() {
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getProperties());
        assertNotNull(company.getSells());
    }

    // Clients
    @Test
    @Order(1)
    public void testRegisterClient() {
        assertTrue(company.registerClient(client3));
    }

    @Test
    @Order(2)
    public void testRegisterClients() {
        assertTrue(company.registerClient(client4));
        assertTrue(company.registerClient(client5));
    }

    @Test
    @Order(3)
    public void testRegisterClientDuplicate() {
        assertFalse(company.registerClient(client1));
    }

    @Test
    @Order(4)
    public void testRegisterClientNull() {
        assertFalse(company.registerClient(null));
    }

    // Sellers
    @Test
    @Order(5)
    public void testRegisterSeller() {
        assertTrue(company.registerSeller(seller3));
    }

    @Test
    @Order(6)
    public void testRegisterSellers() {
        assertTrue(company.registerSeller(seller4));
        assertTrue(company.registerSeller(seller5));
    }

    @Test
    @Order(7)
    public void testRegisterSellerDuplicate() {
        assertFalse(company.registerSeller(seller1));
    }

    @Test
    @Order(8)
    public void testRegisterSellerNull() {
        assertFalse(company.registerSeller(null));
    }

    // Properties
    @Test
    @Order(9)
    public void testRegisterProperty() {
        assertTrue(company.registerProperty(property1));
    }

    @Test
    @Order(10)
    public void testRegisterProperties() {
        assertTrue(company.registerProperty(property2));
        assertTrue(company.registerProperty(property3));
    }

    @Test
    @Order(11)
    public void testRegisterPropertyDuplicate() {
        assertTrue(company.registerProperty(property4));
        assertFalse(company.registerProperty(property4));
    }

    @Test
    @Order(12)
    public void testRegistePropertyNull() {
        assertFalse(company.registerProperty(null));
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
        client3 = new User("client3", "933333333", "zemanel@yahoo.com");
        client4 = new User("client4", "944444444", "tochico@hotmail.com");
        client5 = new User("client5", "955555555", "tochico@hotmail.com");

        seller1 = new User("seller1", "966777101", "fefe@remax.pt");
        seller2 = new User("seller2", "966777152", "roro@remax.pt");
        seller3 = new User("seller3", "966777103", "roro@remax.pt");
        seller4 = new User("seller4", "966777103", "roro@remax.pt");
        seller5 = new User("seller5", "966777103", "roro@remax.pt");

        property1 = new Property("property1", 100000, "1");
        property2 = new Property("property2", 200000, "2");
        property3 = new Property("property3", 300000, "3");
        property4 = new Property("property4", 400000, "4");

        company = new Company();

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
