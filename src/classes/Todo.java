package classes;

import singleton.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Todo {
    private LocalDateTime dateRegister;
    private LocalDateTime dateUpdate;
    private LocalDateTime dateDeadline;
    private String user;
    private String title;
    private String description;
    private ArrayList<String> list;

    public Todo() {
        this.list = new ArrayList<String>();
    }

    public Todo setDateRegister(LocalDateTime dateRegister) {
        this.dateRegister = dateRegister;
        return this;
    }

    public Todo setDateUpdate(LocalDateTime dateUpdate) {
        this.dateUpdate = dateUpdate;
        return this;
    }

    public Todo setDateDeadline(LocalDateTime dateDeadline) {
        this.dateDeadline = dateDeadline;
        return this;
    }

    public Todo setUser(String user) {
        this.user = user;
        return this;
    }

    public Todo setTitle(String title) {
        this.title = title;
        return this;
    }

    public Todo setDescription(String description) {
        this.description = description;
        return this;
    }

    public Todo setList(String list) {
        this.list.add(list);
        return this;
    }

    public String getUser() {
        return user = User.getInstance().getUserName();
    }

    public LocalDateTime getDateRegister() {
        return dateRegister;
    }

    public LocalDateTime getDateUpdate() {
        return dateUpdate;
    }

    public LocalDateTime getDateDeadline() {
        return dateDeadline;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getList() {
        return list;
    }


}
