import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Match {
	public int match(String str)
    { 
        Pattern p = Pattern.compile("[a-z]{1}[a-z0-9]+[a-z]{1}\\s\\s\\s[a-z]{1}[a-z0-9]+[a-z]{1}");  
        Matcher m = p.matcher(str);
        boolean r;
        r = m.find();
        int a = 0;
        while (r)
        {
            a++;
            r = m.find();
        }
        return a;  
    }  
}
