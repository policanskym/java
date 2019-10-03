/*******************************************************************************
 * Instance třídy {@code Dům} představují ...
 * The {@code Dům} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Dům
{
    /***************************************************************************
     */
    public Dům()
    {
    }
    public static class Půda
    {
        public static int početOken = 2;
    }
    public static class Poschodí
    {
        public static int početPoschodí = 1;
        
        public static void PřidatPoschodí()
        {
            početPoschodí = početPoschodí + 1;
        }
        
        public static void OdebratPoschodí()
        {
            if(početPoschodí <= 1)
            {
                System.out.println("Už nelze odebrat více poschodí.");
                if(početPoschodí < 1)
                {
                    početPoschodí = 1;
                }
            }
            else
            {
                početPoschodí = početPoschodí - 1;
            }
        }
    }
    public static class Suterén
    {
        public static int početMístností = 5;
    }
 }
