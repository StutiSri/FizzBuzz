import org.junit.jupiter.api.Test;

class ApplicationTest {
    @Test
    void shouldPrintTransformedListForFirst100Numbers() {
        Application.main(new String[]{"100"});
    }
}