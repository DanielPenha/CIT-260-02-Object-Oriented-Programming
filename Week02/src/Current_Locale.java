import java.util.Currency;
import java.util.Locale;

public class Current_Locale {
    public static void main(String[] args){
        //Locale correntLocale = Locale.getDefault();
       // System.out.println(correntLocale);
       // System.out.println(correntLocale.getDisplayCountry());
       // System.out.println(correntLocale.getDisplayScript());
        //------------------------------------
        Currency k = Currency.getInstance(Locale.UK);
        System.out.println("Currency code UK = " + k.getCurrencyCode());
        Currency u = Currency.getInstance(Locale.US);
        System.out.println("Currency code US = " + u.getCurrencyCode());
        System.out.println("Dolar: " + u.getSymbol());
    }
}
