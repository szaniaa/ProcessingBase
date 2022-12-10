import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class App extends PApplet {
    List<Drop> drops = new ArrayList<>();

    @Override
    public void settings() {
        size(800, 800);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        if (drops.size() < 400) {
            drops.add(new Drop(width, height));
        }

        for (Drop d : drops) {
            d.fly();
            if (d.y > height) {
                d.y = -d.height;
            }
        }

        background(color(33, 33, 33));
        for (Drop d : drops) {
            d.draw(this);
        }
    }
}