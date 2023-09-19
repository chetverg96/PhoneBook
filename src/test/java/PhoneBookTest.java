import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

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


}
