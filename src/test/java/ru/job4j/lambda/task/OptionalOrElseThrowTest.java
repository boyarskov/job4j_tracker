package ru.job4j.lambda.task;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static ru.job4j.lambda.task.OptionalOrElseThrow.*;

public class OptionalOrElseThrowTest {

    @Test
    public void whenFound() {
        OptionalOrElseThrow.User u1 = new OptionalOrElseThrow.User("u1");
        OptionalOrElseThrow.User u2 = new OptionalOrElseThrow.User("u2");
        OptionalOrElseThrow.User u3 = new OptionalOrElseThrow.User("u3");
        assertEquals(u3.getLogin(), OptionalOrElseThrow.orElseThrow(
                List.of(u1, u2, u3), u3.getLogin()
        ).getLogin());
    }

    @Test(expected = OptionalOrElseThrow.UserNotFoundException.class)
    public void whenNotFound() {
        OptionalOrElseThrow.User u1 = new OptionalOrElseThrow.User("u1");
        OptionalOrElseThrow.User u2 = new OptionalOrElseThrow.User("u2");
        OptionalOrElseThrow.User u3 = new OptionalOrElseThrow.User("u3");
        OptionalOrElseThrow.orElseThrow(List.of(u1, u2, u3), "u4");
    }

}
