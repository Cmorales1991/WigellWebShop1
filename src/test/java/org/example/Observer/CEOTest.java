package org.example.Observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CEOTest {
    CEO ceo;

    @BeforeEach
    void setUp() {
        ceo = new CEO();
    }

    @Test
    void testUpdate() {
        ceo.updateOrder("Testmeddelande");

        assertThat("VD: Testmeddelande");
    }
}
