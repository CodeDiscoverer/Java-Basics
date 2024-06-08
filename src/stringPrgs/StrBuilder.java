package stringPrgs;

public class StrBuilder {
    public static void main(String[] args) {

        StringBuilder SB = new StringBuilder("Boo");
        System.out.println(SB);

        SB.append(" Hello");
        System.out.println(SB);

        SB = new StringBuilder("NULL");
        System.out.println(SB);

        for(int i=0; i<10000000; i++){
            SB.append("Hello ");
        }

        System.out.println(System.currentTimeMillis());

    }
}

