class Exercice1 {
    static int[] color = { 0, 0, 0 };

    static Double halfWidth = 1 / 6.0;

    public static void main(String[] args) {
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledSquare(halfWidth, halfWidth, halfWidth);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledSquare(halfWidth * 3, halfWidth, halfWidth);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledSquare(halfWidth * 5, halfWidth, halfWidth);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledRectangle(0.5, halfWidth * 4, 0.25, halfWidth);
        runLoop();
    }

    private static void runLoop() {
        Boolean toggle = false;
        while (true) {
            if (StdDraw.isMousePressed() && !toggle) {
                toggle = true;
                if (StdDraw.mouseY() <= halfWidth * 2) {
                    updateColour();
                } else {
                    resetColour();
                }
            } else if (!StdDraw.isMousePressed()) {
                toggle = false;
            }
        }
    }

    private static void updateColour() {
        if (StdDraw.mouseX() < halfWidth * 2) {
            color[0] += 5;
            System.out.println("Le carré rouge est cliqué");
        } else if (StdDraw.mouseX() < halfWidth * 4) {
            color[1] += 5;
            System.out.println("Le carré vert est cliqué");
        } else {
            color[2] += 5;
            System.out.println("Le carré bleu est cliqué");
        }
        StdDraw.setPenColor(color[0], color[1], color[2]);
        StdDraw.filledRectangle(0.5, halfWidth * 4, 0.25, halfWidth);
    }

    private static void resetColour() {
        color[0] = 0;
        color[1] = 0;
        color[2] = 0;
        StdDraw.setPenColor(color[0], color[1], color[2]);
        StdDraw.filledRectangle(0.5, halfWidth * 4, 0.25, halfWidth);
        System.out.println("Reset");
    }
}