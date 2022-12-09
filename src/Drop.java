import processing.core.PApplet;

public class Drop {
    public float x;
    public float y;
    public float width;
    public float height;
    public float velocity;

    public Drop(float windowX, float windowY) {
        x = (float) (Math.random() * windowX);
        y = 0f;
        width = 0.01f * windowX;
        height = width * 3f;
        velocity = windowY / 120f;
    }

    public void draw(PApplet app) {
        app.fill(153, 50, 204);
        app.rect(x, y, width, height);
    }

    public void fly() {
        y += velocity;
    }

}
