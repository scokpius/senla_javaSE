package eu.selna.task2;

public class Rainbow {
    public static final String color1 = "RED";
    public static final String color2 = "ORANGE";
    public static final String color3 = "YELLOW";
    public static final String color4 = "GREEN";
    public static final String color5 = "SKY_BLUE";
    public static final String color6 = "BLUE";
    public static final String color7 = "PURPLE";

    public Rainbow() {
        System.out.println("To display the colors of the rainbow, " +
                "enter numbers from 1 to 7 separated by a space and press ENTER.\n" +
                " 1 = RED\n" +
                " 2 = ORANGE\n" +
                " 3 = YELLOW\n" +
                " 4 = GREEN\n" +
                " 5 = SKY_BLUE\n" +
                " 6 = BLUE\n" +
                " 7 = PURPLE");

        System.out.println("To display the half-colors of the rainbow, " +
                "enter two digit numbers from the range of colors provided.");
    }
    private static String selectionColor(int color){
        switch (color){
            case 1: return color1;
            case 2: return color2;
            case 3: return color3;
            case 4: return color4;
            case 5: return color5;
            case 6: return color6;
            case 7: return color7;
            default: return "NO THAT COLOR!";
        }
    }
    private String setColor(Integer color){
        String half_color;
        int part1 = 0;
        int part2 = 0;
        if (color<10){
            return selectionColor(color);
        }else {
            part1=color/10;
            part2=color%(part1*10);
            half_color = selectionColor(part1)+ "-" + selectionColor(part2);
            return half_color;
        }
    }
    public void printColor(String number){
        System.out.println(setColor(Integer.valueOf(number)));
    }
}
