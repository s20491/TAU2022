package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Todo {
    public List<String> getTodos() {
        return Arrays.asList("upperCase TEST", "lowerCase test", "Test", "Another Test");
    }
    public List<String> getFilteredTodoList() {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> allTodos = getTodos();
        for (String todo : allTodos) {
            if (todo.contains("Test")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}