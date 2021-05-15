package com.tayakun.todolist.domain.models.todos;

import lombok.Getter;

@Getter
public class TodoItem {
    private final String content;
    private final boolean isDone;

    public TodoItem(String content, boolean isDone) {

        if (content.length() <= 0) {
            throw new IllegalArgumentException();
        }

        this.content = content;
        this.isDone = isDone;
    }
}
