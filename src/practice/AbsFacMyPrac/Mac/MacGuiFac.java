package practice.AbsFacMyPrac.Mac;

import practice.AbsFacMyPrac.abst.Button;
import practice.AbsFacMyPrac.abst.GuiFac;
import practice.AbsFacMyPrac.abst.TextArea;

public class MacGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
