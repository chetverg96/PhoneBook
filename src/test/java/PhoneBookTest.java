import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd(){
        PhoneBook phoneBook = new PhoneBook();
        int contactsCount = phoneBook.add("Alex", +795842457);
        assertEquals(1, contactsCount);
    }
}
