/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Třída {@code TestDomu} je hlavní třídou projektu,
 * který ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class TestDomu
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        Dům dum1 = new Dům();
        for(int i = 0;i<100;i++)
        {
            dum1.PosunDoprava(2);
            dum1.PosunDoprava(3);
            IO.čekej(50);
        }
        for(int i = 0;i<10;i++)
        {
            dum1.PosunVlevo();
            IO.čekej(50);
        }
    }
}
