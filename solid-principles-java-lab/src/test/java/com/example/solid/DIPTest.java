package com.example.solid.dip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DIPTest {

    @Test
    void shouldProcessOrderWithMySQL() {
        Database database = new MySQLDatabase();
        OrderProcessor processor = new OrderProcessor(database);

        assertDoesNotThrow(() -> processor.processOrder());
    }

    @Test
    void shouldProcessOrderWithMongo() {
        Database database = new MongoDatabase();
        OrderProcessor processor = new OrderProcessor(database);

        assertDoesNotThrow(() -> processor.processOrder());
    }
}
