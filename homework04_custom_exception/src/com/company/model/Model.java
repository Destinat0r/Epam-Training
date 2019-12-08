package com.company.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 26.09.2017.
 */
public class Model {
    private Set<String> logins = new HashSet<String>() {{
        add("login123");
        add("vasia345");
        add("tonia312");
    }};

    public void addNewLogin(String login) throws RecordAlreadyExistException {
        if (logins.contains(login)) {
            throw new RecordAlreadyExistException();
        }
        logins.add(login);
    }
}
