import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        sdf.parse("2014/02/29");
        System.out.println(sdf.parse("2014/02/29").toString());
    }
}
