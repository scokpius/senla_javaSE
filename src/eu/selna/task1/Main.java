package eu.selna.task1;

public class Main {

    static byte gb = 15;
    static short gs = 165;
    static int gi = 232;
    static long gl = 151494;
    static float gf = 5.25f;
    static double gd = 852.0;
    static boolean gbool = true;
    static char gc ='G';

    static String gstring = "hello world";
    static String gstring1 = new String("hello world");
    static Byte gByte = gb;
    static Short gShort = new Short(gs);
    static Integer gInt = gi;
    static Long gLong = gl;
    static Float gFloat = gf;
    static Double gDouble = gd;
    static Boolean gBoolean = gbool;
    static Character gChar = gc;

    public static void main(String[] args) {
        byte b = 12;
        short s = 135;
        int i = 185;
        long l = 198794;
        float f = 36.25f;
        double d = 352.36;
        boolean bool = true;
        char c ='z';

        String string = "hello world";
        String string1 = new String("hello world"); //
        Byte bByte = new Byte(b);
        Short sShort = new Short(s);
        Integer iInt = new Integer(i);
        Long lLong = new Long(l);
        Float fFloat = new Float(f);
        Double dDouble = new Double(d);
        Boolean bBoolean = new Boolean(bool);
        Character cChar = new Character(c);

        printGlobalDataTypes();
        System.out.println("byte = " + b + "   short = " + s + "   int = " + i + "   long = " + l + "   float = " + f +
                "   doable = " + d + "   boolean = " + bool + "   char = " + c + "   String = " + string +
                "   Byte = " + bByte + "   Short = " + sShort + "   Integer = " + iInt + "   Long = " + lLong +
                "   Float = " + fFloat + "   Double = " + dDouble + "   Boolean = " + bBoolean +
                "   Character = " + cChar);
//      printDataTypes();  does not work since local variables are visible only in the method in which they were defined
//                         can work if the method is parameterized for example printDataTypes(byte ab, ... , Byte aByte,
//                         ...)


        System.out.println(gb=b);

/*      asks to cast to type
        System.out.println(gb=s);
        System.out.println(gb=i);
        System.out.println(gb=l);
        System.out.println(gb=f);
        System.out.println(gb=d);
        System.out.println(gb=bool);
        System.out.println(gb=с);
         System.out.println(b=gShort);*/
        System.out.println(b=gByte);

        System.out.println(gb=(byte) f);
/*      due to the fact that min -128 and max 127 converts large numbers incorrectly
        System.out.println(gb=(byte) s);
        System.out.println(gb=(byte) i);
        System.out.println(gb=(byte) l);
        System.out.println(gb=(byte) d);*/

//      System.out.println(gb=(byte) bool); boolean cannot to be converted to byte
        System.out.println(gb=(byte) c); // results in a numeric value
//      System.out.println(gb=(byte) gInt); cannot be cast to this type

        System.out.println(cChar = gChar);

        System.out.println(cChar == gChar);
        System.out.println(gb == gByte);
        System.out.println(gInt.equals(gi));
        System.out.println(string == string1); // the variables themselves are compared
        System.out.println(string.equals(string1)); // the values ​​of the variables are compared

        System.out.println(d = fFloat);
        System.out.println(f = dDouble.floatValue());
        System.out.println(f = iInt.floatValue());
        System.out.println(l = iInt.longValue());
        System.out.println(i = dDouble.intValue());
        System.out.println(s = fFloat.shortValue());
        System.out.println(string = dDouble.toString());
        System.out.println(d = Double.parseDouble(string));
        System.out.println(string = iInt.toString());
        System.out.println(lLong = Long.valueOf(string));


        Number number = new Number();
        printClassNumber(number);
        setClassNumber(number);
        printClassNumber(number);
    }
  /*  the method is called in the Main class
   private static void printDataTypes(){
        System.out.println("byte = " + b + "   short = " + s + "   int = " + i + "   long = " + l + "   float = " + f +
                "   doable = " + d + "   boolean = " + bool + "   char = " + c + "   String = " + string +
                "   Byte = " + bByte + "   Short = " + sShort + "   Integer = " + iInt + "   Long = " + lLong +
                "   Float = " + fFloat + "   Double = " + dDouble + "   Boolean = " + bBoolean +
                "   Character = " + cChar);
    }*/
    private static void printGlobalDataTypes(){
        System.out.println("byte = " + gb + "   short = " + gs + "   int = " + gi + "   long = " + gl +
                "   float = " + gf + "   doable = " + gd + "   boolean = " + gbool + "   char = " + gc +
                "   String = " + gstring + "   Byte = " + gByte + "   Short = " + gShort + "   Integer = " + gInt +
                "   Long = " + gLong + "    Float = " + gFloat + "   Double = " + gDouble +
                "   Boolean = " + gBoolean + "    Character =" + gChar);
    }
    private static void printClassNumber(Number number){
        System.out.println("   byte = " + number.getB() +
                "    short = " + number.getS() +
                "    int = " + number.getI() +
                "    long = " + number.getL() +
                "    float = " + number.getF() +
                "    doable = " + number.getD() +
                "    boolean = " + number.getBool() +
                "    char = " + number.getC() +
                "    String = " + number.getString() +
                "    Byte = " + number.getBByte() +
                "    Short = " + number.getSShort() +
                "    Integer = " + number.getIInt() +
                "    Long =" + number.getLLong() +
                "    Float = " + number.getFFloat() +
                "    Double = " + number.getDDouble() +
                "    Boolean = " + number.getBBoolean() +
                "    Character =" + number.getCChar());
    }
    private static void setClassNumber(Number number) {
        number.setB((byte) 12);
        number.setS((short) 135);
        number.setI(185);
        number.setL(198794);
        number.setF(36.25f);
        number.setD(352.36);
        number.setBool(true);
        number.setC('g');
        number.setString("hello world");
        number.setBByte(number.getB());
        number.setSShort(number.getS());
        number.setIInt(number.getI());
        number.setLLong(number.getL());
        number.setFFloat(number.getF());
        number.setDDouble(number.getD());
        number.setBBoolean(number.getBool());
        number.setCChar('h');
    }
}
