package uet.oop.bomberman.entities.enermies;

import javafx.scene.image.Image;
import uet.oop.bomberman.entities.Bomber;

public class Oneal extends Enemy {
    private Bomber bomber;
    private int speedVariation = 1;

    public Oneal(int x, int y, Image img, Bomber bomber) {
        super(x, y, img, 1);
        this.bomber = bomber;
    }

    @Override
    public void move() {
        // Tăng tốc độ ngẫu nhiên
        speed = (int) (Math.random() * 2) + 1;

        // Đuổi theo Bomber
        if (bomber.getX() > this.x) x += speed;
        if (bomber.getX() < this.x) x -= speed;
        if (bomber.getY() > this.y) y += speed;
        if (bomber.getY() < this.y) y -= speed;
    }

    @Override
    public void update() {
        move();
    }
}
