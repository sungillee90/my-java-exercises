package practice.TemplateFactory.concrete;

import practice.TemplateFactory.framework.Item;
import practice.TemplateFactory.framework.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("Use DataBase to grab HP info");
    }

    @Override
    protected void createItemLog() {
        System.out.println("Created HP potion" + new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
