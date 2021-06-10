import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

public class filetest {
    @Test
    public void testmasv() {
        String str = "NV1234567";
        assertThat(str).isNotNull()
               .matches("[N][V][0-9]{7}");

    }
}