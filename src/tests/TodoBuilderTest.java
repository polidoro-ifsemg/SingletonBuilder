package tests;

import classes.Todo;
import classes.TodoBuilder;
import org.junit.jupiter.api.Test;
import singleton.User;

import static org.junit.jupiter.api.Assertions.*;

class TodoBuilderTest {
    @Test
    void mustThrowExceptionToDoWithoutTitle() {
        try {
            TodoBuilder todoBuilder = new TodoBuilder();
            Todo todo = todoBuilder
                    .setDescription("Comprar material limpeza")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("To-do deve conter um título", e.getMessage());
        }
    }

    @Test
    void mustReturnUserName() {
        User.getInstance().setUserName("Nome Sobrenome");

        TodoBuilder todoBuilder = new TodoBuilder();
        Todo todo = todoBuilder
                .setTitle("Livros recomendados")
                .setList("Caçador de pipas")
                .setList("O Historiador")
                .build();
        assertEquals("Nome Sobrenome", todo.getUser());
    }

    @Test
    void mustBeValidToDo() {
        TodoBuilder todoBuilder = new TodoBuilder();
        Todo todo = todoBuilder
                .setTitle("Compras viagem")
                .setList("protetor solar")
                .setList("guarda sol")
                .build();

        assertNotNull(todo);
    }
}