import java.text.SimpleDateFormat;
import java.util.Locale;

public class Sample {
  public static void main(String[] args) throws Exception {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.JAPAN);
    sdf.parse("2014/02/29");
    System.out.println(sdf.parse("2014/02/29").toString());
  }
}
