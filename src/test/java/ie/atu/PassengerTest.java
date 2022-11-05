package ie.atu;


import ie.atu.Passenger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger myPassenger;

    @BeforeEach
    void setUp() {
        myPassenger = new Passenger(null, null, null, null, 0);
    }

    @Test
    void testMrTitle(){
        myPassenger.passy("Mr","James", "G000383112", "0873684", 22);
        assertEquals("Mr", myPassenger.getTitle());
    }

    @Test
    void testMsTitle(){
        myPassenger.passy("Ms","James", "G000383112", "0873684", 22);
        assertEquals("Ms", myPassenger.getTitle());
    }

    @Test
    void testMrsTitle(){
        myPassenger.passy("Mrs","James", "G000383112", "0873684", 22);
        assertEquals("Mrs", myPassenger.getTitle());
    }

    @Test
    void testTitleFail() {IllegalArgumentException checker = assertThrows(IllegalArgumentException.class, () ->{
        myPassenger.passy("Mrtt","James", "G000383112", "0873684", 22);
    });
        assertEquals("Invalid title", checker.getMessage());
    }

    @Test
    void testPhoneSuccess(){
        myPassenger.passy("Mr","James", "G000383112", "0873684", 22);
        assertEquals("0873684", myPassenger.getPhone());
    }

    @Test
    void testPhoneFail() {
        IllegalArgumentException checker = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.passy("Mr","James", "G000383112", "087368", 22);
        });
        assertEquals("Minimum phone number length is 7", checker.getMessage());
    }

    @Test
    void testNameSuccess(){
        myPassenger.passy("Mr","James", "G000383112", "0873684", 22);
        assertEquals("James", myPassenger.getName());
    }

    @Test
    void testNameFail() {
        IllegalArgumentException checker = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.passy("Mr","Ja", "G000383112", "0873684", 22);
        });
        assertEquals("Minimum character length is 3", checker.getMessage());
    }

    @Test
    void testIdSuccess(){
        myPassenger.passy("Mr","James", "G000383112", "0873684", 22);
        assertEquals("G000383112", myPassenger.getId());
    }

    @Test
    void testIdFail() {
        IllegalArgumentException checker = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.passy("Mr","James", "G0003", "0873684", 22);
        });
        assertEquals("Minimum character length is 10", checker.getMessage());
    }

    @Test
    void testAgeSuccess(){
        myPassenger.passy("Mr","James", "G000383112", "0873684", 22);
        assertEquals(22, myPassenger.getAge());
    }

    @Test
    void testAgeFail() {
        IllegalArgumentException checker = assertThrows(IllegalArgumentException.class, () ->{
            myPassenger.passy("Mr","James", "G0003", "0873684", 12);
        });
        assertEquals("Minimum integer of age is 16", checker.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}