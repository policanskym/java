/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Dům} představují ...
 * The {@code Dům} class instances represent ...
 *
 * @author  ₥₱
 * @version 0.00.0001 — 2019-09-12
 */
public class Dům
{
//\CC== CONSTANT CLASS (STATIC) ATTRIBUTES (FIELDS) ============================
   // public static final sirka
//\CV== VARIABLE CLASS (STATIC) ATTRIBUTES (FIELDS) ============================



//##############################################################################
//\CI== STATIC INITIALIZER (CLASS CONSTRUCTOR) =================================
//\CG== CLASS (STATIC) GETTERS AND SETTERS =====================================
//\CM== OTHER NON-PRIVATE CLASS (STATIC) METHODS ===============================
//\CP== PRIVATE AND AUXILIARY CLASS (STATIC) METHODS ===========================



//##############################################################################
//\IC== CONSTANT INSTANCE ATTRIBUTES (FIELDS) ==================================
//\IV== VARIABLE INSTANCE ATTRIBUTES (FIELDS) ==================================



//##############################################################################
//\II== CONSTRUCTORS AND FACTORY METHODS =======================================

    /***************************************************************************
     */
    public Dům()
    {
        Obdélník komin = new Obdélník(50,25,20,50,Barva.ŠEDÁ);
        Trojúhelník strecha = new Trojúhelník(40,15,100,60,Barva.ČERVENÁ);
        Obdélník zed = new Obdélník(50,75,80,80,Barva.CIHLOVÁ);
        Elipsa horniOkno = new Elipsa(80,45,20,20,Barva.MODRÁ);
        Obdélník dolniOkno1 = new Obdélník(60,85,26,25,Barva.AZUROVÁ);
        Obdélník dolniOkno2 = new Obdélník(95,85,26,25,Barva.AZUROVÁ);
        Obdélník dvere = new Obdélník(80,115,20,40,Barva.HNĚDÁ);
        Elipsa klika = new Elipsa(81,135,5,5,Barva.ZLATÁ);
    }
    
    public Dům(int x, int y)
    {
       Obdélník komin = new Obdélník(50+x,25+y,20,50,Barva.ŠEDÁ);
        Trojúhelník strecha = new Trojúhelník(40+x,15+y,100,60,Barva.ČERVENÁ);
        Obdélník zed = new Obdélník(50+x,75+y,80,80,Barva.CIHLOVÁ);
        Elipsa horniOkno = new Elipsa(80+x,45+y,20,20,Barva.MODRÁ);
        Obdélník dolniOkno1 = new Obdélník(60+x,85+y,26,25,Barva.AZUROVÁ);
        Obdélník dolniOkno2 = new Obdélník(95+x,85+y,26,25,Barva.AZUROVÁ);
        Obdélník dvere = new Obdélník(80+x,115+y,20,40,Barva.HNĚDÁ);
        Elipsa klika = new Elipsa(81+x,135+y,5,5,Barva.ZLATÁ); 
    }
    
    public Dům(int x, int y, Barva barvaKomin, Barva barvaStrecha, Barva barvaZed, Barva barvaHorniOkno, Barva barvaDolniOkna, Barva barvaDvere, Barva barvaKlika)
    {
       Obdélník komin = new Obdélník(50+x,25+y,20,50,barvaKomin);
        Trojúhelník strecha = new Trojúhelník(40+x,15+y,100,60,barvaStrecha);
        Obdélník zed = new Obdélník(50+x,75+y,80,80,barvaZed);
        Elipsa horniOkno = new Elipsa(80+x,45+y,20,20,barvaHorniOkno);
        Obdélník dolniOkno1 = new Obdélník(60+x,85+y,26,25,barvaDolniOkna);
        Obdélník dolniOkno2 = new Obdélník(95+x,85+y,26,25,barvaDolniOkna);
        Obdélník dvere = new Obdélník(80+x,115+y,20,40,barvaDvere);
        Elipsa klika = new Elipsa(81+x,135+y,5,5,barvaKlika);
    }
    
//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================
}
