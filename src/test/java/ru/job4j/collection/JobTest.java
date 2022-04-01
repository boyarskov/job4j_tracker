package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;


import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void sortNameDown() {
        Comparator<Job> cmpNameDown = new JobDescByName();
        int rsl = cmpNameDown.compare(
                new Job("Boris", 0),
                new Job("Artem", 1)
        );
        assertThat(rsl, lessThan(0));
}

    @Test
    public void sortNameUp() {
        Comparator<Job> cmpNameUp = new JobDescByNameUp();
        int rsl = cmpNameUp.compare(
                new Job("Boris", 0),
                new Job("Artem", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void sortPriorityDown() {
        Comparator<Job> cmpPriorityDown = new JobDescByPriority();
        int rsl = cmpPriorityDown.compare(
                new Job("Boris", 0),
                new Job("Artem", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void sortPriorityUp() {
        Comparator<Job> cmpPriorityUp = new JobDescByPriorityUp();
        int rsl = cmpPriorityUp.compare(
                new Job("Boris", 0),
                new Job("Artem", 1)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}