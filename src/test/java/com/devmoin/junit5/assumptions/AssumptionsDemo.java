package com.devmoin.junit5.assumptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.*;

/**
 * Created by moin
 * on December, 2019
 **/
public class AssumptionsDemo {
    @Test
    void exitIfFalseIsTrue() {
        assumeTrue(false);
        System.exit(1);
    }

    @Test
    void exitIfTrueIsFalse() {
        assumeFalse(this::truism);
        System.exit(1);
    }

    private boolean truism() {
        return true;
    }

    @Test
    void exitIfNullEqualsString() {
        assumingThat(
                "null".equals(null),
                () -> System.exit(1)
        );
    }
}