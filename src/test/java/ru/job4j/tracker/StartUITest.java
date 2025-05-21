package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.action.*;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.StubInput;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.nullValue;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new CreateAction(output),
                new ExitAction(output)
        );
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
          new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        List<UserAction> actions = List.of(
                new ReplaceAction(output),
                new ExitAction(output)
        );
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
            Output out = new StubOutput();
            Tracker tracker = new Tracker();
            Item item = tracker.add(new Item("Deleted item"));
            Input in = new StubInput(
                    new String[] {"0", String.valueOf(item.getId()), "1"}
            );
            List<UserAction> actions = List.of(
                new DeleteAction(out),
                new ExitAction(out)
            );
            new StartUI(out).init(in, tracker, actions);
            assertThat(tracker.findById(item.getId()), is(
                    nullValue()
            ));
    }

    @Test
    public void whenExit() {
    Output out = new StubOutput();
    Input in = new StubInput(
            new String[] {"0"}
    );
    Tracker tracker = new Tracker();
    List<UserAction> actions = List.of(
            new ExitAction(out)
    );
    new StartUI(out).init(in, tracker, actions);
    assertThat(out.toString(), is(
            "Menu." + System.lineSeparator()
                    + "0. Exit program" + System.lineSeparator()
                    + "=== Exit program ===" + System.lineSeparator()
    ));
}

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        List<UserAction> actions = List.of(
                new ReplaceAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(),  is(
                "Menu." + ln
                        + "0. Edit item" + ln
                        + "1. Exit program" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu." + ln
                        + "0. Edit item" + ln
                        + "1. Exit program" + ln
                        + "=== Exit program ===" + ln
        ));
    }

    @Test
    public void whenFindByIdActionTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
          new String[] {"0", String.valueOf(one.getId()), "1"}
        );
        List<UserAction> actions = List.of(
                new FindIdAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Find item by id" + ln
                        + "1. Exit program" + ln
                        + "=== Find item by id ===" + ln
                        + one + ln
                        + "Menu." + ln
                        + "0. Find item by id" + ln
                        + "1. Exit program" + ln
                        + "=== Exit program ===" + ln
        ));
    }

    @Test
    public void whenFindByNameActionTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[] {"0", one.getName(), "1"}
        );
        List<UserAction> actions = List.of(
                new FindNameAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Find items by name" + ln
                        + "1. Exit program" + ln
                        + "=== Find items by name ===" + ln
                        + one + ln
                        + "Menu." + ln
                        + "0. Find items by name" + ln
                        + "1. Exit program" + ln
                        + "=== Exit program ===" + ln
        ));
    }

    @Test
    public void whenShowActionTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        List<UserAction> actions = List.of(
                new ShowAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Show all items" + ln
                        + "1. Exit program" + ln
                        + "=== Show all items ===" + ln
                        + one + ln
                        + "Menu." + ln
                        + "0. Show all items" + ln
                        + "1. Exit program" + ln
                        + "=== Exit program ===" + ln
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"9", "0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Exit program" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu." + ln
                        + "0. Exit program" + ln
                + "=== Exit program ===" + ln
        )
        );
    }

}
