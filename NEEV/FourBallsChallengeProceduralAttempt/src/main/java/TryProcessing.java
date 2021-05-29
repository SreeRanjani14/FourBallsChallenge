import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private static final int BALL_COUNT = 4;
    private static final int FRAME = 5;
    int[] xPositionOfBall = new int[BALL_COUNT];
    int[] yPositionOfBall = new int[BALL_COUNT];
    int[] unitsPerFrame = new int[BALL_COUNT];

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
        initialSetup();
    }

    private void initialSetup() {
        for (int index = 0; index < BALL_COUNT; index++) {
            xPositionOfBall[index] = 0;
            yPositionOfBall[index] = HEIGHT * (index + 1) / FRAME;
            unitsPerFrame[index] = index + 1;
        }
    }

    @Override
    public void draw() {
        for(int index = 0; index < BALL_COUNT; index++) {
            circle(index);
            movePosition(index);
        }
    }

    private void movePosition(int index) {
        xPositionOfBall[index] += unitsPerFrame[index];
    }

    private void circle(int index) {
        ellipse(xPositionOfBall[index], yPositionOfBall[index], DIAMETER, DIAMETER);
    }
}
