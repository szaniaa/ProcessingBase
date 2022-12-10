import processing.core.PApplet;

public class Drop {
    public float x;
    public float y;
    public float width;
    public float height;
    public float velocity;

    public Drop(float windowWidth, float windowHeight) {
        x = (float) (Math.random() * windowWidth);
        y = 0f;
        width = 0.01f * windowWidth;
        height = width * 3f;
        velocity = windowHeight / 120f + (windowHeight / 120f / 1.7734f) * (float) Math.random();
    }

    public void draw(PApplet app) {
        app.fill(153, 50, 204);
        app.rect(x, y, width, height);
    }

    public void fly() {
        y += velocity;
    }
}