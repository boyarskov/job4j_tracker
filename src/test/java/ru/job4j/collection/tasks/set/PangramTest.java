package ru.job4j.collection.tasks.set;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PangramTest {
    @Test
    public void checkString() {
        String str = "Jackdaws love my big sphinx of quartz";
        boolean b = Pangram.checkString(str);
        assertThat(b, is(true));
    }

    @Test
    public void checkStringNot() {
        String str = "Jckdws love my big sphinx of qurtz";
        boolean b = Pangram.checkString(str);
        assertThat(b, is(false));
    }
}
