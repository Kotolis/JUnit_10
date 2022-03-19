package storage_example;

import org.junit.After;
import org.junit.Before;
import storage_example.Storage;

public class Annotations {
    @Before
    public void setUp() {
        Storage.addObject("phone", 2);
        Storage.addObject("laptop", 6);
    }

    @After
    public void setUp2() {
        Storage.storage.clear();
    }
}

