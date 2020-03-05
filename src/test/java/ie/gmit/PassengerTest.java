package ie.gmit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PassengerTest {
    @Test
    void testConstructor()
    {
        Passenger myPassengers = new Passenger("Mr", "Habib Bello", "G00324434", "0899806417", 24);
        assertEquals("Habib", myPassengers.getName());

    }

    @Test
    void testConstructorNoTitle()
    {
        //Passenger myPassengers = new Passenger("", "Habib Bello", "G00324434", "0899806417", 24);
        //assertEquals("Habib", myPassengers.getName());
        assertThrows( IllegalArgumentException.class, () -> new Passenger("", "Habib Bello", "G00324434", "0899806417", 24) );

    }
    @Disabled
    @Test
    void testConstructorNoName()
    {
        //Passenger myPassengers = new Passenger("", "Habib Bello", "G00324434", "0899806417", 24);
        //assertEquals("Habib", myPassengers.getName());
        assertThrows( IllegalArgumentException.class, () -> new Passenger("Mr", "", "G00324434", "0899806417", 24) );

    }

    @Test
    void testConstructorNoID()
    {
        //Passenger myPassengers = new Passenger("", "Habib Bello", "G00324434", "0899806417", 24);
        //assertEquals("Habib", myPassengers.getName());
        assertThrows( IllegalArgumentException.class, () -> new Passenger("Mr", "Habib Bello", "", "0899806417", 24) );

    }


    @Test
    void testConstructorNoPhone()
    {
        //Passenger myPassengers = new Passenger("", "Habib Bello", "G00324434", "0899806417", 24);
        //assertEquals("Habib", myPassengers.getName());
        assertThrows( IllegalArgumentException.class, () -> new Passenger("Mr", "Habib Bello", "G00324434", "", 24) );

    }

}

