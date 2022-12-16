package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    // req1
    void split() {
        String[] actual0 = "1,2".split(",");
        assertThat(actual0).containsExactly("1","2");

        String[] actual1 = "1".split(",");
        assertThat(actual1).containsExactly("1");
    }

    @Test
    // req2
    void substring() {
        String given = "(1,2)";

        String when = given.substring(1, 4);

        assertThat(when).isEqualTo("1,2");
    }
}
