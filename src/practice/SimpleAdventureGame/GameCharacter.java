package practice.SimpleAdventureGame;

public class GameCharacter {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println("Choose your weapon first!");
        } else {
            // delegate
            weapon.attack();
        }
    }

}
