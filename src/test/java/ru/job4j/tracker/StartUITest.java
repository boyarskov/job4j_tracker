package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class StartUITest {
/*
    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
          new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
          new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

 */
@Test
public void whenExit() {
    Output out = new StubOutput();
    Input in = new StubInput(
            new String[] {"0"}
    );
    Tracker tracker = new Tracker();
    UserAction[] actions = {
            new ExitAction(out)
    };
    new StartUI(out).init(in, tracker, actions);
    assertThat(out.toString(), is(
            "Menu."
                    + System.lineSeparator()
                    + "0.Exit Program"
                    + System.lineSeparator()
                    + "Exit Program"
                    + System.lineSeparator()
    ));
}

/*
    Вывод в консоль мы заменяем интерфейсом Output.

   Метод append() — обновляет значение объекта, который вызвал метод.
   Этот метод в Java принимает boolean, char, int, long, Strings и т.д.

    Консольный вывод ConsoleOutput
    */
}
