package study;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import java.util.*;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("요구사항 1")
    void size() {
        assertThat(numbers.size()).isEqualTo(3);
    }

}
