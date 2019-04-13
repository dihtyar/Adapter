package com.company;

import com.company.third.party.RadioButton;

public class Main {

    public static void main(String[] args) {
        Action action = new ActionAdapter(new RadioButton());
        action.action();
    }
}
