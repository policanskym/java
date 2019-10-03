/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */




/*******************************************************************************
 * Instance třídy {@code ServantProMotor} představují ...
 * The {@code ServantProMotor} class instances represent ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class ServantProMotor
{
//\CC== CONSTANT CLASS (STATIC) ATTRIBUTES (FIELDS) ============================
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
    public ServantProMotor()
    {
    }
    
    public void nastartuj(IOvládáníMotoru vozidlo)
    {
        vozidlo.nastartuj();
    }
       
    public void vypni(IOvládáníMotoru vozidlo)
    {
        vozidlo.vypni();
    }
    
    public void getBezi(IOvládáníMotoru vozidlo)
    {
        if (vozidlo.getBezi())
            System.out.println("Motor u vozidla " + vozidlo + " běží.");
        else
            System.out.println("Motor u vozidla " + vozidlo + " neběží.");
    }

//\IA== ABSTRACT METHODS =======================================================
//\IG== INSTANCE GETTERS AND SETTERS ===========================================
//\IM== OTHER NON-PRIVATE INSTANCE METHODS =====================================
//\IP== PRIVATE AND AUXILIARY INSTANCE METHODS =================================



//##############################################################################
//\NT== NESTED DATA TYPES ======================================================
}
