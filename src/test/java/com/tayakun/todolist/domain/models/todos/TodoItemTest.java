package com.tayakun.todolist.domain.models.todos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {

    @Test
    public void Todoに139文字入力できる() {

    }

    @Test
    public void Todoに140文字入力できる() {

    }

    @Test
    public void Todoに141文字するとエラーになる() {

        try {
            new TodoItem("0000000000", false);
        } catch (Exception e) {

        }
    }

    @Test
    public void Todoに何も入力しないとエラーになる() {
        assertThrows(IllegalArgumentException.class, () -> new TodoItem("", false));
    }
}