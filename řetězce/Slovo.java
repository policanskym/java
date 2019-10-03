
public class Slovo
{
    public Slovo(String slovo)
    {
        dejPlural(slovo);
    }
    
    public static void dejPlural(String slovo)
    {
        boolean maes = jeKonecEs(slovo);
        boolean maY = maY(slovo);
        boolean maYSeSamohlaskou = maYSeSamohlaskou(slovo);
        int delka = slovo.length();
        if (maes)
        {
            slovo = slovo + "es";
        }
        else
        {
           if(maYSeSamohlaskou)
           {
               slovo = slovo + "es";
           }
           else
           {
               if(maY)
               {
                   StringBuilder slovo2 = new StringBuilder(slovo);
                   slovo2.setCharAt(slovo.length()-1,'i');
                   slovo = slovo2 + "es";
               }
               else
               {
                   slovo = slovo + "s";
               }
           }
        }
        System.out.println(slovo);
    }
    
    public static boolean jeKonecEs(String slovo)
    {
        boolean maes;
        int delka = slovo.length();
        char posledniznak = slovo.charAt(delka-1);
        char predposledniznak = slovo.charAt(delka-2);
        if(posledniznak == 's' || posledniznak == 'x')
        {
            maes = true;
        }
        else
        {
            if(posledniznak == 'h')
            {
                if(predposledniznak == 's' || predposledniznak == 'c')
                {
                    maes = true;
                }
                else
                {
                    maes = false;
                }
            }
            else
            {
                maes = false;
            }
        }
        return maes;
    }
    
    public static boolean maY(String slovo)
    {
       boolean maY; 
       int delka = slovo.length();
       char posledniznak = slovo.charAt(delka-1);
       if(posledniznak == 'y')
       {
           maY = true;
       }
       else
       {
           maY = false;
       }
       return maY;
    }
    
    public static boolean maYSeSamohlaskou(String slovo)
    {
        boolean maYSeSamohlaskou = true;
        int delka = slovo.length();
        char posledniznak = slovo.charAt(delka-1);
        char predposledniznak = slovo.charAt(delka - 2);
        if(posledniznak == 'y')
        {
            if(predposledniznak == 'a' || predposledniznak == 'e' || predposledniznak == 'i' || predposledniznak == 'o' || predposledniznak == 'u')
            {
                maYSeSamohlaskou = true;
            }
            else
            {
                maYSeSamohlaskou = false;
            }
        }
        return maYSeSamohlaskou;
    }
}
