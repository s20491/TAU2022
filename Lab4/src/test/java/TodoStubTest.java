import org.example.Todo;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoStubTest {
    @Test
    public void size_of_filtered_todo_list_should_be_equal_2() {
        Todo myTodoList = new Todo();
        List<String> todos = myTodoList.getFilteredTodoList();
        assertEquals(2, todos.size());
    }
}