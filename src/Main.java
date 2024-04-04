import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String amt = "343537813311218454234234234";
//        System.out.println(Double.parseDouble(amt));
//        System.out.println(DecimalFormat.parse(amt));
        BigDecimal bd = parse(amt);
        System.out.println(bd);
        HashMap<String,String> hm = new HashMap<>();
        hm.put("sdf","ewre");
        hm.put("wer","xcvx");
        System.err.println(hm.keySet() + " " + hm.values());
    }

    private static BigDecimal parse(String amt) {
        return new BigDecimal(amt);

    }
}
