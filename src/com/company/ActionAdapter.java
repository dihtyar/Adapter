package com.company;

import com.company.third.party.Operation;
import com.company.third.party.RadioButton;

public class ActionAdapter implements Action {

    private Operation operation;

    public ActionAdapter(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void action() {
        operation.operate();
    }
}
