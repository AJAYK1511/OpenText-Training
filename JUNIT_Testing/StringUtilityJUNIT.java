import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    public void testIsPalindrome() {
        assertTrue(StringUtil.isPalindrome("madam"));
        assertFalse(StringUtil.isPalindrome("hello"));
    }
}

class StringUtil {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
