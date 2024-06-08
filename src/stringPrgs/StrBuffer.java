package stringPrgs;

public class StrBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Boo");
        System.out.println(sb);

        sb.append(" Hello");
        System.out.println(sb);

        for(int i=0; i<10000000; i++){
            sb.append("Hello ");
        }

        System.out.println(System.currentTimeMillis());

    }
}
