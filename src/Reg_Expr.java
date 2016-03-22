
/*
 * @author AleX
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Reg_Expr
{
    public static void main(String[] args) throws FileNotFoundException{
    	Match match = new Match();
        String[] a = new String[4];
        Scanner b = new Scanner(new File ("1.txt"));
        int i = 0, x = 0, y = 0, z = 0;
        System.out.println("Lines:\n");
        while(b.hasNext())
        {
        a[i] = b.nextLine();
        System.out.println(a[i]);
        z = match.match(a[x]);
        y += z;
        x++;
        System.out.println("Matches in " +x + " line: " + z + "\n");
        z = 0;
        i++;
        }
        System.out.println("\nMatches in whole text: " + y);   
        b.close();
    }
    
}
