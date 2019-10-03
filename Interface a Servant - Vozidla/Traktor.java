/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code Traktor} představují ...
 * The {@code Traktor} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Traktor implements IOvládáníMotoru, IOvládáníPolohy
{
//\CC== CONSTANT CLASS (STATIC) ATTRIBUTES (FIELDS) ============================
//\CV== VARIABLE CLASS (STATIC) ATTRIBUTES (FIELDS) ============================
boolean beziMotor;
int xPos;
boolean hydraulika;


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
    public Traktor()
    {
        beziMotor = false;
        xPos = 0;
        hydraulika = true;
    }

        public void nastartuj()
    {
        beziMotor = true;
    }
    
    public void vypni()
    {
        beziMotor = false;
    }
    
    public boolean getBezi()
    {
        return this.beziMotor;
    }

    public void zapniHydrauliku()
    {
        hydraulika = true;
    }
    
    public void vypniHydrauliku()
    {
        hydraulika = false;
    }
    
    public void pohybuj(int x)
    {
        xPos = xPos + x;
    }
    
    public int getPoloha()
    {
        return this.xPos;
    }
//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================
}
