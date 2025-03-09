package org.example.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testCreateCustomer() {
        Customer customer = new Customer("007","Christoffer","Morales", "Kista", "Christoffer@gmail.com");
        assertEquals("007", customer.getId());
        assertEquals("Christoffer", customer.getFirstname());
        assertEquals("Kista", customer.getAddress());
        assertEquals("Christoffer@gmail.com", customer.getEmail());
    }
    }
