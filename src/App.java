import processing.core.PApplet;

public class App extends PApplet {
    Drop drop;

    @Override
    public void settings() {
        size(800, 800);
    }

    @Override
    public void setup() {
        drop = new Drop(width, height);
    }

    @Override
    public void draw() {
        drop.fly();
        background(color(33, 33, 33));
        drop.draw(this);
    }
}
