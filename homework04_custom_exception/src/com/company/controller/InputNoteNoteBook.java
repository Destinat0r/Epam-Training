package com.company.controller;

import com.company.view.View;

import java.util.Scanner;

import static com.company.controller.RegexContainer.*;
import static com.company.controller.RegexContainer.REGEX_LOGIN;
import static com.company.view.TextConstant.*;
import static com.company.view.TextConstant.LOGIN_DATA;

public class InputNoteNoteBook {
    private View view;
    private Scanner sc;
    private String login;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public String inputNote() {
        InputReader inputReader = new InputReader(sc, view);
        this.login = inputReader.promptUntilValidInput(LOGIN_DATA, REGEX_LOGIN);
        return login;
    }
}
