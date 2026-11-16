public class Exercice5 {

    static Double[] currentPosition = { 0.0, 0.0 };

    public static void main(String[] args) {
        String gcode = """
                S0
                G0 1.0 1.0
                S1000
                G1 2.0 1.0
                G1 2.0 2.0
                G1 1.0 2.0
                G1 1.0 1.0
                S0
                G0 3.0 3.0
                S1000
                G1 13.0 3.0
                G1 13.0 13.0
                G1 3.0 13.0
                G1 3.0 3.0
q                """;
        String[] instructions = gcode.split("[\n]");
        for (int i = 0; i < instructions.length; i++) {
            readInstruction(instructions[i]);
        }
    }

    public static void readInstruction(String instruction) {
        String[] instructionParts = instruction.split(" ");
        switch (instructionParts[0]) {
            case "S0":
                StdDraw.setPenRadius(0.002);
                break;
            case "S1000":
                StdDraw.setPenRadius(0.005);
                break;
            case "G0":
                StdDraw.setPenColor(StdDraw.YELLOW);
                drawAndUpdatePosition(Double.valueOf(instructionParts[1]), Double.valueOf(instructionParts[2]));
                break;
            case "G1":
                StdDraw.setPenColor(StdDraw.BLACK);
                drawAndUpdatePosition(Double.valueOf(instructionParts[1]), Double.valueOf(instructionParts[2]));
                break;
            default:
                System.out.println("Pas compris : " + instruction);
        }
    }

    public static void drawAndUpdatePosition(Double x, Double y) {
        StdDraw.line(convertCoordinate(currentPosition[0]), convertCoordinate(currentPosition[1]),
                convertCoordinate(x),
                convertCoordinate(y));
        currentPosition[0] = x;
        currentPosition[1] = y;
    }

    public static Double convertCoordinate(Double value) {
        return value / 40.0;
    }
}
