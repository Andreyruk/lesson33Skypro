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
        assertNotNull(user.getLogin());
        assertNotNull(user.getEmail());
    }

    @Test
    public void testUser3() {
        User user = new User("Petr", "petr@email.ru");
        assertTrue(user.getEmail().contains("@"));
        assertTrue(user.getEmail().contains("."));
    }

    @Test
    public void testUser4() {
        User user = new User("Petr", "petr@email.ru");
        assertNotEquals(user.getLogin(),user.getEmail());
    }
}