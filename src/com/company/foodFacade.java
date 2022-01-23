package com.company;

import com.company.states.finishedState;
import com.company.states.makingState;
import com.company.states.waitingState;

public class foodFacade {

    final static int WAITING = 0;
    final static int MAKING = 1;
    final static int FINISHED = 2;

    orderState state;
    int count = 0;

    public foodFacade(int count) {
        this.count = count;
            if (count == 0) {
                this.state = new waitingState(this, this.count);
            } else if (count == 1) {
                this.state = new makingState(this, this.count);
            } else if (count == 2) {
                this.state = new finishedState(this, this.count);
            }
    }

    public void changeState(orderState state, int count) {
        this.state = state;
        this.count = count;
    }

    public void foodPicker() {
        this.state.foodPicker();
    }
}
