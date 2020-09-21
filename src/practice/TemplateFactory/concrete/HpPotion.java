package practice.TemplateFactory.concrete;

import practice.TemplateFactory.framework.Item;

public class HpPotion implements Item {
    @Override
    public void use() {
        System.out.println("HP Recovered!");
    }
}
