import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PhoneBookTest {
    @Test
    public void testAdd(){
        PhoneBook phoneBook = new PhoneBook();
        int contactsCount = phoneBook.add("Alex", "+795842457");
        assertEquals(1, contactsCount);
    }


    @Test
    public void testFindByNumber(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "123456789");
        String name = phoneBook.findByNumber("123456789");
        assertEquals("Alice", name);
    }

    @Test
    public void testFindByName(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Nick", "+78952486");
        String TelNumber = phoneBook.findByName("Nick");
        assertEquals("+78952486", TelNumber);
    }

    @Test
    public void testPrintAllNames(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Bob", "123456789");
        phoneBook.add("Alice", "987654321");
        phoneBook.add("Charlie", "555555555");
        List<String> expectedNames = Arrays.asList("Charlie", "Bob", "Alice");
        List<String> actualNames = phoneBook.printAllNames();
        assertEquals(expectedNames, actualNames);
    }
}
