import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    private String login;
    private String email;

    @Test
    public void testUser1() {
        User user = new User("Petr", "petr@email.ru");
        assertNotNull(user.getLogin());
        assertNotNull(user.getEmail());
    }

    @Test
    public void testUser2() {
        User user = new User();
        assertNull(user.getLogin());
        assertNull(user.getEmail());
    }

    @Test
    public void testUser3() {
        // User user = new User("Petr", "petr@email.ru");
        assertThrows(RuntimeException.class, () -> new User("Petr", "petremail.ru"));
        // assertNotEquals("", user.getEmail());
    }

    @Test
    public void testUser4() {
//        User user = new User("Petr", "petr@email.ru");
        assertThrows(IllegalStateException.class, () -> new User("Petr", "Petr"));
//        assertNotEquals(user.getLogin(), user.getEmail());
    }
}