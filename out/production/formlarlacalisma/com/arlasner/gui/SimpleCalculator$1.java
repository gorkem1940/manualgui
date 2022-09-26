//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.arlasner.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleCalculator$1 implements ActionListener {
    SimpleCalculator$1(SimpleCalculator this$0) {
        this.this$0 = this$0;
    }

    public void actionPerformed(ActionEvent e) {
        String firstNumber = SimpleCalculator.access$000(this.this$0).getText().trim();
        String secondNumber = SimpleCalculator.access$100(this.this$0).getText().trim();
        Double result = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
        SimpleCalculator.access$200(this.this$0).setText(result.toString());
    }
}
