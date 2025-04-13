package edu.rit.swen352.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test suite for the {@link MyList} component.
 */
class MyListTest {
    @Test
    void constructor(){
        assertDoesNotThrow(() -> new MyList<String>("First", "Second", "Third"));
    }

    @Test
    void getWorking(){
        MyList<String> list = new MyList<String>("First", "Second", "Third");
        assertEquals("Second", list.get(1));
    }

    @Test
    void getError(){
        MyList<String> list = new MyList<String>("First", "Second", "Third");
        assertThrows(java.util.NoSuchElementException.class, () -> list.get(5));
    }

    @Test
    void addWorking(){
        MyList<String> list = new MyList<String>("First", "Second", "Third");
        list.add("Fourth");
        assertEquals("Fourth", list.get(3));
    }

    @Test
    void addNop(){
        MyList<String> list = new MyList<String>("First", "Second", "Third");
        list.add("Third");
        assertThrows(java.util.NoSuchElementException.class, () -> list.get(3));
    }

    @Test
    void remove(){
        MyList<String> list = new MyList<String>("First", "Second", "Third");
        list.remove("Second");
        assertEquals("Third", list.get(1));
    }
}
