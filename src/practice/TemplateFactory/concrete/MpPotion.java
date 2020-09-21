package practice.TemplateFactory.concrete;

import practice.TemplateFactory.framework.Item;

public class MpPotion implements Item {
    @Override
    public void use() {
        System.out.println("MP Recovered!");
    }
}
