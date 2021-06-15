package classes;

import java.time.LocalDateTime;

public class TodoBuilder {
    private Todo todo;

    public TodoBuilder() {
        todo = new Todo();
    }

    public Todo build() {
        if (todo.getTitle() == null ) {
            throw new IllegalArgumentException("To-do deve conter um título");
        }
        setDateRegister(LocalDateTime.now());
        return todo;
    }

    public TodoBuilder setDateRegister(LocalDateTime dateRegister) {
        todo.setDateRegister(dateRegister);
        return this;
    }

    public TodoBuilder setDateUpdate(LocalDateTime dateUpdate) {
        todo.setDateUpdate(dateUpdate);
        return this;
    }

    public TodoBuilder setDateDeadline(LocalDateTime dateDeadline) {
        todo.setDateDeadline(dateDeadline);
        return this;
    }

    public TodoBuilder setTitle(String title) {
        todo.setTitle(title);
        return this;
    }

    public TodoBuilder setDescription(String description) {
        todo.setDescription(description);
        return this;
    }

    public TodoBuilder setList(String list) {
        todo.setList(list);
        return this;
    }
}
