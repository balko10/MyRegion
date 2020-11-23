package com.myregion.entities;

/**
 * Created by Alexander Crepaz on 23.11.2020.
 */

public class Favorite {

    private Long id;

    private User user;

    private Store store;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
