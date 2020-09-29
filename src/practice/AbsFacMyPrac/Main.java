package practice.AbsFacMyPrac;

import practice.AbsFacMyPrac.Mac.MacGuiFac;
import practice.AbsFacMyPrac.abst.Button;
import practice.AbsFacMyPrac.abst.GuiFac;
import practice.AbsFacMyPrac.abst.TextArea;

public class Main {
    public static void main(String[] args) {
        GuiFac fac = new MacGuiFac();
        Button macbuttton = fac.createButton();
        TextArea area = fac.createTextArea();

        macbuttton.click();
        System.out.println(area.getText());
    }
}
