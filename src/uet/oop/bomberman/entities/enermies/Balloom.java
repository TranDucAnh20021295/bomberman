package uet.oop.bomberman.entities.enermies;

import java.util.Random;

import javafx.scene.image.Image;

public class Balloom extends Enemy {
    private Random random = new Random();

    public Balloom(int x, int y, Image img) {
        super(x, y, img, 1); // Tốc độ cố định
    }

    @Override
    public void move() {
        // Di chuyển ngẫu nhiên
        int direction = random.nextInt(4);
        switch (direction) {
            case 0: x += speed; break; // Phải
            case 1: x -= speed; break; // Trái
            case 2: y += speed; break; // Xuống
            case 3: y -= speed; break; // Lên
        }
    }

    @Override
    public void update() {
        move();
    }
}
