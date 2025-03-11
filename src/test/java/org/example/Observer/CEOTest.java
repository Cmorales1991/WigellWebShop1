package org.example.Observer;

import org.example.Model.Services.CEO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
