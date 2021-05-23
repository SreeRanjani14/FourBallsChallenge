import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int circle1Speed = 0;
    int circle2Speed = 0;
    int circle3Speed = 0;
    int circle4Speed = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(circle1Speed, HEIGHT / 5, DIAMETER, DIAMETER);
        circle1Speed++;
    }

    private void drawCircle2() {
        ellipse(circle2Speed, HEIGHT / 4, DIAMETER, DIAMETER);
        circle2Speed += 2;
    }

    private void drawCircle3() {
        ellipse(circle3Speed, HEIGHT / 3, DIAMETER, DIAMETER);
        circle3Speed += 3;
    }

    private void drawCircle4() {
        ellipse(circle4Speed, HEIGHT / 2, DIAMETER, DIAMETER);
        circle4Speed += 4;
    }
}
