//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.intellij.uiDesigner.core;

public final class SupportCode$TextWithMnemonic {
    public final String myText;
    public final int myMnemonicIndex;

    private SupportCode$TextWithMnemonic(String text, int index) {
        if (text == null) {
            throw new IllegalArgumentException("text cannot be null");
        } else if (index == -1 || index >= 0 && index < text.length()) {
            this.myText = text;
            this.myMnemonicIndex = index;
        } else {
            throw new IllegalArgumentException("wrong index: " + index + "; text = '" + text + "'");
        }
    }

    public char getMnemonicChar() {
        if (this.myMnemonicIndex == -1) {
            throw new IllegalStateException("text doesn't contain mnemonic");
        } else {
            return Character.toUpperCase(this.myText.charAt(this.myMnemonicIndex));
        }
    }
}
