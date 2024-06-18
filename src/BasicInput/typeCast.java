package BasicInput;

public class typeCast {

    public static void main(String[] args) {

        // Casting float to int
        float f = 10.5f;
        int i = (int)f;
        System.out.println("Float to int:");
        System.out.println("f = " + f); // Prints 10.5
        System.out.println("i = " + i); // Prints 10
        System.out.println();

        // Casting int to float
        int j = 20;
        float g = (float)j;
        System.out.println("Int to float:");
        System.out.println("j = " + j); // Prints 20
        System.out.println("g = " + g); // Prints 20.0
        System.out.println();

        // Casting double to int
        double d = 30.75;
        int k = (int)d;
        System.out.println("Double to int:");
        System.out.println("d = " + d); // Prints 30.75
        System.out.println("k = " + k); // Prints 30
        System.out.println();

        // Casting short to int
        short s = 100;
        int m = (int)s;
        System.out.println("Short to int:");
        System.out.println("s = " + s); // Prints 100
        System.out.println("m = " + m); // Prints 100
        System.out.println();

        // Casting long to int
        long l = 1234567890;
        int n = (int)l;
        System.out.println("Long to int:");
        System.out.println("l = " + l); // Prints 1234567890
        System.out.println("n = " + n); // Prints 1234567890
        System.out.println();

        // Casting String to int
        String str1 = "123";
        int o = Integer.parseInt(str1);
        System.out.println("String to int:");
        System.out.println("str1 = " + str1); // Prints "123"
        System.out.println("o = " + o); // Prints 123
        System.out.println();

        // Casting StringBuilder to String
        StringBuilder sb = new StringBuilder("Hello");
        String str2 = sb.toString();
        System.out.println("StringBuilder to String:");
        System.out.println("sb = " + sb); // Prints "Hello"
        System.out.println("str2 = " + str2); // Prints "Hello"
        System.out.println();

        // Casting StringBuffer to String
        StringBuffer sf = new StringBuffer("World");
        String str3 = sf.toString();
        System.out.println("StringBuffer to String:");
        System.out.println("sf = " + sf); // Prints "World"
        System.out.println("str3 = " + str3); // Prints "World"
    }
}
