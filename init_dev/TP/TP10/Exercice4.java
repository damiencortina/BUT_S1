import java.awt.Font;

public class Exercice4 {
    public static void main(String[] args) {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(0.5, 0.5, 0.5);
        StdDraw.setPenRadius(convertCoordinate(35));
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.line(convertCoordinate(80), convertCoordinateAndReverse(160), convertCoordinate(80),
                convertCoordinateAndReverse(280));
        StdDraw.arc(convertCoordinate(185), convertCoordinateAndReverse(240), convertCoordinate(45), 180, 0);
        StdDraw.line(convertCoordinate(140), convertCoordinateAndReverse(160), convertCoordinate(140),
                convertCoordinateAndReverse(245));
        StdDraw.line(convertCoordinate(230), convertCoordinateAndReverse(200), convertCoordinate(230),
                convertCoordinateAndReverse(245));
        StdDraw.line(convertCoordinate(290), convertCoordinateAndReverse(110), convertCoordinate(290),
                convertCoordinateAndReverse(245));
        StdDraw.line(convertCoordinate(325), convertCoordinateAndReverse(175), convertCoordinate(290),
                convertCoordinateAndReverse(175));
        StdDraw.arc(convertCoordinate(335), convertCoordinateAndReverse(240), convertCoordinate(45), 180, -90);
        StdDraw.setPenRadius(convertCoordinate(30));
        Font font = new Font("Arial", Font.BOLD, 20);
        StdDraw.setFont(font);
        StdDraw.text(convertCoordinate(275), convertCoordinateAndReverse(325), "Nord");
        Font font2 = new Font("Arial", Font.BOLD, 30);
        StdDraw.setFont(font2);
        StdDraw.text(convertCoordinate(207), convertCoordinateAndReverse(350), "Franche-Comte");
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.point(convertCoordinate(80), convertCoordinateAndReverse(110));
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(convertCoordinate(335), convertCoordinateAndReverse(285));
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(convertCoordinate(230), convertCoordinateAndReverse(160));
        StdDraw.setPenRadius(convertCoordinate(3));
        StdDraw.arc(convertCoordinate(292), convertCoordinateAndReverse(336), convertCoordinate(4), 225, -45); 
    }

    public static Double convertCoordinate(int value) {
        return value / 414.0;
    }

    public static Double convertCoordinateAndReverse(int value) {
        return 1 - (value / 414.0);
    }
}
