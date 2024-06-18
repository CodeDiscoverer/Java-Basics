package BasicInput;

public class parseFunction {
    public static void main(String[] args) {

        int intValue = 123;
        String strValue = String.valueOf(intValue);
        System.out.println(strValue);

        strValue = "123";
        intValue = Integer.parseInt(strValue);
        System.out.println(intValue);

        strValue = "1234567890";
        long longValue = Long.parseLong(strValue);
        System.out.println(longValue);

        String hexValue = "1A";
        intValue = Integer.parseInt(hexValue, 16); // Parses hexadecimal "1A" to integer 26
        System.out.println(intValue);

        String binaryValue = "1011";
        intValue = Integer.parseInt(binaryValue, 2); // Parses binary "1011" to integer 11
        System.out.println(intValue);

    }
}
