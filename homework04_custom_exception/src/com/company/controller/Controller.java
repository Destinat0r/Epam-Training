package com.company.controller;

import com.company.model.Model;
import com.company.model.RecordAlreadyExistException;
import com.company.view.TextConstant;
import com.company.view.View;

import java.util.Scanner;

/**
 * Created by student on 26.09.2017.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook = new InputNoteNoteBook(view, sc);
        promptUntilValidLogin(inputNoteNoteBook);
    }

    private void promptUntilValidLogin(InputNoteNoteBook inputNoteNoteBook) {
        String login = null;
        while (true) {
            try {
                login = inputNoteNoteBook.inputNote();
                model.addNewLogin(login);
                break;
            } catch (RecordAlreadyExistException e) {
                view.printWrongLogin(TextConstant.LOGIN_EXISTS, login);
            }
        }
    }
}
