package practice.TemplateFactory.concrete;

import practice.TemplateFactory.framework.Item;
import practice.TemplateFactory.framework.ItemCreator;

import java.util.Date;

public class MpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("Use DataBase to grab MP info");
    }

    @Override
    protected void createItemLog() {
        System.out.println("Created MP potion" + new Date());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}
