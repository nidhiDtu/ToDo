package com.example.user.todo;

/**
 * Created by user on 6/25/2018.
 */

public class ToDoItem {
    private String title;
    private String textBody;

    public ToDoItem(String title, String textBody) {
        this.title = title;
        this.textBody = textBody;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }
}
