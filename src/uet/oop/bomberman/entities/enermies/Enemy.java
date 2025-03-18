package uet.oop.bomberman.entities.enermies;

import javafx.scene.image.Image;
import uet.oop.bomberman.entities.Entity;

public abstract class Enemy extends Entity {

    protected int speed; // Tốc độ di chuyển

    public Enemy(int x, int y, Image img, int speed) {
        super(x, y, img);
        this.speed = speed;
    }

    public abstract void move();
    
}
